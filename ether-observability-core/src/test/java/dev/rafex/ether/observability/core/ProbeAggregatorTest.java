package dev.rafex.ether.observability.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProbeAggregatorTest {

	@Test
	void shouldAggregateToDownWhenAnyProbeIsDown() {
		final var report = ProbeAggregator.aggregate(ProbeKind.HEALTH, List.of(
				() -> new ProbeResult("db", ProbeKind.HEALTH, ProbeStatus.UP, ""),
				() -> new ProbeResult("cache", ProbeKind.HEALTH, ProbeStatus.DOWN, "timeout")));

		assertEquals(ProbeStatus.DOWN, report.status());
		assertEquals(ProbeStatus.UP, report.byName().get("db"));
		assertEquals(ProbeStatus.DOWN, report.byName().get("cache"));
	}
}
