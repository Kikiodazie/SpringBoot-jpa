package com.odazie.jpa.learningjpa.data.repository;

import com.odazie.jpa.learningjpa.data.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String> {

}
