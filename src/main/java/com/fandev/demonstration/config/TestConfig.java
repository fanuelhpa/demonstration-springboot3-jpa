package com.fandev.demonstration.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fandev.demonstration.entities.Category;
import com.fandev.demonstration.entities.Order;
import com.fandev.demonstration.entities.Product;
import com.fandev.demonstration.entities.User;
import com.fandev.demonstration.entities.enums.OrderStatus;
import com.fandev.demonstration.repositories.CategoryRepository;
import com.fandev.demonstration.repositories.OrderRepository;
import com.fandev.demonstration.repositories.ProductRepository;
import com.fandev.demonstration.repositories.UserRepository;

//Realiza o seeding da aplicação

@Configuration
@Profile("test")					
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-11-30T11:46:00Z"), OrderStatus.Paid, u1);
		Order o2 = new Order(null, Instant.parse("2022-11-21T08:46:02Z"), OrderStatus.Waiting_Payment, u2);
		Order o3 = new Order(null, Instant.parse("2022-11-12T09:50:09Z"), OrderStatus.Waiting_Payment, u1);
			
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
		
}
