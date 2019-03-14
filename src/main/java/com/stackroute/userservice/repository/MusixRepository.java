package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.Musix;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface MusixRepository extends MongoRepository<Musix, Integer> {

//    @Query(
//            value = "SELECT * FROM Musix ")
//    Collection<Musix> findAllActiveUsers();
//
//    @Query(value = "SELECT m FROM Musix m where m.name = ?1")
//    List<Musix> findTitleByName(String name);
}
