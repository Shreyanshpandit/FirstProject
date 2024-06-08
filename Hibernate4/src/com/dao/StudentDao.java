package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.config.Config;
import com.entity.Student;

public class StudentDao {

	private SessionFactory sf = Config.getConnection();

	public List<Student> countMarks() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.count("id"));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> maxPer() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.max("per"));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> minPer() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.min("per"));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> sumMarks() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.sum("marks"));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> rowsCount() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.rowCount());
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> avgMarks() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.setProjection(Projections.avg("marks"));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> startWith() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.add(Restrictions.like("s_name", "s", MatchMode.START));
		cr.add(Restrictions.like("s_name", "r", MatchMode.END));

		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> startWithPer() {
		Session sn = sf.openSession();
		Criteria cr = sn.createCriteria(Student.class);
		cr.add(Restrictions.like("per", "7", MatchMode.START));
		List<Student> ls = cr.list();

		return ls;
	}

	public List<Student> readStudent() {
		Session sn = sf.openSession();
		Query qr = sn.createQuery("from Student");
		List<Student> ls = qr.list();
		return ls;
	}

	public int upadteStudent()  {
		Session sn = sf.openSession();
		Transaction tr = sn.beginTransaction();
		String hql = "update  Student set marks=:a,s_name=:b where id=:c";
		Query query = sn.createQuery(hql);
		query.setParameter("a", 280);
		query.setParameter("b", "ajit");
		query.setParameter("c", 2);
		int check = query.executeUpdate();
		tr.commit();
		return check;
	}
	
	public int deleteStudent()  {
		Session sn = sf.openSession();
		Transaction tr = sn.beginTransaction();
		String hql = "delete  Student where id=:a";
		Query query = sn.createQuery(hql);
	    query.setParameter("a", 2);
		int check = query.executeUpdate();
		tr.commit();
		return check;
	}
	
//	public int insertStudent()  {
//		Session sn = sf.openSession();
//		Transaction tr = sn.beginTransaction();
//		String hql = "insert into Student (:a,:b,:c,:d,:e,:f)"+"select(id,s_name,marks,per,grade,remark)from Student ";
//		Query query = sn.createQuery(hql);
//		query.setParameter("a", 2);
//		query.setParameter("b", "ajit");
//		query.setParameter("c", 280);
//		query.setParameter("d", "70");
//		query.setParameter("e", "A");
//		query.setParameter("f", "pass");
//		int check = query.executeUpdate();
//		tr.commit();
//		return check;
//	}
	

}