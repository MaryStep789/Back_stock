package com.example.Test.DAO;

import com.example.Test.model.Stock;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockDAO {
    private final JdbcTemplate jdbcTemplate;

    public StockDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Stock> getAll(){
        String query = "select * from stock";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Stock.class));
    }

    public void save(Stock stock){
        String query = "insert into stock (" +
                "data, " +
                "name, " +
                "cost) " +
                "values (?, ?, ?)";
        jdbcTemplate.update(query, stock.getData(), stock.getName(), stock.getCost());
    }

    public void update(Stock stock){
        String query = "update stock set data = ?, name = ?, cost = ? where id = ?";
        jdbcTemplate.update(query, stock.getData(),stock.getName(), stock.getCost(), stock.getId());
    }

}
