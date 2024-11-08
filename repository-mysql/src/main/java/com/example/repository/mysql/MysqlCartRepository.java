package com.example.repository.mysql;

import java.util.UUID;

import com.example.Cart;
import com.example.ICartRepository;
import com.example.repository.MysqlCart;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class MysqlCartRepository implements ICartRepository {

    @Autowired
    private MysqlCartRepositoryProxy mysqlCartRepositoryProxy;

    @Override
    public Cart findByCartId(UUID cartId) {
        return mysqlCartRepositoryProxy.findByCartId(cartId);
    }

    @Override
    public Cart saveCart(Cart cart) {
        MysqlCart mysqlCart = MysqlCart.builder().cartId(cart.getCartId()).cartType(cart.getCartType()).build();
        mysqlCart = mysqlCartRepositoryProxy.save(mysqlCart);
        cart.setId(mysqlCart.getId());
        return cart;
    }
}
