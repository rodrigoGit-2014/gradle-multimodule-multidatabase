package com.example;

import java.util.UUID;

public interface ICartRepository {
    Cart findByCartId(UUID cartId);

    Cart saveCart(Cart cart);

}
