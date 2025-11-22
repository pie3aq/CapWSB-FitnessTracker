package pl.wsb.fitnesstracker.event.api;

import java.util.Optional;

public interface EventProvider {
    /**
     * Retrieves health metrics based on their ID.
     * If the health metrics with given ID is not found, then
     * {@link Optional#empty()} will be returned.
     *
     * @param EventProviderId id of the health metrics to be searched
     * @return An {@link Optional} containing the located Event, or
     *         {@link Optional#empty()} if not found
     */
    Optional<Event> getEvent(Long healthMetricsId);
}
