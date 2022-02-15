package lovvey.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.domain.Test;
import lovvey.domain.Test2;
import lovvey.service.LovveyTestService;
import lovvey.service.TestService;

@Repository("testDao")
public class TestDao extends EgovAbstractMapper implements TestService{
	private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);
	@Override
	public String insertTest(Test2 vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestDao의 insertTest입니다");
		insert("insetTest2", vo);
		return null;
	}

	@Override
	public String updateTest(Test2 vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTest(Test2 vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> SelectAllTest(Test2 vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
