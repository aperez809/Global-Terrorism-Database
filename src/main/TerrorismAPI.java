package main;

public interface TerrorismAPI {

  /**
   * Get or insert on attacktype term
   *
   * @param attackType the attacktype
   * @return ID of a new or existing attacktype.
   */
  int getOrInsertAttackType(AttackType attackType);
  int getOrInsertCity(City city);
  int getOrInsertCountry(Country country);
  int insertEvent(Event event);
  int insertEventTarget(EventTarget eventTarget);
  int insertLocation(Location location);
  int getOrInsertNationality(Nationality nationality);
  int insertOutcome(Outcome outcome);
  int getOrInsertProvstate(Provstate provstate);
  int getOrInsertRegion(Region region);
  int getOrInsertTarget(Target target);
  int getOrInsertTargetType(TargetType targetType);
  int getOrInsertWeaponType(WeaponType weaponType);

  /**
   * Set connection settings
   */
  public void setConnection(String url, String user, String password);

  /**
   * Close the connection when application finishes
   */
  public void closeConnection();
}
