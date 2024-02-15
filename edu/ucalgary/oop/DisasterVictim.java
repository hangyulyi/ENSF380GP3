package edu.ucalgary.oop;

import java.util.regex.*;

public class DisasterVictim {
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String comments;
   private int ASSIGNED_SOCIAL_ID;
   private MedicalRecord[] medicalRecords = new MedicalRecord[];
   private FamilyRelation[] familyConnections = new FamilyRelation[];
   private String ENTRY_DATE;
   private Supply[] personalBelongings = new Supply[];
   private String gender;
   private int counter;
   private static final String DATE_FORMAT_REGEX = "^\\d{2}-\\d{2}-\\d{4}$";

   /* Constructor */
   public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {

   }

   /* Setters */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   // Make sure date of birth is in correct format of MM-DD-YYYY
   public void setDateOfBirth(String dob) throws IllegalArgumentException{
      if(dob.matches(DATE_FORMAT_REGEX)) {
         this.dateOfBirth = dob;
         return;
      } 
      throw new IllegalArgumentException("Date not in correct format, MM-DD-YYYY. " + dob);
      
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public void setMedicalRecords(MedicalRecord[] medicalRecords) {
      this.medicalRecords = medicalRecords;
   }

   public void setPersonalBelongings(Supply[] supplies) {
      this.personalBelongings = supplies;
   }

   public void setFamilyConnections(FamilyRelation[] relation) {
      this.familyConnections = relation;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   /* Getters */
   public String getFirstName() { return this.firstName; }
   public String getLastName() { return this.lastName; }
   public String getDateOfBirth() { return this.dateOfBirth; }
   public String getComments() { return this.comments; }
   public MedicalRecord[] getMedicalRecords() { return this.medicalRecords; }
   public String getEntryDate() { return this.ENTRY_DATE; }
   public int getAssignedSocialID() { return this.ASSIGNED_SOCIAL_ID; }
   public Supply[] getPersonalBelongings() { return this.personalBelongings; }
   public FamilyRelation[] getFamilyConnections() { return this.familyConnections; }
   public String getGender() { return this.gender; }


}
