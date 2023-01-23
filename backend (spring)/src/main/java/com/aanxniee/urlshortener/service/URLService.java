package com.aanxniee.urlshortener.service;

import com.aanxniee.urlshortener.modal.URL;
import com.aanxniee.urlshortener.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.aanxniee.urlshortener.logic.GenerateShortUrl.getShortUrl;
import static com.aanxniee.urlshortener.logic.GenerateShortUrl.isUrlValid;

@Service
public class URLService {
    @Autowired
    private URLRepository urlRepository;

    public String getOriginalUrl(String id) {
        return urlRepository.findByShortUrl(id);
    }

    public URL generateShortUrl(String url) {
        // checks if the inputted url is valid
        if (! isUrlValid(url)) {
            System.out.println("URL is not valid");
            return null;
        }

        // create new URL object
        URL urlObject = new URL();
        urlObject.setOriginalURL(url);
        urlObject.setShortURL(getShortUrl(url));
        return urlRepository.save(urlObject);
    }
}
