package com.example.storeservices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int storeId;
    private String name;
    private String category;
    private String contactInfo;
    private String location;
    private String operatingHours;
    
    

    public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(int storeId, String name, String category, String contactInfo, String location,
			String operatingHours) {
		super();
		this.storeId = storeId;
		this.name = name;
		this.category = category;
		this.contactInfo = contactInfo;
		this.location = location;
		this.operatingHours = operatingHours;
	}

	// Getters and Setters
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", name=" + name + ", category=" + category + ", contactInfo="
				+ contactInfo + ", location=" + location + ", operatingHours=" + operatingHours + "]";
	}
    
}
