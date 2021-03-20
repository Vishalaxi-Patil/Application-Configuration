package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	private static SessionFactory fact;

	public static SessionFactory getFact() {
		return fact;
	}

	static {
		try {
			Configuration con = new Configuration();
			con.configure();
			fact = con.buildSessionFactory();
			if (fact != null) {
				System.out.println("SF util created successfully");
			} else {
				throw new SessionException("Sf util is not created");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
