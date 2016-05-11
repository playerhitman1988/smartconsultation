package com.pfe.tn.smartconsultation.application;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.pfe.tn.smartconsultation.domain.Role;

public class ApplicationInit {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void init() {
		mongoTemplate.dropCollection(Role.class);

		// Create new records
		Role adminRole = new Role();
		adminRole.setId(UUID.randomUUID().toString());
		adminRole.setName("Administrator");
		adminRole.setDescription("This is the administrator role");

		Role doctorRole = new Role();
		doctorRole.setId(UUID.randomUUID().toString());
		doctorRole.setName("Doctor");
		doctorRole.setDescription("This is the doctor role");

		mongoTemplate.insert(adminRole, "role");
		mongoTemplate.insert(doctorRole, "role");
	}

}
