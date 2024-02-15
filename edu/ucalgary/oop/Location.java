package edu.ucalgary.oop;

import java.util.List;

public class Location {
   private String name;
   private String address;
   private DisasterVictim[] occupants;
   private Supply[] supplies;

   /* Constructor */
   public Location(String name, String address) {
      this.name = name;
      this.address = address;
   }

   /* Setters */
   public void setName(String name) {
      this.name = name;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setOccupants(DisasterVictim[] occupants) {
      this.occupants = occupants;
   }

   public void setSupplies(Supply[] supplies) {
      this.supplies = supplies;
   }

   /* Getters */
   public String getName() { return this.name; }
   public String getAddress() { return this.address; }
   public DisasterVictim[] getOccupants() { return this.occupants; }
   public Supply[] getSupplies() { return this.supplies; }

   
}
