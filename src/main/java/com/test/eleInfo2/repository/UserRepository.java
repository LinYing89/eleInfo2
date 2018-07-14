package com.test.eleInfo2.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.eleInfo2.data.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
