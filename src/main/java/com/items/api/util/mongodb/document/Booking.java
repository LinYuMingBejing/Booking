package com.items.api.util.mongodb.document;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@Document(collection="hotelInfo")
public class Booking {
    @Id
    private ObjectId id;

    private String pageUrl;

    private String hotel;

    private String address;

    private String city;

    private String town;

    private Integer ratings;

    private String description;

    private List<String> facilities;

    private List<String> bed_type;

    private Integer stars;

    private List<String> comments;

    private Object tourists;

    private List<String> photo;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public List<String> getBed_type() {
        return bed_type;
    }

    public void setBed_type(List<String> bed_type) {
        this.bed_type = bed_type;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }



    public List<String> getPhoto() {
        return photo;
    }

    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    public Object getTourists() {
        return tourists;
    }

    public void setTourists(Object tourists) {
        this.tourists = tourists;
    }

}
