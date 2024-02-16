package edu.ucalgary.oop;

import java.util.Arrays;
import java.util.ArrayList;

public class DisasterVictim {
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String comments;
   private int ASSIGNED_SOCIAL_ID;
   private ArrayList<MedicalRecord> medicalRecords;
   private ArrayList<FamilyRelation> familyConnections;
   private String ENTRY_DATE;
   private ArrayList<Supply> personalBelongings;
   private String gender;
   private static int counter;
   private static final String DATE_FORMAT_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

   /* Constructor */
   public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
      this.firstName = firstName;
      if(ENTRY_DATE.matches(DATE_FORMAT_REGEX)) { this.ENTRY_DATE = ENTRY_DATE; }
      else {
         throw new IllegalArgumentException("Invalid ENTRY_DATE format. Should be in YYYY-MM-DD.");
      }
      this.familyConnections = new ArrayList<>();
      this.personalBelongings = new ArrayList<>();
      this.medicalRecords = new ArrayList<>();
      this.ASSIGNED_SOCIAL_ID = counter;
      counter++;
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

   public void setMedicalRecords(MedicalRecord[] medicalRecords) {
      this.medicalRecords.addAll(Arrays.asList(medicalRecords));
   }

   public void setPersonalBelongings(Supply[] supplies) {
      this.personalBelongings.addAll(Arrays.asList(supplies));
   }

   public void setFamilyConnections(FamilyRelation[] relation) {
      this.familyConnections.addAll(Arrays.asList(relation));
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   /* Getters */
   public String getFirstName() { return this.firstName; }
   public String getLastName() { return this.lastName; }
   public String getDateOfBirth() { return this.dateOfBirth; }
   public String getComments() { return this.comments; }
   public MedicalRecord[] getMedicalRecords() { return this.medicalRecords.toArray(new MedicalRecord[0]); }
   public String getEntryDate() { return this.ENTRY_DATE; }
   public int getAssignedSocialID() { return this.ASSIGNED_SOCIAL_ID; }
   public Supply[] getPersonalBelongings() { 
      return this.personalBelongings.toArray(new Supply[0]); 
   }

   public FamilyRelation[] getFamilyConnections() { 
      return familyConnections.toArray(new FamilyRelation[0]); 
   }

   public String getGender() { return this.gender; }


   /* Additional methods */
   public void addPersonalBelonging(Supply supply) {
      personalBelongings.add(supply);
   }
   
   public void removePersonalBelonging(Supply supply) {
      personalBelongings.remove(supply);
   }

   public void addFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.add(familyConnection);
   }

   public void removeFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.remove(familyConnection);
   }

   public void addMedicalRecord(MedicalRecord medicalRecord) {
      medicalRecords.add(medicalRecord);
   }
}
