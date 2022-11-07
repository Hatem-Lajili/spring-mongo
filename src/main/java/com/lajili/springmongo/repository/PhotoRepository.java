package com.lajili.springmongo.repository;

import com.lajili.springmongo.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo,String> {
}
