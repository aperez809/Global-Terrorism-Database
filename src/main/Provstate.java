package main;

public class Provstate {
    private int provstate_id;
    private String provstate_name;

    public Provstate(int provstate_id, String provstate_name) {
        this.provstate_id = provstate_id;
        this.provstate_name = provstate_name;
    }

    @Override
    public String toString() {
        return "Provstate{" +
                "provstate_id=" + provstate_id +
                ", provstate_name=" + provstate_name +
                '}';
    }

    public int getProvstate_id() {
        return provstate_id;
    }

    public void setProvstate_id(int provstate_id) {
        this.provstate_id = provstate_id;
    }

    public String getProvstate_name() {
        return provstate_name;
    }

    public void setProvstate_name(String provstate_name) {
        this.provstate_name = provstate_name;
    }
}
