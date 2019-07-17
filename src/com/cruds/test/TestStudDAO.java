package com.cruds.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.cruds.db.DBConnectionManager;
import com.cruds.db.StudentDAO;
import com.cruds.training.Student;

public class TestStudDAO {

	@Test
	public void testCreate() {
		StudentDAO dao = new StudentDAO();
		//assertTrue(dao.create(new Student(111,"Kiran")));
		assertNotNull(dao.getByRollNo(111));
	}
	
	@Test
	public void testConn()
	{
		Connection conn = DBConnectionManager.getConnection();
		assertNotNull(conn);
	}

}
