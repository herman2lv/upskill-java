package com.epam.oop.paymentTask.services;

import com.epam.oop.paymentTask.beans.Payment;
import com.epam.oop.paymentTask.beans.Product;

import java.math.BigDecimal;
import java.util.List;

public class ShopAssistant {
    private final Payment payment;

    public ShopAssistant(Payment payment) {
        this.payment = payment;
    }

    public void order(Product product, int number) {
        payment.getOrders().add(payment.new Order(product, number));
    }

    public void removeOrder(int orderId) {
        List<Payment.Order> orders = payment.getOrders();
        orders.removeIf(order -> order.getOrderId() == orderId);
    }

    public BigDecimal getCost() {
        List<Payment.Order> orders = payment.getOrders();
        BigDecimal sum = new BigDecimal(0);
        for (Payment.Order order : orders) {
            BigDecimal cost = order.getProduct().getCost();
            BigDecimal number = BigDecimal.valueOf(order.getNumber());
            sum = sum.add(cost.multiply(number));
        }
        return sum;
    }

    public String getPaymentInfo() {
        String info = payment.getOrders().toString();
        return info + "\nTotal cost = " + getCost() + "USD";
    }
}
