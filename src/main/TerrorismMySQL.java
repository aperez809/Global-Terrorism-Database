package main;

import database.DBUtils;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class TerrorismMySQL implements TerrorismAPI {

  // need a constructor

  @Override
  public Event getEventById(int eventId) {
    return null;
  }

  @Override
  public int insertEvent(Event event) {
    return 0;
  }

  @Override
  public int getOrInsertAttackType(AttackType attackType) {
    return 0;
  }

  @Override
  public int getOrInsertCity(City city) {
    return 0;
  }

  @Override
  public int getOrInsertCountry(Country country) {
    return 0;
  }

  @Override
  public int insertEventTarget(EventTarget eventTarget) {
    return 0;
  }

  @Override
  public int insertLocation(Location location) {
    return 0;
  }

  @Override
  public int getOrInsertNationality(Nationality nationality) {
    return 0;
  }

  @Override
  public int insertOutcome(Outcome outcome) {
    return 0;
  }

  @Override
  public int getOrInsertProvstate(Provstate provstate) {
    return 0;
  }

  @Override
  public int getOrInsertRegion(Region region) {
    return 0;
  }

  @Override
  public int getOrInsertTarget(Target target) {
    return 0;
  }

  @Override
  public int getOrInsertTargetType(TargetType targetType) {
    return 0;
  }

  @Override
  public int getOrInsertWeaponType(WeaponType weaponType) {
    return 0;
  }

  @Override
  public void setConnection(String url, String user, String password) {

  }

  @Override
  public void closeConnection() {

  }

}
