package main;

public class Event {
    private int event_id;
    private int year;
    private int month;
    private int day;
    private boolean doubtterr;
    private String summary;
    private int num_perps;
    private int location_id;
    private int attacktype_id;


    public Event(int event_id, int year, int month, int day, boolean doubtterr,
                 String summary, int num_perps, int location_id, int attacktype_id) {

        this.event_id = -1;
        this.year = year;
        this.month = month;
        this.day = day;
        this.doubtterr = doubtterr;
        this.summary = summary;
        this.num_perps = num_perps;
        this.location_id = location_id;
        this.attacktype_id = attacktype_id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event_id=" + event_id +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", doubterr=" + doubtterr +
                ", summary=" + summary +
                ", num_perps=" + num_perps +
                ", location_id=" + location_id +
                ", attacktype_id=" + attacktype_id +
                '}';
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isDoubtterr() {
        return doubtterr;
    }

    public void setDoubtterr(boolean doubtterr) {
        this.doubtterr = doubtterr;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getNum_perps() {
        return num_perps;
    }

    public void setNum_perps(int num_perps) {
        this.num_perps = num_perps;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getAttacktype_id() {
        return attacktype_id;
    }

    public void setAttacktype_id(int attacktype_id) {
        this.attacktype_id = attacktype_id;
    }
}


