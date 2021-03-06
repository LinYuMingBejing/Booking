package com.items.api.service;


import com.items.api.util.mongodb.HotelRepository;
import com.items.api.util.mongodb.document.Booking;
import com.items.api.util.pojo.DataResponse;
import com.items.api.util.pojo.HotelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
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

    @Cacheable(value="user-key")
    public HotelInfo findByHotel(String hotel){
        Booking booking = hotelRepository.findByHotel(hotel);

        HotelInfo hotelInfo = new HotelInfo();
        hotelInfo.setAddress(booking.getAddress());
        hotelInfo.setBed_type(booking.getBed_type());
        hotelInfo.setComments(booking.getComments());
        hotelInfo.setHotel(booking.getHotel());
        return hotelInfo;
    }


    public DataResponse findByCity(String city, int ttn){
        List<Booking> hotels = hotelRepository.findByCity(city, PageRequest.of(0, ttn));
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


    public DataResponse findByStars(Integer lowStars, Integer highStars, Integer ttn){
        if (null == lowStars){
            lowStars = 0;
        }
        if (null == highStars){
            highStars = 10;
        }
        List<Booking> hotels = hotelRepository.findByStars(lowStars, highStars, PageRequest.of(0, ttn));
        List<HotelInfo> hotelInfo = toHotelInfo(hotels);
        return DataResponse.data(hotelInfo);
    }

}
