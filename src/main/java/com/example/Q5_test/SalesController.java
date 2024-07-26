package com.example.q5_test.controller;

import com.example.q5_test.model.Sale;
import com.example.q5_test.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/api/sales/{productId}")
    public List<Sale> getSalesByProductId(@PathVariable int productId) {
        return saleService.getSalesByProductId(productId);
    }
}
