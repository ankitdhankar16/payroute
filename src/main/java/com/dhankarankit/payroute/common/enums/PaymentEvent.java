package com.dhankarankit.payroute.common.enums;

public enum PaymentEvent {
    AUTHORIZE_ATTEMPT,
    AUTHORIZE_SUCCESS,
    AUTHORIZE_FAIL,
    CAPTURE_REQUEST,
    CAPTURE_SUCCESS,
    CAPTURE_FAIL,
    REFUND_INT,
    REFUND_COMPLETE,
    SETTLE,
    CANCEL,
    CAPTURE_TIMEOUT
}
