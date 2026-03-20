package dev.rafex.ether.observability.core.probe;

@FunctionalInterface
public interface ProbeCheck {

    ProbeResult execute();
}
