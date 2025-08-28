package br.com.NLW.events.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NLW.events.model.Event;
import br.com.NLW.events.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepo;
	
	public Event addNewEvent(Event event) {
		//gerando o pretty name
		event.setPrettyName(event.getTitle().toLowerCase().replaceAll(" ", "-"));
		return eventRepo.save(event);
	}

	public List<Event> getAllEvents(){
		return (List<Event>)eventRepo.findAll();
	}
	
	public Event getByPrettyname(String prettyName) {
		return eventRepo.findByPrettyName(prettyName);
	}
	
}

