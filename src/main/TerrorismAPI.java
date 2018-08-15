package main;

public interface TerrorismAPI {

  /**
   * Retrieve event by its ID
   * If no event with the given ID exists, return -1
   *
   * @param eventId the ID of the event
   * @return Event matching the given ID
   */
  Event getEventById(int eventId);

  /**
   * Insert the given Event.
   *
   * @param event the event
   * @return ID of newly created Event or -1 if already exists
   */
  int insertEvent(Event e);

  /**
   * Get or insert on attacktype term
   *
   * @param attackType the attacktype
   * @return ID of a new or existing attacktype
   */
  int getOrInsertAttackType(AttackType a);

  /**
   * Get or insert on city term
   *
   * @param city the city
   * @return ID of a new or existing city
   */
  int getOrInsertCity(City c);

  /**
   * Get or insert on country term
   *
   * @param country the country
   * @return ID of a new or existing country
   */
  int getOrInsertCountry(Country c);

  /**
   * Insert one EventTarget
   *
   * @param eventTarget the EventTarget
   * @return ID of newly created EventTarget or -1 if already exists
   */
  int insertEventTarget(EventTarget e);

  /**
   * Insert one Location
   *
   * @param location the location
   * @return ID of newly created Location or -1 if already exists
   */
  int insertLocation(Location l);

  /**
   * Get or insert on Nationality term
   *
   * @param nationality the nationality
   * @return ID of new or existing nationality
   */
  int getOrInsertNationality(Nationality n);

  /**
   * Insert outcome
   *
   * @param outcome the outcome
   * @return ID of newly created nationality or -1 if already exists
   */
  int insertOutcome(Outcome o);

  /**
   * Get or insert on Provstate term
   *
   * @param provstate the Provstate
   * @return ID of new or existing Provstate
   */
  int getOrInsertProvstate(Provstate p);

  /**
   * Get or insert on Region term
   *
   * @param region the Region
   * @return ID of new or existing Region
   */
  int getOrInsertRegion(Region r);

  /**
   * Get or insert on Target term
   *
   * @param target the Target
   * @return ID of new or existing Target
   */
  int getOrInsertTarget(Target t);

  /**
   * Get or insert on TargetType term
   *
   * @param targetType the TargetType
   * @return ID of new or existing TargetType
   */
  int getOrInsertTargetType(TargetType t);

  /**
   * Get or insert on WeaponType term
   *
   * @param weaponType the WeaponType
   * @return ID of new or existing WeaponType
   */
  int getOrInsertWeaponType(WeaponType w);

  /**
   * Set connection settings
   */
  void setConnection(String url, String user, String password);

  /**
   * Close the connection when application finishes
   */
  void closeConnection();
}
