package com.desafio.dev.services;

import org.springframework.stereotype.Service;

import com.desafio.dev.entities.Order;

@Service
public class OrderService {

	ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	
	
	public Double total(Order order) {
		double desc = order.getBasic() * (order.getDiscont()/ 100);
		return (order.getBasic() - desc) + shippingService.shipment(order);
	}
	
	
	
}
