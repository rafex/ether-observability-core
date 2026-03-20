package dev.rafex.ether.observability.core.request;

@FunctionalInterface
public interface RequestIdGenerator {

    String nextId();
}
