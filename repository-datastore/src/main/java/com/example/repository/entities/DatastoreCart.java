package com.example.repository.entities;

import java.util.UUID;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Entity(name = "cart")
@Builder
@Data
public class DatastoreCart {
    @Id
    private Long id;

    private UUID cartId;
    private String cartType;
}
