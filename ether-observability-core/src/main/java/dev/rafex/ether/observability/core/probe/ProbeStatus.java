package dev.rafex.ether.observability.core.probe;

/**
 * Estados de salud disponibles para probes.
 */
public enum ProbeStatus {
    /** El servicio está operativo y respondiendo correctamente */
    UP,
    /** El servicio no está disponible o no responde */
    DOWN,
    /** El servicio está operativo pero con degradación de rendimiento o funcionalidad */
    DEGRADED
}
