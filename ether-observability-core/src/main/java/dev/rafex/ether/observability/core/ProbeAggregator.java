package dev.rafex.ether.observability.core;

import java.util.ArrayList;
import java.util.List;

public final class ProbeAggregator {

	private ProbeAggregator() {
	}

	public static ProbeReport aggregate(final ProbeKind kind, final List<ProbeCheck> checks) {
		final var results = new ArrayList<ProbeResult>();
		for (final var check : checks == null ? List.<ProbeCheck>of() : checks) {
			results.add(check.execute());
		}
		return new ProbeReport(kind, aggregateStatus(results), results);
	}

	private static ProbeStatus aggregateStatus(final List<ProbeResult> results) {
		boolean degraded = false;
		for (final var result : results) {
			if (result.status() == ProbeStatus.DOWN) {
				return ProbeStatus.DOWN;
			}
			if (result.status() == ProbeStatus.DEGRADED) {
				degraded = true;
			}
		}
		return degraded ? ProbeStatus.DEGRADED : ProbeStatus.UP;
	}
}
