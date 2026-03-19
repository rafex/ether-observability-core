package dev.rafex.ether.observability.core;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UuidRequestIdGeneratorTest {

	@Test
	void shouldGenerateUniqueRequestIds() {
		final var generator = new UuidRequestIdGenerator();
		final var first = generator.nextId();
		final var second = generator.nextId();

		assertTrue(first.contains("-"));
		assertNotEquals(first, second);
	}
}
