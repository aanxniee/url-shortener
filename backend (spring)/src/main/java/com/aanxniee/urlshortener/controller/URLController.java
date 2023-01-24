package com.aanxniee.urlshortener.controller;

import com.aanxniee.urlshortener.modal.URL;
import com.aanxniee.urlshortener.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // marks class as a request handler, creates RESTful API calls
@RequestMapping("/url/shortener") // maps requests onto specific handlers
@CrossOrigin(origins = "http://localhost:4200")
public class URLController {
    @Autowired
    private URLService urlService;

    @GetMapping("/{id}")
    // handles HTTPs GET requests, retrieves URL by specified id
    public String getOriginalUrl(@PathVariable String id) {
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
    // handles HTTPs POST requests, creates short URL for a given URL
    public URL generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);
    }
}
