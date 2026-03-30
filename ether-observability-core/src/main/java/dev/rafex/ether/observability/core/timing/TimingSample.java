package dev.rafex.ether.observability.core.timing;

import java.time.Duration;
import java.time.Instant;

/**
 * Muestra de tiempo para medir la duración de una operación.
 * Es un record inmutable que contiene el nombre de la operación,
 * el momento de inicio y el momento de fin.
 * 
 * @param name el nombre de la operación
 * @param startedAt el instante de inicio
 * @param finishedAt el instante de fin
 */
public record TimingSample(String name, Instant startedAt, Instant finishedAt) {

    public TimingSample {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (startedAt == null || finishedAt == null) {
            throw new IllegalArgumentException("startedAt and finishedAt are required");
        }
    }

    /**
     * Calcula la duración entre el inicio y el fin.
     * 
     * @return la duración de la operación
     */
    public Duration duration() {
        return Duration.between(startedAt, finishedAt);
    }
}
