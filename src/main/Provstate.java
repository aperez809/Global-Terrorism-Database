package main;

public class Provstate {
    private int provstateId;
    private String provstateName;

    public Provstate(int provstate_id, String provstate_name) {
        this.provstateId = provstate_id;
        this.provstateName = provstate_name;
    }

    @Override
    public String toString() {
        return "Provstate{" +
                "provstateId=" + provstateId +
                ", provstateName=" + provstateName +
                '}';
    }

    public int getProvstateId() {
        return provstateId;
    }

    public void setProvstateId(int provstateId) {
        this.provstateId = provstateId;
    }

    public String getProvstateName() {
        return provstateName;
    }

    public void setProvstateName(String provstateName) {
        this.provstateName = provstateName;
    }
}
