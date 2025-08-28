package br.com.NLW.events.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.NLW.events.model.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {
	public Event findByPrettyName(String prettyName);
}
