package com.example.testspringmysql;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Personal, Integer> {

}
