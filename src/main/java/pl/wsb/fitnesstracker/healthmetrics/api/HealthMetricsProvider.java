package pl.wsb.fitnesstracker.healthmetrics.api;

import java.util.Optional;

public interface HealthMetricsProvider {

    /**
     * Retrieves health metrics based on their ID.
     * If the health metrics with given ID is not found, then {@link Optional#empty()} will be returned.
     *
     * @param healthMetricsId id of the health metrics to be searched
     * @return An {@link Optional} containing the located HealthMetrics, or {@link Optional#empty()} if not found
     */
    Optional<HealthMetrics> getHealthMetrics(Long healthMetricsId);

}
