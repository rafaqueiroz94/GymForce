package com.gym.gymforce;

import com.gym.gymforce.Entity.NewClientEntity;
import com.gym.gymforce.Repository.NewClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymforceApplication implements CommandLineRunner {

	@Autowired
	public NewClientRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(GymforceApplication.class, args);
	}


	public void run(String... args) throws Exception {

		repository.save(new NewClientEntity ("Rafael Queiroz","13/03/1994","42021749843", true));
		repository.save(new NewClientEntity ("Raquel Queiroz de Sousa","19/08/2000","12345678922", true));
		repository.save(new NewClientEntity ("Marcia Cristina","30/10/1964","06428286828", true));
		repository.save(new NewClientEntity ("Marcos França","15/12/1999","98765432111", true));
	}





}
