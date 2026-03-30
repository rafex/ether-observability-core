package dev.rafex.ether.observability.core.timing;

/**
 * Grabador de muestras de tiempo.
 * Es una interfaz funcional que permite registrar métricas de tiempo
 * para operaciones del sistema.
 */
@FunctionalInterface
public interface TimingRecorder {

    /**
     * Registra una muestra de tiempo.
     * 
     * @param sample la muestra a registrar
     */
    void record(TimingSample sample);
}
