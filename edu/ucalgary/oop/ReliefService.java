/**
 * @author     Group 4
 * @version    1.3
 * @since      1.0
 */

package edu.ucalgary.oop;

/**
 * This represents a ReliefService in the system.
 * 
 * Users are able to record information about an inquirer, missing person, date of inquiry, information provided, and location.
 */
public class ReliefService {
   private Inquirer inquirer;
   private DisasterVictim missingPerson;
   private String dateOfInquiry;
   private String infoProvided;
   private Location lastKnownLocation;

   /* Constructor */
   public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
      this.inquirer = inquirer;
      this.missingPerson = missingPerson;
      this.dateOfInquiry = dateOfInquiry;
      this.infoProvided = infoProvided;
      this.lastKnownLocation = lastKnownLocation;
   }

   /* Setters and Getters */
   public Inquirer getInquirer() {
      return inquirer;
   }

   public void setInquirer(Inquirer inquirer) {
      this.inquirer = inquirer;
   }

   public DisasterVictim getMissingPerson() {
      return missingPerson;
   }

   public void setMissingPerson(DisasterVictim missingPerson) {
      this.missingPerson = missingPerson;
   }

   public String getDateOfInquiry() {
      return dateOfInquiry;
   }

   // Date format needs to be in YYYY-MM-DD format
   public void setDateOfInquiry(String dateOfInquiry) {
      if (!isValidDateFormat(dateOfInquiry)) {
         throw new IllegalArgumentException("Invalid date format. Date should be in the format YYYY-MM-DD.");
      }
      this.dateOfInquiry = dateOfInquiry;
   }
   private boolean isValidDateFormat(String date) {
      return date.matches("\\d{4}-\\d{2}-\\d{2}");
   }

   public String getInfoProvided() {
      return infoProvided;
   }

   public void setInfoProvided(String infoProvided) {
      this.infoProvided = infoProvided;
   }

   public Location getLastKnownLocation() {
      return lastKnownLocation;
   }

   public void setLastKnownLocation(Location lastKnownLocation) {
      this.lastKnownLocation = lastKnownLocation;
   }

   /**
    * This prints the contents of the variables
    * @return Print statement with information in readable format.
    */
   public String getLogDetails() {
      // Assuming Inquirer and DisasterVictim have appropriate getName() methods
      return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: " + missingPerson.getFirstName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
   }

}
