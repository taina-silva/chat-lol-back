package dev.taina.chatlol;

import dev.taina.chatlol.application.AskChampionUseCase;
import dev.taina.chatlol.application.ListChampionsUseCase;
import dev.taina.chatlol.domain.ports.ChampionsRepository;
import dev.taina.chatlol.domain.ports.GenerativeAIApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class ChatLolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatLolApplication.class, args);
	}

	// injeção de dependências de UseCases aos Controllers
	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository) {
		return new ListChampionsUseCase(championsRepository);
	}

	@Bean
	public AskChampionUseCase provideAskChampionUseCase(ChampionsRepository championsRepository, GenerativeAIApi generativeAIApi) {
		return new AskChampionUseCase(championsRepository, generativeAIApi);
	}
}