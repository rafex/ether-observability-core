package dev.rafex.ether.observability.core.probe;

/**
 * Tipos de probes de verificación disponibles.
 */
public enum ProbeKind {
    /** Verifica si el servicio está respondiendo (health check) */
    HEALTH,
    /** Verifica si el servicio está listo para recibir tráfico (readiness check) */
    READINESS
}
