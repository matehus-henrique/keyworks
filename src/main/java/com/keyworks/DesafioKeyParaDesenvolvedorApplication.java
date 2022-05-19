package com.keyworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.keyworks.domain.Cards;
import com.keyworks.repositories.CardsRepository;

@SpringBootApplication
public class DesafioKeyParaDesenvolvedorApplication implements CommandLineRunner {

	@Autowired
	private CardsRepository cardsRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioKeyParaDesenvolvedorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat hoje = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		
		Cards card1 = new Cards(null, "João", "java", "fazer uma API em java", "Em andamento", hoje.parse("18/05/2022 10:52"));
		
		Cards card2 = new Cards(null, "Pedro", "php", "fazer uma API em php", "Em andamento", hoje.parse("18/05/2022 10:52"));
		
		Cards card3 = new Cards(null, "Lucas", "java", "fazer uma API em java", "Pronto", hoje.parse("18/05/2022 10:52"));
		
		Cards card4 = new Cards(null, "Maria", "php", "fazer uma API em php", "Em andamento", hoje.parse("18/05/2022 10:52"));
		
		cardsRepository.saveAll(Arrays.asList(card1,card2,card3,card4));
	}

}
