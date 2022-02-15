package lovvey.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lovvey.domain.Account;
import lovvey.service.AccountService;

@Service("accountService")
public class AccountServiceIml extends EgovAbstractServiceImpl implements AccountService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);
	
	@Resource(name = "accountDao")
	private AccountDao accountDao;
	
	@Override
	public void insertAccount(Account account) throws Exception {
		// TODO Auto-generated method stub
		accountDao.insertAccount(account);
	}

	@Override
	public void updateAccount(Account account) throws Exception {
		// TODO Auto-generated method stub
		accountDao.updateAccount(account);
	}

	@Override
	public void deleteAccount(Account acoount) throws Exception {
		// TODO Auto-generated method stub
		accountDao.deleteAccount(acoount);
	}

}
