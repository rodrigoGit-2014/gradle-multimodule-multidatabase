package com.example.repository;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Data
@Entity
@Table(name = "cart")
@Builder
@Getter
public class MysqlCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "hibernateSequenceGenerator")
    private Long id;

    private UUID cartId;
    private String cartType;
}
