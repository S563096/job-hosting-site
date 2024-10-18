package com.sandeepproject.joblisting.Controller;

import com.sandeepproject.joblisting.repository.PostRepository;
import com.sandeepproject.joblisting.models.Post;
import com.sandeepproject.joblisting.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController
{
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;
    @RequestMapping(value="/")
    @CrossOrigin
    public  void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");

    }
    @GetMapping("/allPost")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }


}
