package main;

import database.DBUtils;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class TerrorismMySQL implements TerrorismAPI {

  // need a constructor
  DBUtils dbu;

  @Override
  public Event getEventById(int eventId) {
    return null;
  }

  @Override
  public int insertEvent(Event e) {
    String sql =
        "INSERT INTO event(event_id, year, month, day, doubterr, summary, num_perps, "
            + "location_id, attacktype_id, target_id, weapontype_id) VALUES "
            + "('" + e.getEventId() + "','" + e.getYear() + "','" + e.getMonth()
            + "','" + e.getDay() + "','" + e.isDoubtTerr() + "','" + e.getSummary()
            + "','" + e.getNumPerps() + "','" + e.getLocationId() + "','" + e.getAttacktypeId()
            + "','" + e.getTargetTypeId() + "','" + e.getWeaponTypeId() + "')";
    return dbu.insertOneRecord(sql);
  }

  @Override
  public int getOrInsertAttackType(AttackType a) {
    String sql = "INSERT INTO attacktype(attacktype_id, attacktype_txt) VALUES "
        + "('" + a.getAttacktypeId() + ",'" + a.getAttacktypeTxt() + ")'";
    return dbu.insertOneRecord(sql);
  }

  @Override
  public int getOrInsertCity(City c) {
    return 0;
  }

  @Override
  public int getOrInsertCountry(Country c) {
    return 0;
  }

  @Override
  public int insertEventTarget(EventTarget e) {
    return 0;
  }

  @Override
  public int insertLocation(Location l) {
    return 0;
  }

  @Override
  public int getOrInsertNationality(Nationality n) {
    return 0;
  }

  @Override
  public int insertOutcome(Outcome o) {
    return 0;
  }

  @Override
  public int getOrInsertProvstate(Provstate p) {
    return 0;
  }

  @Override
  public int getOrInsertRegion(Region r) {
    return 0;
  }

  @Override
  public int getOrInsertTarget(Target t) {
    return 0;
  }

  @Override
  public int getOrInsertTargetType(TargetType t) {
    return 0;
  }

  @Override
  public int getOrInsertWeaponType(WeaponType w) {
    return 0;
  }

  @Override
  public void setConnection(String url, String user, String password) {

  }

  @Override
  public void closeConnection() {

  }

}
