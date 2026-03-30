package dev.rafex.ether.observability.core.request;

/**
 * Generador de IDs de petición.
 * Es una interfaz funcional que permite generar identificadores únicos
 * para cada petición HTTP en el sistema de observabilidad.
 */
@FunctionalInterface
public interface RequestIdGenerator {

    /**
     * Genera un nuevo ID de petición.
     * 
     * @return el ID generado
     */
    String nextId();
}
