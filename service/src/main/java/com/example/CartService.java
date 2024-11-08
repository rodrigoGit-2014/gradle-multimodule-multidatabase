package com.example;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private ICartRepository ICartRepository;

    public Cart getCartByAccountId(UUID cartId) {
        return ICartRepository.findByCartId(cartId);
    }

    public Cart saveCart(Cart cart){
        return ICartRepository.saveCart(cart);
    }
}