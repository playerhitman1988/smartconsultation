package com.pfe.tn.smartconsultation.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pfe.tn.smartconsultation.domain.Role;
import com.pfe.tn.smartconsultation.repository.RoleRepository;
import com.pfe.tn.smartconsultation.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	// @Autowired
	private RoleRepository roleRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Role create(String name, String description) {
		Role r = new Role();
		r.setName(name);
		r.setDescription(description);
		return roleRepository.save(r);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Role update(String id, String name, String description) {
		Role r = get(id);
		if (r == null)
			throw new IllegalArgumentException("No Role found with the given id " + id);
		if (name != null)
			r.setName(name);
		if (description != null)
			r.setDescription(description);
		return roleRepository.save(r);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public Role get(String id) {
		return roleRepository.findOne(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void delete(String id) {
		roleRepository.delete(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Role> list() {
		return roleRepository.findAll();
	}

}
