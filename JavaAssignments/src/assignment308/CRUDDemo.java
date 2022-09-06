package assignment308;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDDemo {

	boolean b;
	public boolean depositMoney(int accountNumber) {
		String sql1 = "update bankData set balance=balance+2500 where account_number=2222";
		String sql2 = "update bankData set balance=balance-1500 where account_number=3333";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			
			int no[]=stmt.executeBatch();
			if(no.length>0) {
				b = true;
			}
			else
				b =false;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	return b;
}
}
