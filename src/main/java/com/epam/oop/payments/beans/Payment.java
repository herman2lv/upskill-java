package com.epam.oop.payments.beans;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private static final int ID_INITIAL_VALUE = 1;
    private static int idCounter = ID_INITIAL_VALUE;
    private static int orderIdCounter = ID_INITIAL_VALUE;
    private final int paymentId;
    private final List<Order> orders = new ArrayList<>();

    {
        paymentId = idCounter++;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public class Order {
        private final int orderId;
        {
            orderId = orderIdCounter++;
        }
        private final Product product;
        private final int number;

        public Order(Product product, int number) {
            this.product = product;
            this.number = number;
        }

        public int getOrderId() {
            return orderId;
        }

        public Product getProduct() {
            return product;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "\nOrder{"
                    + "orderId=" + orderId
                    + ", product=" + product.getName()
                    + " (price=" + product.getCost()
                    + " USD), number=" + number
                    + '}';
        }
    }

}
