package com.items.api.service;


import com.items.api.util.mongodb.HotelRepository;
import com.items.api.util.mongodb.document.Booking;
import com.items.api.util.pojo.DataResponse;
import com.items.api.util.pojo.HotelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class QueryService {

    @Autowired
    HotelRepository hotelRepository;


    public List<HotelInfo> toHotelInfo(List<Booking> hotels) {
        List<HotelInfo> responsePages = new ArrayList<>();
        hotels.stream().forEach(hotel -> {
            responsePages.add(new HotelInfo(hotel));
        });
        return responsePages;
    }


    public Booking findByHotel(String hotel){
        return hotelRepository.findByHotel(hotel);
    }


    public DataResponse findByCity(String city){
        List<Booking> hotels = hotelRepository.findByCity(city);
        List<HotelInfo> hotelInfo = toHotelInfo(hotels);
        return DataResponse.data(hotelInfo);
    }


    public DataResponse findByTown(String town){
        List<Booking> hotels = hotelRepository.findByTown(town);
        List<HotelInfo> hotelInfo = toHotelInfo(hotels);
        return DataResponse.data(hotelInfo);
    }


    public DataResponse findByRatings(Integer lowRatings, Integer highRatings){
        if (null == lowRatings){
            lowRatings = 0;
        }
        if (null == highRatings){
            highRatings = 5;
        }
        List<Booking> hotels = hotelRepository.findByRatings(lowRatings, highRatings);
        List<HotelInfo> hotelInfo = toHotelInfo(hotels);
        return DataResponse.data(hotelInfo);
    }


    public DataResponse findByStars(Integer lowStars, Integer highStars){
        if (null == lowStars){
            lowStars = 0;
        }
        if (null == highStars){
            highStars = 10;
        }
        List<Booking> hotels = hotelRepository.findByStars(lowStars, highStars);
        List<HotelInfo> hotelInfo = toHotelInfo(hotels);
        return DataResponse.data(hotelInfo);
    }

}
