package com.sec;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sec.dao.EtudiantRepository;
import com.sec.entities.Etudiant;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringSecurityApplication.class, args);
		
		EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		/*etudiantRepository.save(new Etudiant("akoua","yao",df.parse("1995-01-25")));
		etudiantRepository.save(new Etudiant("gnanzou","ebanda",df.parse("1998-01-25")));
		etudiantRepository.save(new Etudiant("moi","encore",df.parse("1995-01-24")));
		*/
		
		etudiantRepository.findAll().stream()
			.forEach(e -> System.out.println(e.getNom()));
	}
}
