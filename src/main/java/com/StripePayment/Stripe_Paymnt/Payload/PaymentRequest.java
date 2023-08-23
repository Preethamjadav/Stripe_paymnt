package com.StripePayment.Stripe_Paymnt.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class PaymentRequest {

    private long amount;
    private String currency;
    private String description;

    // Add getters and setters for the fields
}
