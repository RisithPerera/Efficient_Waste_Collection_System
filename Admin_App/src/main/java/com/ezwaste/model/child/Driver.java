
package com.ezwaste.model.child;

import com.ezwaste.manifest.Symbol;
import com.ezwaste.model.superb.SuperModel;

import java.util.Objects;

public class Driver extends SuperModel implements Comparable<Driver>{
    private int id;
    private String username;
    private String password;
    private String fName;
    private String lName;
    private String street;
    private String city;
    private String district;
    private String contact;
    private int regionId;
    private double reputation;

    public Driver() {}

    public Driver(int id) {
        this.id = id;
    }

    public Driver(int id, String username, String password, String fName, String lName, String street, String city, String district, String contact, int regionId, double reputation) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.district = district;
        this.contact = contact;
        this.regionId = regionId;
        this.reputation = reputation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public double getReputation() {
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }

    //---------------------------- Calculatons -------------------------------------//
   
    public String getFullName() {
        return fName + " " + lName;
    }
    
    public String getIdFullName() {
        return id+" - "+fName + " " + lName;
    }
    
    public String getAddress() {
        return street + ",\n" + city+ ",\n" + district;
    }

    //---------------------------- Override Methods -------------------------------------//
    
    @Override
    public String toString() {
        return  getId()       + Symbol.SPLIT +
                getFName()    + Symbol.SPLIT +
                getLName()    + Symbol.SPLIT +
                getStreet()   + Symbol.SPLIT +
                getCity()     + Symbol.SPLIT +
                getDistrict() + Symbol.SPLIT +
                getContact()  + Symbol.SPLIT +
                getReputation();
    }      

    @Override
    public int compareTo(Driver dto) {
        boolean logic = dto.getId() > this.getId();
        return  logic ? -1 : !logic ? 1 : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Driver) {
            return ((Driver)obj).getId() == this.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {        
        int hash = Objects.hashCode(String.format("%05d", this.getId()));
        return hash;
    } 
}
