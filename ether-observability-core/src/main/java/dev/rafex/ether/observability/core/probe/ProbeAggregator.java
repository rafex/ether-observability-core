package dev.rafex.ether.observability.core.probe;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilidad para agregar resultados de múltiples probes de verificación.
 * Calcula el estado agregado basado en los resultados individuales.
 */
public final class ProbeAggregator {

    private ProbeAggregator() {
        // Clase de utilidad - no instanciable
    }

    /**
     * Agrega los resultados de múltiples probes de verificación.
     * 
     * @param kind el tipo de probe
     * @param checks las verificaciones a ejecutar
     * @return el reporte con el estado agregado
     */
    public static ProbeReport aggregate(final ProbeKind kind, final List<ProbeCheck> checks) {
        final var results = new ArrayList<ProbeResult>();
        for (final var check : checks == null ? List.<ProbeCheck>of() : checks) {
            results.add(check.execute());
        }
        return new ProbeReport(kind, aggregateStatus(results), results);
    }

    /**
     * Calcula el estado agregado basado en los resultados individuales.
     * 
     * @param results lista de resultados de probes
     * @return el estado agregado (DOWN si hay algún DOWN, DEGRADED si hay algún DEGRADED, UP si todos UP)
     */
    private static ProbeStatus aggregateStatus(final List<ProbeResult> results) {
        boolean degraded = false;
        for (final var result : results) {
            if (result.status() == ProbeStatus.DOWN) {
                return ProbeStatus.DOWN;
            }
            if (result.status() == ProbeStatus.DEGRADED) {
                degraded = true;
            }
        }
        return degraded ? ProbeStatus.DEGRADED : ProbeStatus.UP;
    }
}
