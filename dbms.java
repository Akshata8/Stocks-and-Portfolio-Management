package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbms {
			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn=null;
				conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","2vd16cs002");
			    if(conn != null)
			    	System.out.println("Connected");
			    else
			    	System.out.println("Not Connected");
				conn.close();
			}

		}

