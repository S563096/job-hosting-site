package com.sandeepproject.joblisting.repository;

import com.sandeepproject.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
