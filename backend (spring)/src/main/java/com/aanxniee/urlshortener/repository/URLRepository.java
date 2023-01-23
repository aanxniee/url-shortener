package com.aanxniee.urlshortener.repository;

import com.aanxniee.urlshortener.modal.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface URLRepository extends JpaRepository<URL, Integer> {
    @Query(value = "select originalUrl from URL where shortUrl = ?1", nativeQuery = true)
    String findByShortUrl(String id);
}
