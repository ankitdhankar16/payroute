package com.dhankarankit.payroute.merchant.entity;

import com.dhankarankit.payroute.common.entity.Money;
import com.dhankarankit.payroute.common.enums.RefundStatus;
import com.dhankarankit.payroute.payment.entity.Payment;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name="refund")
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="payment_id",nullable = false)
    private Payment payment;

    @JoinColumn(nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;

    @Enumerated(EnumType.STRING)
    @JoinColumn(nullable = false)
    private RefundStatus status=RefundStatus.PENDING;

    @Column(length = 100)
    private String bankReference;

    @Column(length = 100)
    private String errorCode;

    @Column(length = 500)
    private String errorDescription;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Map<String,Object> notes;

    private LocalDateTime processedAt;

}
