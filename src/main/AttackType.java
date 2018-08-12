package main;

public class AttackType {

    private int attacktype_id;
    private String attacktype_txt;


    public AttackType(int attacktype_id, String attacktype_txt) {
        this.attacktype_id = -1;
        this.attacktype_txt = attacktype_txt;
    }

    @Override
    public String toString() {
        return "Country{" +
                "attacktype_id=" + attacktype_id +
                ", attacktype_txt=" + attacktype_txt +
                '}';
    }

    public int getAttacktype_id() {
        return attacktype_id;
    }

    public void setAttacktypeId(int attacktype_id) {
        this.attacktype_id = attacktype_id;
    }

    public String getAttacktype_txt() {
        return attacktype_txt;
    }

    public void setAttacktype_txt(String attacktype_txt) {
        this.attacktype_txt = attacktype_txt;
    }

}

