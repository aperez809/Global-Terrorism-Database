package main;

public class WeaponType {
    private int weapontype_id;
    private String weapontype_txt;

    public WeaponType(int weapontype_id, String weapontype_txt) {
        this.weapontype_id = weapontype_id;
        this.weapontype_txt = weapontype_txt;
    }

    @Override
    public String toString() {
        return "WeaponType{" +
                "weapontype_id=" + weapontype_id +
                ", weapontype_txt=" + weapontype_txt +
                '}';
    }

    public int getWeapontype_id() {
        return weapontype_id;
    }

    public void setWeapontype_id(int weapontype_id) {
        this.weapontype_id = weapontype_id;
    }

    public String getWeapontype_txt() {
        return weapontype_txt;
    }

    public void setWeapontype_txt(String weapontype_txt) {
        this.weapontype_txt = weapontype_txt;
    }
}
