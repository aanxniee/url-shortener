package com.aanxniee.urlshortener.repository;

import com.aanxniee.urlshortener.modal.URL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<URL, Integer> {
}
