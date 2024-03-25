package dev.taina.chatlol.domain.model;

public record Champions (
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {

}
