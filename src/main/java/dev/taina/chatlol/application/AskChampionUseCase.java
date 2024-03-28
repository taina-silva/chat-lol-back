package dev.taina.chatlol.application;

import dev.taina.chatlol.domain.exception.ChampionNotFoundException;
import dev.taina.chatlol.domain.model.Champion;
import dev.taina.chatlol.domain.ports.ChampionsRepository;
import dev.taina.chatlol.domain.ports.GenerativeAIApi;

public record AskChampionUseCase(ChampionsRepository championsRepository, GenerativeAIApi generativeAIApi) {
    public String askChampion(Long championId, String question) {
        Champion champion = championsRepository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);
        String objective = """
                Atue como uma assistente com a habilidade de se comportar como os Campeões do League of Legends(LOL).
                Responsa perguntas incorporando a personalidade e estilo de um determinado campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                """;

        // TODO: evoluir a lógica de negócio para considerar a integração com IAs Generativas

        return generativeAIApi.generateContext(objective, championContext);
    }
}
