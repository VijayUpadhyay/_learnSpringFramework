package com.vijay.mkyong.springTest;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vijay.spring.CustomerDao;

public class JdbcClient {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
	             new ClassPathXmlApplicationContext("com/vijay/beanXMLs/beans.xml");
		
		
		CustomerDao empDao = context.getBean("customerDaoBean", CustomerDao.class);
		int noOfDays=0, oldBalance=0,currentBalance=0,finalBalance=0, acc_no=0,txnAmount=0;;
		
		List<Account> ac_list = empDao.getAccountDetails();	
		
		List<Transaction> txnList = empDao.getTransactions();
		System.out.println(txnList.size()+ " Transactions  found to update"); 
		for(int i = 0; i <txnList.size();i++)
		{
			System.out.println("------------------------------------");
			//System.out.println("count" +i+1);
			Transaction txn = txnList.get(i);
			for(Account a:ac_list)
			{
				if(a.getAc_id() == txn.getToId())
				{
					 noOfDays = empDao.getNumberOfDays(txn.getTxnId()); 
					 txnAmount = txn.getAmount();
					 oldBalance = a.getBalance();
					 currentBalance= oldBalance+txnAmount;//Interest to be calculated to this balance and added to old balance
					
					 acc_no = txn.getToId();

;
					
					finalBalance = (int) (oldBalance+(0.02*currentBalance*noOfDays));//Assuming 2% as interest per day i.e old_balance + interset forn new balance
					System.out.println("For txn no: "+txn.getTxnId()+" interest to be calculated is :"+noOfDays+"  days"+" & final bal will be "+finalBalance+"for Ac:"+acc_no);
			
					
					empDao.updateAccount(finalBalance, acc_no,"waiting",txn.getTxnId());
				
					
				}
				if(a.getAc_id() == txn.getFromId())
				{
					oldBalance = a.getBalance();
					finalBalance= oldBalance - txn.getAmount();
					 acc_no = txn.getFromId();
					 System.out.println("Amount after deduction, bal is  "+ finalBalance+ " for ac :"+txn.getFromId());
					empDao.updateAccount(finalBalance, acc_no,"success",txn.getTxnId());
					 
				}
				
				
			}
			
		}
	
	}

}
