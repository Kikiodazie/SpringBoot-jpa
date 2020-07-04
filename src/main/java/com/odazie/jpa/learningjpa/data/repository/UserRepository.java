package com.odazie.jpa.learningjpa.data.repository;

import com.odazie.jpa.learningjpa.data.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, String> {

}
