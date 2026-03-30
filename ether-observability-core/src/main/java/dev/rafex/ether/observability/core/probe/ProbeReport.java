package dev.rafex.ether.observability.core.probe;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Reporte de resultados de probes de verificación.
 * Es un record inmutable que contiene el tipo de probe, el estado agregado
 * y los resultados individuales de cada verificación.
 * 
 * @param kind el tipo de probe
 * @param status el estado agregado
 * @param results los resultados individuales
 */
public record ProbeReport(ProbeKind kind, ProbeStatus status, List<ProbeResult> results) {

    public ProbeReport {
        if (kind == null || status == null) {
            throw new IllegalArgumentException("kind and status are required");
        }
        results = results == null ? List.of() : List.copyOf(results);
    }

    /**
     * Devuelve un mapa con el nombre de cada probe y su estado.
     * 
     * @return mapa de nombres a estados
     */
    public Map<String, ProbeStatus> byName() {
        final var out = new LinkedHashMap<String, ProbeStatus>();
        for (final var result : results) {
            out.put(result.name(), result.status());
        }
        return Map.copyOf(out);
    }
}
