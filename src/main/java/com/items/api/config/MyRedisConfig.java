package com.items.api.config;

import com.items.api.util.mongodb.document.Booking;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object, Booking> empRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException{
        RedisTemplate<Object, Booking> template = new RedisTemplate<Object, Booking>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Booking> ser = new Jackson2JsonRedisSerializer<Booking>(Booking.class);
        template.setDefaultSerializer(ser);
        return template;
    }

    // CacheManagerCustomizers 可以來定製緩存的一些規則
//    @Bean
//    public RedisCacheManager bookingCacheManager(RedisTemplate<Object, Booking> empRedisTemplate){
//        RedisCacheManager cacheManager = new RedisCacheManager(empRedisTemplate);
//
//        // 使用前綴，默認會將CacheName作為Key前綴
//        // cacheManager.setUsePrefix(true);
//        return cacheManager;
//    }
}
