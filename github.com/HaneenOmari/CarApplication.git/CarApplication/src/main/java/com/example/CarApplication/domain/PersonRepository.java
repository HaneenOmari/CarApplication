package com.example.CarApplication.domain;



import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Owner, Long> {

}
