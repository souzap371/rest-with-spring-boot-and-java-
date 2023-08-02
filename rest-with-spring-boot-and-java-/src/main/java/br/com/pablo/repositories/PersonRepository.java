package br.com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pablo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
