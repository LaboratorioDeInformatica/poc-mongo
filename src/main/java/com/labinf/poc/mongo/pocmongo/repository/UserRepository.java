package com.labinf.poc.mongo.pocmongo.repository;

import com.labinf.poc.mongo.pocmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
