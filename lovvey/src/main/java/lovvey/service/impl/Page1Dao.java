package lovvey.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.dto.Page1Dto;
import lovvey.service.Page1Service;

@Repository("page1Dao")
public class Page1Dao extends EgovAbstractMapper implements Page1Service {
	private static final Logger LOGGER = LoggerFactory.getLogger(Page1Dao.class);

	@Override
	public List<Page1Dto> searchPage1Dto(Page1Dto page1Dto) throws Exception {
		return selectList("searchPage1", page1Dto);
	}

	
}
