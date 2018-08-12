package main;

public class Nationality {
    private int nationality_id;
    private String nationality_txt;

    public Nationality(int nationality_id, String nationality_txt) {
        this.nationality_id = -1;
        this.nationality_txt = nationality_txt;
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "nationality_id=" + nationality_id +
                ", nationality_txt=" + nationality_txt +
                '}';
    }

    public int getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(int nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getNationality_txt() {
        return nationality_txt;
    }

    public void setNationality_txt(String nationality_txt) {
        this.nationality_txt = nationality_txt;
    }
}
