package com.ordershippment.demo.services;

import org.springframework.stereotype.Service;

import com.ordershippment.demo.entities.Order;

@Service
public class OrderService {

  public double total(Order order) {
    double discount; 
    discount = order.getBasic() * (order.getDiscount()/100); 
    return order.getBasic() - discount;
  }
}
