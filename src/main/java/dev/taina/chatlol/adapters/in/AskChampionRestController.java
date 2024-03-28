package dev.taina.chatlol.adapters.in;

import dev.taina.chatlol.application.AskChampionUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões", description = "Endpoints do domínio de campeões do LOL")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    // permitir uso da API de forma local
    // permitir que usuários/clientes de diferentes domínios em relação ao que a API foi publicada
    // consiga ter acesso a mesma, consumir, sem restrições de segurança
    // não recomendado em termos de segurança
    // colocada para fins didáticos do curso
    @CrossOrigin
    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(@PathVariable Long championId, @RequestBody AskChampionRequest request) {
        String answer = useCase().askChampion(championId, request.question());

        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) {}
    public record AskChampionResponse(String answer) {}
}
