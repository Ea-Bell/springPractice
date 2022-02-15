package lovvey.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.domain.Account;
import lovvey.domain.Custom;
import lovvey.dto.Page2Dto;
import lovvey.service.AccountService;
import lovvey.service.CustomService;
import lovvey.service.Page2Service;


@Service("page2Service")
public class Page2ServiceImpl extends EgovAbstractServiceImpl implements Page2Service {
	private static final Logger LOGGER = LoggerFactory.getLogger(Page2ServiceImpl.class);
	
	@Resource(name = "accountService")
	private AccountService accountService;
	@Resource(name = "customService")
	private CustomService customSeervice;
	
	@Resource(name="page2Dao")
	private Page2Dao page2Dao;
	


	@Transactional
	public void insertPage2(Account account, Custom custom) throws Exception {
		// TODO Auto-generated method stub
		
		accountService.insertAccount(account);
		customSeervice.insertCustom(custom);
	}
	
	public Page2Dto listPage2(Page2Dto page2Dto) throws Exception {
		// TODO Auto-generated method stub
		return page2Dao.listPage2(page2Dto);
	}

	@Override
	public List<String> allListPage1(Page2Dto page2Dto) throws Exception {
		// TODO Auto-generated method stub
		return page2Dao.allListPage1(page2Dto);
	}

	@Override
	@Transactional
	public void updatePage2(Account account, Custom custom) throws Exception {
		// TODO Auto-generated method stub
		
		accountService.updateAccount(account);
		customSeervice.updateCustom(custom);
	}

	@Override
	@Transactional
	public void deletePage2(Page2Dto page2Dto) throws Exception {
		// TODO Auto-generated method stub
		page2Dao.deletePage2(page2Dto);
	}
	
	

	
	 
	
}
