package com.huxley.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huxley.addressbook.entity.User;



public interface UserRepository extends JpaRepository<User, Integer>{

}
