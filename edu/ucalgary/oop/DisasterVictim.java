package edu.ucalgary.oop;

import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;

public class DisasterVictim {
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String comments;
   private int ASSIGNED_SOCIAL_ID;
   private List<MedicalRecord> medicalRecords;
   private List<FamilyRelation> familyConnections;
   private String ENTRY_DATE;
   private List<Supply> personalBelongings;
   private String gender;
   private static int counter;
   private static final String DATE_FORMAT_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

   /* Constructor */
   public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
      this.firstName = firstName;
      this.ENTRY_DATE = ENTRY_DATE;
      this.familyConnections = new ArrayList<>();
   }

   /* Setters */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   // Make sure date of birth is in correct format of YYYY-MM-DD
   public void setDateOfBirth(String dob) throws IllegalArgumentException{
      if(dob.matches(DATE_FORMAT_REGEX)) {
         this.dateOfBirth = dob;
         return;
      } 
      throw new IllegalArgumentException("Date not in correct format, YYYY-MM-DD. " + dob);
      
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
      this.medicalRecords = medicalRecords;
   }

   public void setPersonalBelongings(List<Supply> supplies) {
      this.personalBelongings = supplies;
   }

   public void setFamilyConnections(List<FamilyRelation> relation) {
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
   public List<MedicalRecord> getMedicalRecords() { return this.medicalRecords; }
   public String getEntryDate() { return this.ENTRY_DATE; }
   public int getAssignedSocialID() { return this.ASSIGNED_SOCIAL_ID; }
   public List<Supply> getPersonalBelongings() { return this.personalBelongings; }
   public List<FamilyRelation> getFamilyConnections() { return this.familyConnections; }
   public String getGender() { return this.gender; }


   /* Additional methods */
   public void addPersonalBelonging(Supply supply) {

   }
   
   public void removePersonalBelonging(Supply supply) {

   }

   public void addFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.add(familyConnection);
   }

   public void removeFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.remove(familyConnection);
   }

   public void addMedicalRecord(MedicalRecord medicalRecord) {

   }
}
