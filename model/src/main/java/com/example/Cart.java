package com.example;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cart {

    private Long id;

    private UUID cartId;

    private String cartType;

}
