package lovvey.service;

import lovvey.domain.Account;
import lovvey.domain.Custom;

public interface CustomService {

	 void insertCustom(Custom custom ) throws Exception;
	 void updateCustom(Custom account) throws Exception;
	 void deleteCustom(Custom acoount) throws Exception;
	
}
