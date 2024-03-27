package dev.taina.chatlol.domain.ports;

import dev.taina.chatlol.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champion> findAll();
    Optional<Champion> findById(Long id);
}
