package com.ibm.test.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import com.ibm.test.springboot.entity.User;
import com.ibm.test.springboot.repository.UserRepoitory;

@SpringBootApplication
public class SpringbootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootProjectApplication.class, args);
		UserRepoitory userRepository = context.getBean(UserRepoitory.class);

		/*
		 * User user = new User(); user.setName("Abhijeet"); user.setCity("Bangalore");
		 * user.setStatus("Software consultant!!!");
		 */

		/*
		 * User user1 = new User(); user1.setName("Abhishek"); user1.setCity("Ranchi");
		 * user1.setStatus("Vice president!!!");
		 */

		// List<User> users = List.of(user,user1);
		// Iterable<User> result = userRepository.saveAll(users);
		/*
		 * result.forEach(user5->{ System.out.println(user5); });
		 */

		// User result = userRepository.save(user);
		// User result1 = userRepository.save(user1);
		// System.out.println( "done");

		/*
		 * Optional<User> optional = userRepository.findById(5); User user =
		 * optional.get(); System.out.println(user);
		 * 
		 * user.setName("Abhishek Gupta"); User result = userRepository.save(user);
		 * System.out.println(result);
		 */
		/*
		 * List<User> users = userRepository.findByName("Abhijeet");
		 * users.forEach(e->System.out.println(e));
		 */
		List<User> users = userRepository.findByNameAndCity("Abhishek Gupta", "Ranchi");
		System.out.println(users);
	
	}

}
