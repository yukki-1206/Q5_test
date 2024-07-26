package com.example.q5_test.service;

import com.example.q5_test.model.Sale;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {
    public List<Sale> getSalesByProductId(int productId) {
        // ダミーデータの作成
        List<Sale> sales = new ArrayList<>();

        if (productId == 1) {
            sales.add(createSale(1, 5, LocalDateTime.parse("2024-07-02T10:00:00")));
            sales.add(createSale(1, 3, LocalDateTime.parse("2024-07-02T12:00:00")));
        }

        return sales;
    }

    private Sale createSale(int productId, int quantitySold, LocalDateTime date) {
        Sale sale = new Sale();
        sale.setProductId(productId);
        sale.setQuantitySold(quantitySold);
        sale.setDate(date);
        return sale;
    }
}
