package com.aanxniee.urlshortener.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // defines class URL as a table in the SQL database
@AllArgsConstructor
@NoArgsConstructor
@Data
public class URL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shortURL;
    private  String originalURL;
}
