package com.example.Test.Mapper;

import com.example.Test.DTO.StockDTO;
import com.example.Test.model.Stock;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock toModel(StockDTO stockDTO){
        Stock stock = new Stock();
        stock.setId(stockDTO.getId());
        stock.setName(stockDTO.getName());
        stock.setCost(stockDTO.getCost());
        stock.setData(stockDTO.getData());
        return stock;
    }
    public StockDTO toDTO(Stock stock){
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(stock.getId());
        stockDTO.setName(stock.getName());
        stockDTO.setCost(stock.getCost());
        stockDTO.setData(stock.getData());
        return stockDTO;
    }

}
