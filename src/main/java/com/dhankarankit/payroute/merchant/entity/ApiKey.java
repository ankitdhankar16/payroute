package com.dhankarankit.payroute.merchant.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="api_key")
public class ApiKey {
    @Id
    @GeneratedValue(GenerationType.UUID)
    private UUID id;

}
