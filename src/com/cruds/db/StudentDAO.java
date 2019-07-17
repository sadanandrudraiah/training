package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.training.Student;

public class StudentDAO {
	
	public boolean update(Student student)
	{
		String sql = "update student set name=? where rollno=?";
		int rows = 0;
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setInt(2, student.getRollNo());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	public boolean delete(int rollNo)
	{
		String sql = "delete from student where rollno=?";
		int rows = 0;
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	
	public List<Student> getAllStudent()
	{
		String sql = "select rollno,name from student";
		Student s = null;
		ArrayList<Student> list = new ArrayList<>();
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next())
			{
				s = new Student(rs.getInt(1), rs.getString(2));
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Student getByRollNo(int rollNo)
	{
		String sql = "select name from student where rollno=?";
		Student s = null;
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollNo);
			
			ResultSet rs = ps.executeQuery();
			if(rs != null && rs.next())
			{
				s = new Student(rollNo, rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	
	public boolean create(Student student)
	{
		String sql = "insert into student(rollno,name) values(?,?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getRollNo());
			ps.setString(2, student.getName());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows > 0;
	}
	
	
}
