package lovvey.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.domain.Account;
import lovvey.domain.Custom;
import lovvey.dto.Page2Dto;
import lovvey.service.AccountService;
import lovvey.service.Page2Service;

@Repository("page2Dao")
public class Page2Dao extends EgovAbstractMapper implements Page2Service{
	private static final Logger LOGGER = LoggerFactory.getLogger(Page2Dao.class);

	@Override
	public Page2Dto listPage2(Page2Dto page2Dto) throws Exception {
		// TODO Auto-generated method stub
		return  selectOne("listPage2", page2Dto);
	}

	@Override
	public List<String> allListPage1(Page2Dto page2Dto) throws Exception {
		// TODO Auto-generated method stub
		return selectList("selectAllListPage2");
	}

	public void deletePage2(Page2Dto page2Dto) throws Exception{
		 delete("deletePage2", page2Dto);
	}
}
