package dev.taina.chatlol.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
    public String generateContextByQuestion(String question) {
        // Criando contexto para pegar mais informações sobre o campeão e associar
        // as IAs Generativas
        return """
                Pergunta: %s
                Nome do campeão: %s
                Função (role): %s
                História (lore): %s
                """.formatted(question, this.name, this.role, this.lore);
    }
}
