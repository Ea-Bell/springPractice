package lovvey.service;

import java.util.List;

import lovvey.dto.Page1Dto;

public interface Page1Service {

	default List<Page1Dto> searchPage1Dto(Page1Dto page1Dto) throws Exception{return null; }
}
