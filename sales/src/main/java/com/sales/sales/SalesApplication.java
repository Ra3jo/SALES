package com.sales.sales;
import java.sql.*;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesApplication {
	String url = "jdbc:mysql://localhost:3306/rabandb";
	String user = "root";
	String password = "Rb10000@";

	Connection con = DriverManager.getConnection(url, user, password);

	public SalesApplication() throws SQLException {
	}


	public static void main(String[] args) {
		SpringApplication.run(SalesApplication.class, args);
	}

}
