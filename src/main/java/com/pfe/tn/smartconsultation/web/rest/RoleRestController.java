package com.pfe.tn.smartconsultation.web.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.tn.smartconsultation.domain.Role;
import com.pfe.tn.smartconsultation.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleRestController {

	@Resource
	private RoleService service;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = { "application/json" })
	private Role gerRole(@PathVariable("id") String id) {
		return service.get(id);
	}
}
