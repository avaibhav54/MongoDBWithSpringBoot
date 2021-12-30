package com.app.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.Models.Student;

public interface studentRepo extends MongoRepository<Student, Integer> {

}
