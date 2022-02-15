package lovvey.service;

import java.util.List;
import java.util.Map;

import org.antlr.grammar.v3.ANTLRParser.defaultNodeOption_return;

import lovvey.domain.Account;
import lovvey.domain.Custom;
import lovvey.dto.Page2Dto;

public interface Page2Service {

	default void insertPage2(Account account, Custom custom) throws Exception{};
	
	
	/**
	 * 
	 * @param busiNum
	 * @ 단건조회
	 * @throws Exception
	 */
	default Page2Dto listPage2(Page2Dto page2Dto) throws Exception {
		return null;
	}
	
	default List<String> allListPage1(Page2Dto page2Dto) throws Exception{return null;}

	default void updatePage2(Account account, Custom custom) throws Exception{}
	default void deletePage2(Page2Dto page2Dto) throws Exception{}
}
