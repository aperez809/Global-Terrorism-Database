package main;

public class Provstate {
    private int provstateId;
    private String provstateName;

    public Provstate(int provstateId, String provstateName) {
        this.provstateId = provstateId;
        this.provstateName = provstateName;
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
