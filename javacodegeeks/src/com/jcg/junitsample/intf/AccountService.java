package com.jcg.junitsample.intf;

import java.util.List;

import com.jcg.junitsample.obj.Account;
import com.jcg.junitsample.obj.Transaction;

public interface AccountService {

  public Account createNewAccount(Account account);

  public Account updateAccount(Account account);

  public boolean removeAccount(Account account);

  public List<Transaction> listAllTransactions(Account account);

}