package dev.taina.chatlol.domain.ports;

public interface GenerativeAIApi {
    String generateContext(String objective, String context);
}
