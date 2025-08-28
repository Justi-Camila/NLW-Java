package br.com.NLW.events.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.NLW.events.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	public User findByEmail(String email);
}
