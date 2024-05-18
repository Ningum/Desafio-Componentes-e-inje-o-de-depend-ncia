package com.ordershippment.demo;

import com.ordershippment.demo.entities.Order;
import com.ordershippment.demo.services.OrderService;
import com.ordershippment.demo.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	@Autowired
	private ShippingService shippingService;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Order order1 = new Order(1034, 150.00, 20.0);
	System.out.println("Pedido código " + order1.getCode() + "\nValor total: " + (orderService.total(order1) + shippingService.shipment(order1)));

    Order order2 = new Order(2282, 800.00, 10.0);
	System.out.println("\nPedido código " + order2.getCode() + "\nValor total: " + (orderService.total(order2) + shippingService.shipment(order2)));

    Order order3 = new Order(1309, 95.90, 0.0);
	System.out.println("\nPedido código " + order3.getCode() + "\nValor total: " + (orderService.total(order3) + shippingService.shipment(order3)));
  }
}
