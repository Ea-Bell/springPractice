package lovvey.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import lovvey.dto.Page2Dto;

public class ControllerUtil {
	  
	  public static Date changedDate(Date changeDate) throws ParseException {
			SimpleDateFormat recvSimpleFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
			 
	        // 여기에 원하는 포맷을 넣어주면 된다
	        SimpleDateFormat tranSimpleFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

	        Date data = recvSimpleFormat.parse(changeDate.toString());
	        String strDate = tranSimpleFormat.format(data);
	        //====================================================================
	        
	        // 내가 바꾸고 싶은 날짜
	        SimpleDateFormat changeDate2 = new SimpleDateFormat("yyyy-MM-dd");
	        
	        Date realDate = changeDate2.parse(strDate);
	  
			return realDate;
		}

}
