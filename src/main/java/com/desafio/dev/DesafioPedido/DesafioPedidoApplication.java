package com.desafio.dev.DesafioPedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.desafio.dev.entities.Order;
import com.desafio.dev.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.desafio.dev"})
public class DesafioPedidoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPedidoApplication.class, args);
	}
	
	   
	   private OrderService orderService;
	   
	   public DesafioPedidoApplication(OrderService orderService) {
		   this.orderService = orderService;
	   }
	
	@Override	
	public void run(String... args) throws Exception {
		  Order order1 = new Order(1034, 150.0, 20.0);
	      Order order2 = new Order(2282, 800.0, 10.0);
	      Order order3 = new Order(1309, 95.90, 0.0);


	      System.out.println("\n--- Pedido 01 ---");
	      System.out.println("Pedido código " + order1.getCode());
	      System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));

	      System.out.println("\n--- Pedido 02 ---");
	      System.out.println("Pedido código " + order2.getCode());
	      System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));

	      System.out.println("\n--- Pedido 03 ---");
	      System.out.println("Pedido código " + order3.getCode());
	      System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
		
	}

}
