package edu.ucalgary.oop;

public class MedicalRecord {
   private Location location;
   private String treatmentDetails;
   private String dateOfTreatment;

   private static final String DATE_FORMAT_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

   /* Constructor */
   public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {
      this.location = location;
      this.treatmentDetails = treatmentDetails;
      if(dateOfTreatment.matches(DATE_FORMAT_REGEX)) {
         this.dateOfTreatment = dateOfTreatment;
         return;
      }
      else {
         throw new IllegalArgumentException("Invalid dateOfTreatment format. Should be in YYYY-MM-DD.");
      }
   }

   /* Setters */
   public void setLocation(Location location) {
      this.location = location;
   }

   public void setTreatmentDetails(String treatmentDetails) {
      this.treatmentDetails = treatmentDetails;
   }

   public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException {
      if (dateOfTreatment.matches(DATE_FORMAT_REGEX)) {
         this.dateOfTreatment = dateOfTreatment;
         return;
      }
      throw new IllegalArgumentException("Invalid date format. Must be YYYY-MM-DD.");
   }

   /* Getters */
   public Location geLocation() { return this.location; }
   public String getTreatmentDetails() { return this.treatmentDetails; }
   public String getDateOfTreatment() { return this.dateOfTreatment; }
}
