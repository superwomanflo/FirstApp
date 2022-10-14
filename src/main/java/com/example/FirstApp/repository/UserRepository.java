package com.example.FirstApp.repository;

import com.example.FirstApp.entity.Userproperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Userproperty, Long> {

    List<Userproperty> findByName(String name);
}

