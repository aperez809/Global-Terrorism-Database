package main;

public class TargetType {

  private int targetTypeId;
  private String targetTypeTxt;

    public TargetType(int targetTypeId, String targetTypeTxt) {
        this.targetTypeId = targetTypeId;
        this.targetTypeTxt = targetTypeTxt;
    }

    @Override
    public String toString() {
        return "TargetType{" +
                "targetTypeId=" + targetTypeId +
                ", targetTypeTxt=" + targetTypeTxt +
                '}';
    }

    public int getTargetTypeId() {
        return targetTypeId;
    }

    public void setTargetTypeId(int targetTypeId) {
        this.targetTypeId = targetTypeId;
    }

    public String getTargetTypeTxt() {
        return targetTypeTxt;
    }

    public void setTargetTypeTxt(String targetTypeTxt) {
        this.targetTypeTxt = targetTypeTxt;
    }
}
