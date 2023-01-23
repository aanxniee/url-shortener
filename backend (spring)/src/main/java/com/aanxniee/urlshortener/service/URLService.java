package com.aanxniee.urlshortener.service;

import com.aanxniee.urlshortener.modal.URL;
import com.aanxniee.urlshortener.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {
    @Autowired
    private URLRepository urlRepository;

    public String getOriginalUrl(String id) {
        return urlRepository.findByShortUrl(id);
    }
    public URL generateShortUrl(String url) {

    }
}
