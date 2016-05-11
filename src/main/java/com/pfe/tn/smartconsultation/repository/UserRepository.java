package com.pfe.tn.smartconsultation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.tn.smartconsultation.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	// , QueryDslPredicateExecutor<User>, QuerydslBinderCustomizer<QUser>

}
