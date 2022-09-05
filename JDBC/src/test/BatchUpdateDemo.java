package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import connection.MyConnection;

public class BatchUpdateDemo {
	
	public void test() {
		String sql1="alter table employee add qualification varchar(50)";
		String sql2="create table emp (id int primary key)";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			int no[]=stmt.executeBatch(); /*it will not work for select queries*/
			for(int i=0;i<no.length;i++)
				System.out.println(no[i]);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	//new BatchUpdateDemo().test();
	String sql1="insert into employee values (111,'Krupa',67000)";
	String sql2="insert into employee values (222,'Deepa',67000)";
	String sql3="update employee set emp_salary=45000 where emp_id=1";
	String sql4="delete from employee where emp_id=67";
	
	try(Connection conn=MyConnection.connect()){
		Statement stmt=conn.createStatement();
		
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		stmt.addBatch(sql4);
		
		int no[]=stmt.executeBatch();
		for(int i=0;i<no.length;i++)
			System.out.println(no[i]);
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}