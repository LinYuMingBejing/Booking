package com.items.api.util.pojo;

import com.items.api.util.mongodb.document.Booking;

import java.util.List;

public class HotelInfo {
    private String hotel;
    private String address;
    private int ratings;
    private String description;
    private List<String> comments;
    private List<String> bed_type;

    public HotelInfo(Booking booking) {
        this.hotel = booking.getHotel();
        this.address = booking.getAddress();
        this.ratings = booking.getRatings();
        this.description = booking.getDescription();
        this.comments = booking.getComments();
        this.bed_type = booking.getBed_type();
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<String> getBed_type() {
        return bed_type;
    }

    public void setBed_type(List<String> bed_type) {
        this.bed_type = bed_type;
    }
}
