package com.example.repository.mysql;

import java.util.UUID;

import com.example.Cart;
import com.example.repository.MysqlCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlCartRepositoryProxy extends JpaRepository<MysqlCart, Long> {

    Cart findByCartId(UUID cartId);
}
