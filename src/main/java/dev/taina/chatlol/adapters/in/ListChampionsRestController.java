package dev.taina.chatlol.adapters.in;

import dev.taina.chatlol.application.ListChampionsUseCase;
import dev.taina.chatlol.domain.model.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do domínio de campeões do LOL")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }
}
