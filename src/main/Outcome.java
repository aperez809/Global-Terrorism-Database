package main;

public class Outcome {
    private int event_id;
    private boolean suicide;
    private boolean multiple;
    private boolean success;
    private int num_killed;
    private int num_injured;

    public Outcome(int event_id, boolean suicide, boolean multiple, boolean success, int num_killed, int num_injured) {
        this.event_id = -1;
        this.suicide = suicide;
        this.multiple = multiple;
        this.success = success;
        this.num_killed = num_killed;
        this.num_injured = num_injured;
    }

    @Override
    public String toString() {
        return "Outcome{" +
                "event_id=" + event_id +
                ", suicide=" + suicide +
                ", multiple=" + multiple +
                ", success=" + success +
                ", num_killed=" + num_killed +
                ", num_injured=" + num_injured +
                '}';
    }


    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public boolean isSuicide() {
        return suicide;
    }

    public void setSuicide(boolean suicide) {
        this.suicide = suicide;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getNum_killed() {
        return num_killed;
    }

    public void setNum_killed(int num_killed) {
        this.num_killed = num_killed;
    }

    public int getNum_injured() {
        return num_injured;
    }

    public void setNum_injured(int num_injured) {
        this.num_injured = num_injured;
    }
}
