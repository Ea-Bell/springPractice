package lovvey.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.domain.Account;
import lovvey.domain.Custom;
import lovvey.service.AccountService;
import lovvey.service.CustomService;



@Repository("customDao")
public class CustomDao extends EgovAbstractMapper implements CustomService{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomService.class);

	@Override
	public void insertCustom(Custom custom) throws Exception {
		// TODO Auto-generated method stub
		insert("insertCustom", custom);
		
	}

	@Override
	public void updateCustom(Custom account) throws Exception {
		// TODO Auto-generated method stub
		update("updateCustom", account);
	}

	@Override
	public void deleteCustom(Custom acoount) throws Exception {
		// TODO Auto-generated method stub
		delete("deleteCustom",acoount);
	}
	
}
