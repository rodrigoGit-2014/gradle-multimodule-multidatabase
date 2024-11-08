package com.example.repository.postgres;

import java.util.UUID;

import com.example.Cart;
import com.example.repository.PostgresCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresCartRepositoryProxy extends JpaRepository<PostgresCart, Long> {

    Cart findByCartId(UUID cartId);
}
