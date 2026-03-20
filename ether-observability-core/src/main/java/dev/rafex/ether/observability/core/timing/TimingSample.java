package dev.rafex.ether.observability.core.timing;

import java.time.Duration;
import java.time.Instant;

public record TimingSample(String name, Instant startedAt, Instant finishedAt) {

    public TimingSample {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (startedAt == null || finishedAt == null) {
            throw new IllegalArgumentException("startedAt and finishedAt are required");
        }
    }

    public Duration duration() {
        return Duration.between(startedAt, finishedAt);
    }
}
