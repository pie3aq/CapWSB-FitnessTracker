package pl.wsb.fitnesstracker.event.api;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional(readOnly = true)
public class EventRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Event> findByCity(String city) {
        TypedQuery<Event> q = em.createQuery("SELECT e FROM Event e WHERE e.city = :city", Event.class);
        return q.setParameter("city", city).getResultList();
    }
}
