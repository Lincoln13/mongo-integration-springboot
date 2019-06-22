package com.trail.project.mongointegration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.trail.project.mongointegration.document.UserDocument;

/**
 * Similar to JpaRepository, Spring provides MongoRepository for MongoDB to
 * save, update , delete and retrieve a document in MongoDB.
 * 
 * @author lincoln
 *
 */
public interface UserRepository extends MongoRepository<UserDocument, String> {
	UserDocument findByUserId(String userId);
}
