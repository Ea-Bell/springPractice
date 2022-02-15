package lovvey.service;

import java.util.List;

import lovvey.domain.Test;
import lovvey.domain.Test2;

public interface TestService {

	String insertTest(Test2 test) throws Exception;
	String updateTest(Test2 vo) throws Exception;
	String deleteTest(Test2 vo) throws Exception;
	List<?> SelectAllTest(Test2 vo) throws Exception;
}
