package com.example.repository.datastore;

import java.util.UUID;

import com.example.Cart;
import com.example.ICartRepository;
import com.example.repository.entities.DatastoreCart;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class DatastoreCartRepository implements ICartRepository {
    @Autowired
    private DatastoreCartRepositoryProxy datastoreCartRepositoryProxy;

    @Override
    public Cart findByCartId(UUID cartId) {
        return datastoreCartRepositoryProxy.findByCartId(cartId);
    }

    @Override
    public Cart saveCart(Cart cart) {
        DatastoreCart datastoreCart = DatastoreCart.builder().cartId(cart.getCartId()).cartType(cart.getCartType()).build();
        datastoreCart = datastoreCartRepositoryProxy.save(datastoreCart);
        cart.setId(datastoreCart.getId());
        return cart;

    }
}
