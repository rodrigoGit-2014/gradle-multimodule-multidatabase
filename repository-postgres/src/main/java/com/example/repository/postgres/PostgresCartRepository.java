package com.example.repository.postgres;

import java.util.UUID;

import com.example.Cart;
import com.example.ICartRepository;
import com.example.repository.PostgresCart;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class PostgresCartRepository implements ICartRepository {

    @Autowired
    private PostgresCartRepositoryProxy postgresCartRepositoryProxy;

    @Override
    public Cart findByCartId(UUID cartId) {
        return postgresCartRepositoryProxy.findByCartId(cartId);
    }

    @Override
    public Cart saveCart(Cart cart) {
        PostgresCart postgresCart = PostgresCart.builder().cartId(cart.getCartId()).cartType(cart.getCartType()).build();
        postgresCart = postgresCartRepositoryProxy.save(postgresCart);
        cart.setId(postgresCart.getId());
        return cart;
    }
}
