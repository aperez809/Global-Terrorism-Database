package main;

public class Location {
    private int location_id;
    private int country_id;
    private int region_id;
    private int provstate_id;
    private int city_id;
    private double latitude;
    private double longitude;


    public Location(int location_id, int country_id, int region_id, int provstate_id, int city_id, double latitude, double longitude) {
        this.location_id = -1;
        this.country_id = country_id;
        this.region_id = region_id;
        this.provstate_id = provstate_id;
        this.city_id = city_id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", country_id=" + country_id +
                ", region_id=" + region_id +
                ", provstate_id=" + provstate_id +
                ", city_id=" + city_id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public int getProvstate_id() {
        return provstate_id;
    }

    public void setProvstate_id(int provstate_id) {
        this.provstate_id = provstate_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
