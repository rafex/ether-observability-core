package dev.rafex.ether.observability.core;

@FunctionalInterface
public interface RequestIdGenerator {

	String nextId();
}
