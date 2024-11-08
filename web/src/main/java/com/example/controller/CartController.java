package com.example.controller;

import com.example.Cart;
import com.example.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    public CartService cartService;

    @GetMapping("/v2/carts/")
    @ResponseStatus(OK)
    public ResponseEntity<Cart> getCartById() {

        return ResponseEntity.status(OK).body(cartService.getCartByAccountId(null));
    }

    @PostMapping("/v2/carts/")
    @ResponseStatus(OK)
    public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
        return ResponseEntity.status(OK).body(cartService.saveCart(cart));
    }
}
