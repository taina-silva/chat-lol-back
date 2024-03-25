package dev.taina.chatlol.domain.ports;

import dev.taina.chatlol.domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champions> findAll();
    Optional<Champions> findById(Long id);
}
