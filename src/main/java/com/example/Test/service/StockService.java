package com.example.Test.service;

import com.example.Test.DAO.StockDAO;
import com.example.Test.DTO.StockDTO;
import com.example.Test.Mapper.StockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StockService {
    private final StockDAO stockDAO;
    private final StockMapper stockMapper;

    public List<StockDTO> getAll(){
        return stockDAO.getAll().stream().map(el -> stockMapper.toDTO(el)).collect(Collectors.toList());
    }

    public void save(StockDTO stockDTO){
        stockDAO.save(stockMapper.toModel(stockDTO));
    }
    public void update(StockDTO stockDTO){
        stockDAO.update(stockMapper.toModel(stockDTO));
    }
}
