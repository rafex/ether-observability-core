package dev.rafex.ether.observability.core;

@FunctionalInterface
public interface TimingRecorder {

	void record(TimingSample sample);
}
