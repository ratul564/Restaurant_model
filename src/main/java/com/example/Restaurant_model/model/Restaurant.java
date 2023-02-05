package com.example.Restaurant_model.model;

public class Restaurant {
//    restaurant name, restaurant address, number, speciality, totalStaffs ,Add few more relevant variables

    private int restaurant_id;
    private String restaurant_name;
    private String restaurant_address;
    private String phone_no;
    private String speciality;
    private int total_staff;

    Restaurant(){

    }
    public Restaurant(int restaurant_id, String restaurant_name, String restaurant_address, String phone_no, String speciality, int total_staff){
        this.restaurant_id = restaurant_id;
        this.restaurant_name = restaurant_name;
        this.restaurant_address = restaurant_address;
        this.phone_no = phone_no;
        this.speciality = speciality;
        this.total_staff = total_staff;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotal_staff() {
        return total_staff;
    }

    public void setTotal_staff(int total_staff) {
        this.total_staff = total_staff;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurant_id=" + restaurant_id +
                ", restaurant_name='" + restaurant_name + '\'' +
                ", restaurant_address='" + restaurant_address + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", speciality='" + speciality + '\'' +
                ", total_staff=" + total_staff +
                '}';
    }
}
