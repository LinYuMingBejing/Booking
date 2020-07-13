package com.items.api.controller;

import com.items.api.service.QueryService;
import com.items.api.util.mongodb.document.Booking;
import com.items.api.util.pojo.DataResponse;

import com.items.api.util.pojo.HotelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CustomerController {
    @Autowired
    QueryService queryService;

    @ResponseBody
    @GetMapping("/hotel")
    public HotelInfo findByHotel(@RequestParam String hotel){

        return queryService.findByHotel(hotel);
    }

    @ResponseBody
    @GetMapping("/hotel/city")
    public DataResponse findByCity(@RequestParam String city){
        return queryService.findByCity(city);
    }


    @ResponseBody
    @GetMapping("/hotel/town")
    public DataResponse findByTown(@RequestParam String town){
        return queryService.findByTown(town);
    }

    @ResponseBody
    @GetMapping("/hotel/ratings")
    public DataResponse findByRatings(@RequestParam Integer lowRatings, @RequestParam(required = false) Integer highRatings){
        return queryService.findByRatings(lowRatings, highRatings);
    }

    @ResponseBody
    @GetMapping("/hotel/stars")
    public DataResponse findByStars(@RequestParam Integer lowStars, @RequestParam(required = false) Integer highStars){
        return queryService.findByStars(lowStars, highStars);
    }
}
