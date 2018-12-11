package com.vijay.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.omg.CORBA.NO_IMPLEMENT;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.vijay.mkyong.springTest.Account;
import com.vijay.mkyong.springTest.Transaction;


public class CustomerDao extends JdbcDaoSupport {
	
	
	
	public void updateAccount(int balance, int acc_no,String status,String txnId)
	{
		if(status.equalsIgnoreCase("success"))
		{
			getJdbcTemplate().update("update txn_test set status='done' where txn_id='"+txnId+"'");
		}
		getJdbcTemplate().update("update account_test set balance=? where ac_no=?",balance,acc_no);
		
	}
	
	public List<Account> getAccountDetails() {

		
		List<Account> acList= null;
		acList =getJdbcTemplate().query("select * from account_test",new RowMapper<Account>() {
		@Override
		public Account mapRow(ResultSet rs, int rowNum)throws SQLException
		{
			Account ac = new Account();
			ac.setAc_id(rs.getInt(1));
			ac.setBalance(rs.getInt(2));
			return ac;
			
		}
		
		
		
	});
	return acList;
		
	}
	
	
public int getNumberOfDays(String txnid)
{

	
	
	String sql="select trunc(sysdate -(select txn_date from txn_test where txn_id='"+txnid+"')) as days from dual";

	int noOfDays  = getJdbcTemplate().queryForObject(sql, Integer.class);

	return noOfDays;
}
	
public List<Transaction> getTransactions() {
		
		List<Transaction> txnList= null;
		txnList = getJdbcTemplate().query("select * from txn_test where status='pending'",new RowMapper<Transaction>() {
			@Override
			public Transaction mapRow(ResultSet rs, int rowNum)throws SQLException
			{
				Transaction txn = new Transaction();
				txn.setTxnId(rs.getString(1));
				txn.setFromId(rs.getInt(2));
				txn.setToId(rs.getInt(3));
				txn.setAmount(rs.getInt(4));
				
				return txn;
				
			}
			
			
			
		});
		return txnList;
		
	}


	

}
