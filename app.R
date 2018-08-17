#
# This is a Shiny web application. You can run the application by clicking
# the 'Run App' button above.
#
# Find out more about building applications with Shiny here:
#
#    http://shiny.rstudio.com/
#

library(shiny)
library(shiny)
library(leaflet)

loadData <- function(year, at) {
  db <- dbConnect(MySQL(), dbname ="terrorism", "host" = "127.0.0.1", port = 3306, user = "root", password = "090596")
  
  #query <- sprintf("select latitude, longitude from event join location using (location_id) join attacktype using (attacktype_id) where event.year = %s and attacktype.attacktype_txt like %s limit 50;", year, at)
  query <- sprintf("select latitude, longitude from event join location using (location_id) join attacktype using (attacktype_id) where event.year = %s limit 50;", year)
  
  data <- dbGetQuery(db, query)
  dbDisconnect(db)
  data
}

terrorism <- read.csv('/Users/alexperez/Desktop/Everything/School Stuff/Summer 2 2018/DB/terrorismdb/global_terror.csv', skipNul = TRUE)
r_colors <- rgb(t(col2rgb(colors()) / 255))
names(r_colors) <- colors()

ui <- fluidPage(
  sidebarLayout(
    sidebarPanel(
      sliderInput(
        inputId = "year", label = "Choose a year to display:", min = 1970, max = 2015, value = 1983, sep=""),
      selectInput(
        inputId = "at", label = "Choose a type of attack to display:", choices = c('Assassination',
                                                                                   'Armed Assault',
                                                                                   'Bombing/Explosion',
                                                                                   'Hijacking',
                                                                                   "Hostage Taking (Barricade Incident)",
                                                                                   'Hostage Taking (Kidnapping)',
                                                                                   'Facility/Infrastruct Attack',
                                                                                   'Unarmed Assault',
                                                                                   'Unknown'), selected='Armed Assault'),
      selectInput(
        inputId = "tt", label = "Choose a type of target to display:", choices = c('Business',
                                                                                   'Police',
                                                                                   'Military',
                                                                                   'Abortion Related',
                                                                                   'Airports & Aircraft',
                                                                                   'Government (Diplomatic)',
                                                                                   'Government (General)',
                                                                                   'Educational Institution',
                                                                                   'Food or Water Supply',
                                                                                   'Journalists & Media',
                                                                                   'Maritime',
                                                                                   'NGO',
                                                                                   'Other',
                                                                                   'Private Citizens & Property',
                                                                                   'Religious Figures/Institutions',
                                                                                   'Telecommunication',
                                                                                   'Terrorists/Non-State Militia',
                                                                                   'Tourists',
                                                                                   'Transportation',
                                                                                   'Unknown',
                                                                                   'Utilities',
                                                                                   'Violent Political Party'), selected='Government (General)'),
      selectInput(
        inputId = "wt", label = "Choose a type of weapon to display:", choices = c('Biological',
                                                                                   'Chemical',
                                                                                   'Radiological',
                                                                                   'Firearms',
                                                                                   'Explosives/Bombs/Dynamite',
                                                                                   'Fake Weapons',
                                                                                   'Incendiary',
                                                                                   'Melee',
                                                                                   'Vehicle (not to include vehicle-borne explosives, i.e., car or truck bombs)',
                                                                                   'Sabotage Equipment',
                                                                                   'Other',
                                                                                   'Unknown'), selected='Firearms'),
      checkboxInput("success", "Successful Attack", TRUE),
      checkboxInput("suicide", "Suicide Attack", FALSE),
      checkboxInput("multiple", "Related to Other Incidents", FALSE),
      checkboxInput("doubtterr", "Terrorist Intent Confirmed", TRUE)),
    mainPanel(leafletOutput(outputId = "map"), actionButton("recalc", "Submit new query"))))


server <- function(input, output, session) {
  points <- eventReactive(loadData(input$recalc, input$at), {
    cbind(loadData(input$year, input$at)$longitude, loadData(input$year, input$at)$latitude)
  }, ignoreNULL = TRUE)

  output$map <- renderLeaflet({
    leaflet() %>% addProviderTiles(providers$Stamen.TonerLite,
                       options = providerTileOptions(noWrap = TRUE)) %>% addMarkers(data = points())
  })
}

shinyApp(ui, server)

