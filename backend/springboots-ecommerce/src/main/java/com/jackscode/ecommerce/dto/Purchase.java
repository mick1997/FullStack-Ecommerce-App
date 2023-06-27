package com.jackscode.ecommerce.dto;

import com.jackscode.ecommerce.model.Address;
import com.jackscode.ecommerce.model.Customer;
import com.jackscode.ecommerce.model.Order;
import com.jackscode.ecommerce.model.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
