package lovvey.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lovvey.dto.Page3Dto;
import lovvey.service.Page3Service;

@Service("page3Service")
public class Page3ServiceImpl extends EgovAbstractServiceImpl implements Page3Service {

	@Resource(name = "page3Dao")
	Page3Dao page3Dao;
	
	@Override
	public List<Page3Dto> selectPage3(Page3Dto page3Dto) throws Exception {
		// TODO Auto-generated method stub
		return page3Dao.selectPage3(page3Dto);
	}

}
