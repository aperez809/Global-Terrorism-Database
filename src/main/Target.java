package main;

public class Target {
    private int target_id;
    private int targettype_id;
    private String entity_name;
    private String specific_target_name;
    private int nationality_id;

    public Target(int target_id, int targettype_id, String entity_name, String specific_target_name, int nationality_id) {
        this.target_id = target_id;
        this.targettype_id = targettype_id;
        this.entity_name = entity_name;
        this.specific_target_name = specific_target_name;
        this.nationality_id = nationality_id;
    }

    @Override
    public String toString() {
        return "Region{" +
                "target_id=" + target_id +
                ", targettype_id=" + targettype_id +
                ", entity_name=" + entity_name +
                ", specific_target_name=" + specific_target_name +
                ", nationality_id=" + nationality_id +
                '}';
    }

    public int getTarget_id() {
        return target_id;
    }

    public void setTarget_id(int target_id) {
        this.target_id = target_id;
    }

    public int getTargettype_id() {
        return targettype_id;
    }

    public void setTargettype_id(int targettype_id) {
        this.targettype_id = targettype_id;
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    public String getSpecific_target_name() {
        return specific_target_name;
    }

    public void setSpecific_target_name(String specific_target_name) {
        this.specific_target_name = specific_target_name;
    }

    public int getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(int nationality_id) {
        this.nationality_id = nationality_id;
    }
}
