package dev.rafex.ether.observability.core.timing;

@FunctionalInterface
public interface TimingRecorder {

    void record(TimingSample sample);
}
