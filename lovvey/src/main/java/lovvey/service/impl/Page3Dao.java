package lovvey.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import lovvey.dto.Page3Dto;
import lovvey.service.Page3Service;

@Repository("page3Dao")
public class Page3Dao extends EgovAbstractMapper implements Page3Service {

	@Override
	public List<Page3Dto> selectPage3(Page3Dto page3Dto) throws Exception {
		// TODO Auto-generated method stub
		return selectList("selectPage3", page3Dto);
	}

}
