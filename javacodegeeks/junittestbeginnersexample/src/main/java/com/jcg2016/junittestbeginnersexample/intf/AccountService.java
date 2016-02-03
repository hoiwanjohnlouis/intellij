package com.jcg2016.junittestbeginnersexample.intf;

import java.util.List;

import com.jcg2016.junittestbeginnersexample.obj.Account;
import com.jcg2016.junittestbeginnersexample.obj.Transaction;

public interface AccountService {

  public Account createNewAccount(Account account);

  public Account updateAccount(Account account);

  public boolean removeAccount(Account account);

  public List<Transaction> listAllTransactions(Account account);

}