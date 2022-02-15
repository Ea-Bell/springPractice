package lovvey.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.domain.Account;
import lovvey.service.AccountService;
import lovvey.service.LovveyTestService;


@Repository("accountDao")
public class AccountDao extends EgovAbstractMapper implements AccountService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountDao.class);
	@Override
	public void insertAccount(Account account) throws Exception {
		// TODO Auto-generated method stub
		insert("insertAccount", account);
	
	}

	@Override
	public void updateAccount(Account account) throws Exception {
		// TODO Auto-generated method stub
		update("updateAccount", account);
	}

	@Override
	public void deleteAccount(Account acoount) throws Exception {
		// TODO Auto-generated method stub
			delete("deleteAccount", acoount);
	}

}
