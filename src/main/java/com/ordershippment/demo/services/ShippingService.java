package com.ordershippment.demo.services;

import com.ordershippment.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

  public double shipment(Order order) {
    if (order.getBasic() < 100) {
      return 20.00;
    } else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
      return 12.00;
    }
    return 0.00;
  }
}
