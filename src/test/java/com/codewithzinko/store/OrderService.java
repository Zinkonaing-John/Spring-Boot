package com.codewithzinko.store;

public class OrderService {

    public void order() {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);

    }
}