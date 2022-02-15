package lovvey.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lovvey.dto.Page1Dto;
import lovvey.service.Page1Service;

@Service("page1Service")
public class Page1ServiceImpl extends EgovAbstractServiceImpl implements Page1Service {
	private static final Logger LOGGER = LoggerFactory.getLogger(Page1ServiceImpl.class);

	@Resource(name = "page1Dao")
	Page1Dao page1Dao;

	@Override
	public List<Page1Dto> searchPage1Dto(Page1Dto page1Dto) throws Exception {
		return page1Dao.searchPage1Dto(page1Dto);
	}
	
	
}
