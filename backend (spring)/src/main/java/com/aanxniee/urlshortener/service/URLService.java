package com.aanxniee.urlshortener.service;

import com.aanxniee.urlshortener.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {
    @Autowired
    private URLRepository urlRepository;
}
