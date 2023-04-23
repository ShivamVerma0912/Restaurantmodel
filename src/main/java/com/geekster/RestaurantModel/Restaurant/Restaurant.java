package com.geekster.RestaurantModel.Restaurant;

public class Restaurant {

    private String restaurantId;

    private String restaurantName;

    private String address;
    
    private String phoneNumber;

    private String speciality;

    private String totalStaffs;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(String totalStaffs) {
        this.totalStaffs = totalStaffs;
    }


}
