package com.docker.producer.controller.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class EmployeeDao {
	
	@PostConstruct
	public void connectToDB() {
	
		try {
	Connection con =	DriverManager.getConnection("jdbc:mysql://mysqldb:3306/bootdb", "root", "root");
	
            Statement st = con.createStatement();
			/*
			 * ResultSet rs = st.executeQuery("select * from employee"); if(rs.next()) {
			 * System.out.println("Id"+rs.getInt(1)+" name "+rs.getString(2)); }
			 */
       boolean status=st.execute("create table employee(id int primary key,name varchar(200))");
		
	
		}catch (SQLException e) {
			e.printStackTrace();
		}
		}

}
