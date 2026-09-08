package com.dhankarankit.payroute.merchant.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.util.UUID;

@Entity
@Table(name="merchant_webhook_config")
public class MechantWebhookConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch=FetchType.LAZY,optional = false)
    @JoinColumn(name="merchant_id",nullable = false)
    private Merchant merchant;

    @Column(nullable = false,length = 500)
    private String targetUrl;

    @Column(length = 255)
    private String webhookSeretHash;

    @Column(nullable = false)
    private Boolean enabled =true;

    @Column(length = 255)
    private String EventType;
    //Comma seperated list of event types to subscribe to
}
