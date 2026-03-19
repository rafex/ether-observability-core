package dev.rafex.ether.observability.core;

import java.util.UUID;

public final class UuidRequestIdGenerator implements RequestIdGenerator {

	@Override
	public String nextId() {
		return UUID.randomUUID().toString();
	}
}
