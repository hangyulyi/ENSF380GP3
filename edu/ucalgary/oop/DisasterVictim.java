package edu.ucalgary.oop;

import java.util.Arrays;
import java.util.ArrayList;
/**
 * Represents a DisasterVictim in the system.
 * Users can create a DisasterVictim with a firstName and ENTRY_DATA.
 * Users can perform actions such as adding additional information, updating FamilyRelation, MedicalRecord, and Supply.
 */
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
   /**
    * This method will add Supply to this DisasterVictim
    * @param supply
    */
   public void addPersonalBelonging(Supply supply) {
      personalBelongings.add(supply);
   }
   
   /**
    * This method will remove Supply from this DisasterVictim
    * @param supply
    */
   public void removePersonalBelonging(Supply supply) {
      personalBelongings.remove(supply);
   }

   /**
    * This method will add FamilyRelation to this DisasterVictim
    * @param familyConnection
    */
   public void addFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.add(familyConnection);
   }

   /**
    * This method will remove FamilyRelation from this DisasterVictim
    * @param familyConnection
    */
   public void removeFamilyConnection(FamilyRelation familyConnection) {
      familyConnections.remove(familyConnection);
   }

   /**
    * This method will add MedicalRecord to this DisasterVictim
    * @param medicalRecord
    */
   public void addMedicalRecord(MedicalRecord medicalRecord) {
      medicalRecords.add(medicalRecord);
   }
}
