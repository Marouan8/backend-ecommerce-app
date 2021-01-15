package com.ecommerceapp.ecommerce.service;

import com.ecommerceapp.ecommerce.dto.Purchase;
import com.ecommerceapp.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
