package com.dhankarankit.payroute.common.enums;

import jakarta.persistence.Embeddable;

public enum RefundStatus {
    PENDING,
    PROCESSING,
    PROCESSED,
    FAILED
}
