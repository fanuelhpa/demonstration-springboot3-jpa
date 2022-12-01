package com.fandev.demonstration.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fandev.demonstration.entities.Order;
import com.fandev.demonstration.entities.User;
import com.fandev.demonstration.entities.enums.OrderStatus;
import com.fandev.demonstration.repositories.OrderRepository;
import com.fandev.demonstration.repositories.UserRepository;

//Realiza o seeding da aplicação

@Configuration
@Profile("test")					
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-11-30T11:46:00Z"), OrderStatus.Paid, u1);
		Order o2 = new Order(null, Instant.parse("2022-11-21T08:46:02Z"), OrderStatus.Waiting_Payment, u2);
		Order o3 = new Order(null, Instant.parse("2022-11-12T09:50:09Z"), OrderStatus.Waiting_Payment, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
