package main;

public class TargetType {
    private int targettype_id;
    private String targettype_txt;

    public TargetType(int targettype_id, String targettype_txt) {
        this.targettype_id = targettype_id;
        this.targettype_txt = targettype_txt;
    }

    @Override
    public String toString() {
        return "TargetType{" +
                "targettype_id=" + targettype_id +
                ", targettype_txt=" + targettype_txt +
                '}';
    }

    public int getTargettype_id() {
        return targettype_id;
    }

    public void setTargettype_id(int targettype_id) {
        this.targettype_id = targettype_id;
    }

    public String getTargettype_txt() {
        return targettype_txt;
    }

    public void setTargettype_txt(String targettype_txt) {
        this.targettype_txt = targettype_txt;
    }
}
