package dev.rafex.ether.observability.core;

@FunctionalInterface
public interface ProbeCheck {

	ProbeResult execute();
}
