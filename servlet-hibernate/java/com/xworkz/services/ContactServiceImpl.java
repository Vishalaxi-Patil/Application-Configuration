package com.xworkz.services;

import com.xworkz.dao.ContactDaoImpl;
import com.xworkz.dao.ContactFormDao;
import com.xworkz.entity.ContactForm;

public class ContactServiceImpl implements ContactService {
	public ContactServiceImpl() {
		System.out.println("created ContactServiceImpl");
	}

	@Override
	public boolean validateAndSave(ContactForm entity) {
		System.out.println("invoked validate and save");
		System.out.println("enity :" + entity);
		boolean valid = true;
		if (entity != null) {
			if (valid) {
				String name = entity.getName();
				if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
					System.out.println("Name is valid ");
					valid = true;
				} else {
					System.out.println("name is not valid");
					valid = false;
				}
			}
			if (valid) {
				String email = entity.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {

					System.out.println("email is valid ");
					valid = true;
				} else {
					System.out.println("email is not valid ");
					valid = false;
				}
			}
			
		

			if (valid) {
				String self = entity.getYourself();
				if (self != null && !self.isEmpty()) {

					System.out.println("self is valid ");
					valid = true;
				} else {
					System.out.println("self is not valid");
					valid = false;
				}
			}

		}
		if (valid) {
			ContactFormDao dao = new ContactDaoImpl();

			dao.save(entity);
			System.out.println("Contact is saved");
		} else {
			System.out.println("contact is not saved");
		}

		return valid;

	}
}
