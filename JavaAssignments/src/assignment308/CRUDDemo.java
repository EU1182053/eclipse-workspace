package assignment308;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDDemo implements CustomerDao {

	boolean b;
	public boolean depositMoney() {
		String sql1 = "update bankData set balance=balance+2500 where account_number=2222";
		String sql2 = "update bankData set balance=balance+1500 where account_number=3333";
		String sql3 = "update bankData set balance=balance+4500 where account_number=4444";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
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


	public boolean withdrawMoney() {
		String sql1 = "update bankData set balance=balance-2500 where account_number=2222";
		String sql2 = "update bankData set balance=balance-1500 where account_number=3333";
		String sql3 = "update bankData set balance=balance-4500 where account_number=4444";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
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

	
	public boolean transferMoney() {
		String sql1 = "update bankData set balance=balance-2500 where account_number=2222";
		String sql2 = "update bankData set balance=balance+2500 where account_number=3333";
		String sql3 = "update bankData set balance=balance-4500 where account_number=4444";
		String sql4 = "update bankData set balance=balance+4500 where account_number=1111";
		
		try(Connection conn=MyConnection.connect()){
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
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
	
	public boolean getAllAccounts() {
		return b;
	}
}
