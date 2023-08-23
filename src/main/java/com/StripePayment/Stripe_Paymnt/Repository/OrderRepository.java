package com.StripePayment.Stripe_Paymnt.Repository;

import com.StripePayment.Stripe_Paymnt.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods, if needed, can be defined here
}
