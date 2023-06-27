package com.jackscode.ecommerce.service;

import com.jackscode.ecommerce.dto.Purchase;
import com.jackscode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
