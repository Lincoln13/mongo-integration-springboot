package com.trail.project.mongointegration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.trail.project.mongointegration.document.UserDocument;


public interface UserRepository extends MongoRepository<UserDocument, String>{
	UserDocument findByUserId(String userId);
}

