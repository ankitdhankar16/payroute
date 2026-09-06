package com.dhankarankit.payroute.merchant.entity;

import com.dhankarankit.payroute.common.enums.Environment;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="api_key")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiKey {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch =FetchType.LAZY,optional = false)
    @JoinColumn(name="merchant_id",nullable = false)
    private Merchant merchant;

    @Column(nullable = false, length= 50,unique = true)
    private String key_Id;

    @Column(nullable = false,length = 200)
    private String keySecretHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 10)
    private Environment environment;

    @Column(nullable = false)
    private boolean enableId=true;


    private LocalDateTime lastUsedAt;
    private LocalDateTime rotatedAt;
    private LocalDateTime gracePeriodExpiredAt;



}
