package com.sandeepproject.joblisting.repository;

import com.sandeepproject.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String>
{


}
