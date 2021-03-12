package com.huxley.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huxley.addressbook.entity.Address;
import com.huxley.addressbook.entity.User;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
