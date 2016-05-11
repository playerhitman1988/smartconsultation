package com.pfe.tn.smartconsultation.domain;

import java.util.Calendar;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;

import com.mongodb.DBObject;

public class RoleListener extends AbstractMongoEventListener<Role> {

	@Override
	public void onBeforeSave(Role source, DBObject dbo) {
		if (source.getCreationDate() == null) {
			dbo.put("creationDate", Calendar.getInstance().getTime());
		}else{
			dbo.put("modificationDate", Calendar.getInstance().getTime());
		}
	}

}
