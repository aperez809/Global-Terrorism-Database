package main;

public class TerrorismDB {

  private static TerrorismAPI api = new TerrorismMySQL();

  public static void main(String[] args) throws Exception {

    // Initialize the connection TODO
    api.setConnection("jdbc:mysql://localhost:DRIVER/terrorism", "USER","PASSWORD");

    // Insert an event
    // Exception thrown if event already exists
    System.out.println("Registering a terrorism event...");
    Event e = new Event()
  }
}
