package com.items.api.util.mongodb;

import com.items.api.util.mongodb.document.Booking;
import com.items.api.util.pojo.HotelInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HotelRepository extends MongoRepository<Booking, ObjectId>{

    @Query("{hotel:?0}")
    Booking findByHotel(String hotel);

    @Query("{city: ?0}")
    List<Booking> findByCity(String city);

    @Query("{town: ?0}")
    List<Booking> findByTown(String town);

    @Query("{ratings:{ '$gte':?0, '$lte':?1}}")
    List<Booking> findByRatings(Integer lowRating, Integer highRating);

    @Query("{stars:{ '$gte':?0, '$lte':?1}}")
    List<Booking> findByStars(Integer lowStars, Integer highStars);

}
