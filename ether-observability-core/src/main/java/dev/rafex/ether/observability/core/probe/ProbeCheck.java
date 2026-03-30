package dev.rafex.ether.observability.core.probe;

/**
 * Función para ejecutar una verificación de probe.
 * Es una interfaz funcional que permite definir verificaciones de salud
 * personalizadas para el sistema de observabilidad.
 */
@FunctionalInterface
public interface ProbeCheck {

    /**
     * Ejecuta la verificación y devuelve el resultado.
     * 
     * @return el resultado de la verificación
     */
    ProbeResult execute();
}
