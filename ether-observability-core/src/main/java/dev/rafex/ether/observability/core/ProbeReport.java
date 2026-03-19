package dev.rafex.ether.observability.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public record ProbeReport(ProbeKind kind, ProbeStatus status, List<ProbeResult> results) {

	public ProbeReport {
		if (kind == null || status == null) {
			throw new IllegalArgumentException("kind and status are required");
		}
		results = results == null ? List.of() : List.copyOf(results);
	}

	public Map<String, ProbeStatus> byName() {
		final var out = new LinkedHashMap<String, ProbeStatus>();
		for (final var result : results) {
			out.put(result.name(), result.status());
		}
		return Map.copyOf(out);
	}
}
