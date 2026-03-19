package dev.rafex.ether.observability.core;

public record ProbeResult(String name, ProbeKind kind, ProbeStatus status, String detail) {

	public ProbeResult {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("name is required");
		}
		if (kind == null || status == null) {
			throw new IllegalArgumentException("kind and status are required");
		}
		detail = detail == null ? "" : detail;
	}
}
