package dev.taina.chatlol.application;

import dev.taina.chatlol.domain.model.Champion;
import dev.taina.chatlol.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository championsRepository) {
    public List<Champion> findAll() {
        return championsRepository.findAll();
    }
}
