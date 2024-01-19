package com.example.Test.DTO;
import lombok.*;

import java.time.LocalDate;

@Data
public class StockDTO {
    private Long id;
    private String name;
    private LocalDate data;
    private Long cost;
}
