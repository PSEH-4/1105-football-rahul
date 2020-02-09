package com.sapient.gateway.repository;

import com.sapient.gateway.dto.AuthenticationResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AuthenticationRepository extends MongoRepository<AuthenticationResponse, String> {

    void deleteAllByValidityBefore(Date date);
}
