package com.items.api.service;


import com.items.api.util.mongodb.HotelRepository;
import com.items.api.util.mongodb.document.Booking;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.logging.Logger;

@Service
public class UpdateService {

    @Autowired
    HotelRepository hotelRepository;

    public void updateInfo(Booking hotelInfo) throws UnsupportedEncodingException, MalformedURLException {
        Booking booking = new Booking();
        booking.setId(hotelInfo.getId());
        booking.setPageUrl(hotelInfo.getPageUrl());
        booking.setCity(hotelInfo.getCity());
        booking.setAddress(hotelInfo.getHotel());
        booking.setTown(hotelInfo.getTown());
        booking.setRatings(hotelInfo.getRatings());
        booking.setDescription(hotelInfo.getDescription());
        booking.setFacilities(hotelInfo.getFacilities());
        booking.setBed_type(hotelInfo.getBed_type());
        booking.setStars(hotelInfo.getStars());
        booking.setComments(hotelInfo.getComments());
        booking.setTourists(hotelInfo.getTourists());
        booking.setPhoto(hotelInfo.getPhoto());
        hotelRepository.save(booking);





    }

}
