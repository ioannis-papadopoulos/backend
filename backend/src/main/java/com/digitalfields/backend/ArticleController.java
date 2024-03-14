package com.digitalfields.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articlesRepository;

    @GetMapping("/article")
    public ResponseEntity<List<Article>> getAllCustomers() {
        List<Article> articles = articlesRepository.findAll();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
}
