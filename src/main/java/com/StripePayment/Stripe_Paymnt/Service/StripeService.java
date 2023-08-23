package com.StripePayment.Stripe_Paymnt.Service;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {

    @Value("${stripe.secret.key}")
    private String stripeSecretKey;

    @PostConstruct
    public void init() {
        // Set the Stripe secret key during initialization
        Stripe.apiKey = stripeSecretKey;
    }

    public PaymentIntent createPaymentIntent(long amount, String currency, String description) throws StripeException {
        Map<String, Object> params = new HashMap<>();
        params.put("amount", amount);
        params.put("currency", currency);
        params.put("description", description);

        // You can add more parameters to customize the payment intent

        return PaymentIntent.create(params);
    }
}

