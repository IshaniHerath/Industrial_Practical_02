package com.wisdom.j2ee.practical2.manager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wisdom.j2ee.practical2.pojo.Teacher;

public class TeacherManager {

	public boolean saveStudentData(Teacher teacher) {
		Session session = null;
		Transaction transaction = null;
		boolean saveState = false;	

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			saveState = true;
		} catch (Exception ex) {
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return saveState;
	}
}