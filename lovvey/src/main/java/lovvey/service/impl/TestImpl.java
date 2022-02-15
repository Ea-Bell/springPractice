package lovvey.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lovvey.domain.Test;
import lovvey.domain.Test2;
import lovvey.service.TestService;

@Service("testImpl")
public class TestImpl extends EgovAbstractServiceImpl implements TestService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);
	
	@Resource(name = "testDao")
	private TestDao testDao;
	@Override
	public String insertTest(Test2 vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestImpl의 insertTest입니다");
		testDao.insertTest(vo);
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
