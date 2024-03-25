package dev.taina.chatlol.application;

import dev.taina.chatlol.domain.model.Champions;
import dev.taina.chatlol.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository championsRepository) {
    public List<Champions> findAll() {
        return championsRepository.findAll();
    }
}
