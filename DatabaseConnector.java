import java.sql.Connection;

public static Connection getconnection(){
	Connection cr= null;
	String url= null; 
	String driverClass = null;
	url= "jdbc:mysql://localhost:3306/csit_third";
	driverClass= "com.mysql.jdbc.Driver";
	Class.forName(driverClass);          // loading the driver 
	
	
	return cr;
	
 }
