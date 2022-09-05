package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.MyConnection;

public class ExecuteDemo {

	public void executeSQL1() {
		String sql="insert into employee values(1,'poonam',56000)";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			boolean type=stmt.execute(sql);   // only for select query it will return true
			System.out.println(type);
			if(type==false) {
				int no=stmt.getUpdateCount();
				System.out.println("Number of row affected:"+no);
			}
			else {
				System.out.println("query is select type");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void executeSQL2() {
		String sql="select emp_id, emp_name from employee";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			boolean type=stmt.execute(sql);   // only for select query it will return true
			System.out.println(type);
			if(type==false) {
				int no=stmt.getUpdateCount();
				System.out.println("Number of row affected:"+no);
			}
			else {
				ResultSet rs=stmt.getResultSet();
				// iterate rs
				while(rs.next()) {
					int id=rs.getInt("emp_id");
					System.out.println(id);
					String name=rs.getString("emp_name");
					System.out.println(name);
				}
				}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	ExecuteDemo demo=	new ExecuteDemo();
	demo.executeSQL1();
	//demo.executeSQL2();
	}
	
	/*
	 * 								executeUpdate                        executeQuery                             execute
	 * return type            int							                  ResultSet				                       boolean
	 * meaning					number of rows affected  Rows fetched stored in rs      true for select, false for any
	 * type of SQL				DML						                   Select(DQL)			                          any
	 * 
	 * 
	 * */
}