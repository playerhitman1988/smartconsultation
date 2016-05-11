package com.pfe.tn.smartconsultation.service;

import java.util.List;

import com.pfe.tn.smartconsultation.domain.Role;

public interface RoleService {

	public Role create(String name, String description);

	public Role update(String id, String name, String description);

	public Role get(String id);

	public void delete(String id);

	public List<Role> list();

}
