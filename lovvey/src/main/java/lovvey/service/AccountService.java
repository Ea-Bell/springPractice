package lovvey.service;

import lovvey.domain.Account;

public interface AccountService {

	 void insertAccount(Account account) throws Exception;
	 void updateAccount(Account account) throws Exception;
	 void deleteAccount(Account acoount) throws Exception;
	 
	 
	
}
