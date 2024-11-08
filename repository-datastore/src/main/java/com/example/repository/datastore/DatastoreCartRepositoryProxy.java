package com.example.repository.datastore;

import java.util.UUID;

import com.example.Cart;
import com.example.repository.entities.DatastoreCart;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface DatastoreCartRepositoryProxy extends DatastoreRepository<DatastoreCart,Long> {

    Cart findByCartId(UUID cartId);
}
