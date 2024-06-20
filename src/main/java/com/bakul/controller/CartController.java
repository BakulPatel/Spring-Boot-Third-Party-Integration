package com.bakul.controller;

import com.bakul.service.ICartSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    ICartSerivce cartService;

    @GetMapping
    public String cart() {
        return cartService.getAllCarts();
    }

}
