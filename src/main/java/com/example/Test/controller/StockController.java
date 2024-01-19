package com.example.Test.controller;

import com.example.Test.DTO.StockDTO;
import com.example.Test.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/stock")
@RequiredArgsConstructor
@Controller
public class StockController {
    private final StockService stockService;

    @GetMapping
    public ResponseEntity <List<StockDTO>> getAll(){
        return ResponseEntity.ok(stockService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody StockDTO stockDTO){
        stockService.save(stockDTO);
        return ResponseEntity.ok("Успешно");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody StockDTO stockDTO){
        stockService.update(stockDTO);
        return ResponseEntity.ok("Успешно");
    }

}
