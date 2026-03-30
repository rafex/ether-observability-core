package dev.rafex.ether.observability.core.probe;

/**
 * Resultado individual de una verificación de probe.
 * Es un record inmutable que contiene el nombre, tipo, estado y detalles
 * de una verificación específica.
 * 
 * @param name el nombre de la verificación
 * @param kind el tipo de probe
 * @param status el estado resultante
 * @param detail detalles adicionales (puede ser vacío)
 */
public record ProbeResult(String name, ProbeKind kind, ProbeStatus status, String detail) {

    public ProbeResult {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (kind == null || status == null) {
            throw new IllegalArgumentException("kind and status are required");
        }
        detail = detail == null ? "" : detail;
    }
}
