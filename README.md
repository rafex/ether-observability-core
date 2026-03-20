# ether-observability-core

Portable observability primitives for Ether.

## Scope

- Request ID generation and propagation contracts
- Timing samples and recorder abstraction
- Health and readiness checks
- Aggregation model for probes and reports

## Current integration

- `ether-http-jetty12` uses this module for request-id generation and request timing capture.
- The abstractions are intentionally neutral so later adapters can plug into Glowroot, Micrometer or OpenTelemetry without changing application code.

## Maven

```xml
<dependency>
  <groupId>dev.rafex.ether.observability</groupId>
  <artifactId>ether-observability-core</artifactId>
  <version>8.0.0-SNAPSHOT</version>
</dependency>
```
