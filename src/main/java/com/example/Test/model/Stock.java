package com.example.Test.model;
import lombok.*;

import java.time.LocalDate;

@Data
public class Stock {
    private LocalDate data;
    private String name;
    private Long cost;
    private Long id;
}
