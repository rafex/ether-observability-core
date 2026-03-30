package dev.rafex.ether.observability.core.request;

import java.util.UUID;

/**
 * Generador de IDs de petición basado en UUID.
 * Crea identificadores únicos universales (UUID) para cada petición.
 */
public final class UuidRequestIdGenerator implements RequestIdGenerator {

    /**
     * Genera un nuevo ID de petición basado en UUID.
     * 
     * @return un UUID aleatorio como string
     */
    @Override
    public String nextId() {
        return UUID.randomUUID().toString();
    }
}
