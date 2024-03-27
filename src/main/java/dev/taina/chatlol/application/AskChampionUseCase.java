package dev.taina.chatlol.application;

import dev.taina.chatlol.domain.exception.ChampionNotFoundException;
import dev.taina.chatlol.domain.model.Champion;
import dev.taina.chatlol.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository championsRepository) {
    public String askChampion(Long championId, String question) {
        Champion champion = championsRepository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);

        // TODO: evoluir a lógica de negócio para considerar a integração com IAs Generativas

        return championContext;
    }
}
