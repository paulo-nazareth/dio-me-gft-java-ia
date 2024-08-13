package spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring_data_jpa.model.User;
import spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Paulo H.");
		user.setUserName("PH");
		user.setPassword("adm1234");
		repository.save(user);
		for (User u : repository.findAll()) {
			System.out.println(u);
		}
	}

}
