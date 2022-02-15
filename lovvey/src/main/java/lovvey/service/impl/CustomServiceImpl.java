package lovvey.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lovvey.domain.Custom;
import lovvey.service.CustomService;

@Service("customService")
public class CustomServiceImpl extends EgovAbstractServiceImpl implements CustomService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomService.class);
	@Resource(name ="customDao" )
	private CustomDao customDao;
	@Override
	public void insertCustom(Custom custom) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			customDao.insertCustom(custom);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateCustom(Custom account) throws Exception {
		// TODO Auto-generated method stub
		customDao.updateCustom(account);
	}

	@Override
	public void deleteCustom(Custom acoount) throws Exception {
		customDao.deleteCustom(acoount);

	}

}
