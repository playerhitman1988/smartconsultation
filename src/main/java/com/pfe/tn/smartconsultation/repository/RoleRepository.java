package com.pfe.tn.smartconsultation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pfe.tn.smartconsultation.domain.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String>
// , QueryDslPredicateExecutor<Role>, QuerydslBinderCustomizer<QRole> {
{
}
