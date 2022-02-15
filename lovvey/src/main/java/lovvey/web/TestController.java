package lovvey.web;

import java.lang.ProcessBuilder.Redirect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.MultiValueMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lovvey.domain.Account;
import lovvey.domain.Custom;
import lovvey.domain.Test2;
import lovvey.dto.Page1Dto;
import lovvey.dto.Page2Dto;
import lovvey.dto.Page3Dto;
import lovvey.service.AccountService;
import lovvey.service.CustomService;
import lovvey.service.Page1Service;
import lovvey.service.Page2Service;
import lovvey.service.Page3Service;
import lovvey.service.TestService;
import lovvey.service.impl.Page2ServiceImpl;
import lovvey.util.ControllerUtil;

@CrossOrigin(origins = {"*","www.localhost","www.localhost:8080"})
@Controller
public class TestController {

	@Resource(name = "testImpl")
	private TestService testImpl;

	@Resource(name="page1Service")
	private Page1Service page1Service;
	
	@Resource(name="page2Service")
	private Page2Service page2Service;
	
	@Resource(name="page3Service")
	private Page3Service page3Service;
	
	@Resource(name="customService")
	private CustomService customService;
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public void test( ) throws Exception {
		Test2 test = new Test2("test1", "test2");
		testImpl.insertTest(test);
	}
	
	@GetMapping("/page1")
	public String page1() {
		return "redirect:page1/all";
		
	}
	@GetMapping("/page1/searchPage1")
	public String searchPage1(@RequestParam Map<String,Object> paramMap, Model model) throws Exception
	{
			Page1Dto page1Dto = new Page1Dto(
						paramMap.get("busiNum").toString(),
						paramMap.get("custom").toString()
					);

		List<Page1Dto> search=	page1Service.searchPage1Dto(page1Dto);	
		
		model.addAttribute("page1", search);
		return "page1";		
	}
	
	//Page1전체조회
		@GetMapping("/page1/all")
		public String listPage1(Model model) throws Exception {
			
			Page2Dto page2Dto =new Page2Dto();
			
			List<String>allList=page2Service.allListPage1(page2Dto);		
			model.addAttribute("page1",allList);
			
			return "page1";
		}	
		
	
	//등록페이지 보여주기
	@GetMapping("/page2")
	public String showPage2(Model model) {
		
		return "listPage2";	
	}
	
	
	
	//상세페이지
	@GetMapping("/page2/{busi_Num}")
	public String listPage2 (@PathVariable String busi_Num  ,Model model) throws Exception {
		
		Page2Dto page2Dto = new Page2Dto();
		page2Dto.setBusiNum(busi_Num);
		
		try {
			Page2Dto list=page2Service.listPage2(page2Dto);	
			model.addAttribute("page2", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}		
		return "listPage2";
	}
	
	//삭제
	@PostMapping("/page2/delete/{busiNum}")
	public String deletePage2(@PathVariable String busiNum) throws Exception {
		
	try {
		
		Page2Dto page2Dto = new Page2Dto();
		page2Dto.setBusiNum(busiNum);
		page2Service.deletePage2(page2Dto);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		return "redirect:/page2";
	}
	
	
	
	//수정
	@PostMapping("/page2/update")
	public String updatePage2(@RequestParam Map<String,Object> paramMap, Model model) throws Exception{
		
		try {
			Custom custom = new Custom(
					paramMap.get("busiNum").toString(),
					paramMap.get("custom").toString(),
					paramMap.get("customShort").toString(),
					paramMap.get("ceo").toString(),
					paramMap.get("chargePerson").toString(),
					paramMap.get("busiCondition").toString(),
					paramMap.get("item").toString(),
					paramMap.get("postNum").toString(),
					paramMap.get("addr1").toString(),
					paramMap.get("addr2").toString(),
					paramMap.get("tel").toString(),
					paramMap.get("fax").toString(),
					paramMap.get("homepage").toString(),
					paramMap.get("coYn").toString(),
					paramMap.get("foreignYn").toString(),
					paramMap.get("taxYn").toString(),
					paramMap.get("country_eng").toString(),
					paramMap.get("country_kor").toString(),
					paramMap.get("specialRelation").toString(),
					paramMap.get("tradeStop").toString(),
					paramMap.get("contractPeriodS").toString(),
					paramMap.get("contractPeriodE").toString(),
					paramMap.get("regiInfoMan").toString(),
					paramMap.get("regiInfoDate").toString(),
					paramMap.get("regiInfoMan").toString(),
					insertDateTime()
					);
			
			Account account= new Account(
					paramMap.get("busiNum").toString(),
					paramMap.get("factory").toString(),
					paramMap.get("tradeBank").toString(),
					paramMap.get("accountNum").toString()
					);
			
			page2Service.updatePage2(account, custom);		
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/page2";	
	}
	
		
	@PostMapping("/page2/save")
	public String savePage2(@RequestParam Map<String,Object> paramMap) throws Exception {
		
			try {
				Custom custom = new Custom(
						paramMap.get("busiNum").toString(),
						paramMap.get("custom").toString(),
						paramMap.get("customShort").toString(),
						paramMap.get("ceo").toString(),
						paramMap.get("chargePerson").toString(),
						paramMap.get("busiCondition").toString(),
						paramMap.get("item").toString(),
						paramMap.get("postNum").toString(),
						paramMap.get("addr1").toString(),
						paramMap.get("addr2").toString(),   //저장시 extraAddress 삭제 요망.
						paramMap.get("tel").toString(),
						paramMap.get("fax").toString(),
						paramMap.get("homepage").toString(),
						paramMap.get("coYn").toString(),
						paramMap.get("foreignYn").toString(),
						paramMap.get("taxYn").toString(),
						paramMap.get("country_eng").toString(),
						paramMap.get("country_kor").toString(),
						paramMap.get("specialRelation").toString(),
						paramMap.get("tradeStop").toString(),
						paramMap.get("contractPeriodS").toString(),
						paramMap.get("contractPeriodE").toString(),
						paramMap.get("regiInfoMan").toString(),
						insertDateTime(),
						null,
						null
						);
				
				Account account= new Account(
						paramMap.get("busiNum").toString(),
						paramMap.get("factory").toString(),
						paramMap.get("tradeBank").toString(),
						paramMap.get("accountNum").toString()
						);
				page2Service.insertPage2(account, custom);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		return "redirect:/page2";
		
		
	}


	@GetMapping("/page3")
	public String page3(Model model, HttpServletResponse response) throws Exception {
		try {
			
		
		Page3Dto page3Dto = new Page3Dto();
		
		List<Page3Dto> list= page3Service.selectPage3(page3Dto);
		response.setHeader("X-Frame-Options", "ALLOW-FROM http://www.localhost:8989");
		
		model.addAttribute("page3", list);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return "page3";
	}
	

	@GetMapping("/page4")
	public String page4(HttpServletResponse response) throws Exception {
		response.setHeader("X-Frame-Options", "ALLOW-FROM http://localhost:8989");
		return "page4";
	}
	
	private String insertDateTime() {
		// 현재 날짜/시간
		LocalDateTime now = LocalDateTime.now();
		// 현재 날짜/시간 출력
		//System.out.println(now); 
		// 포맷팅
		return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));		
	}
	
	@GetMapping("/acoountTest")
	@ResponseBody
	public Account account() {
		Account account = new Account("111-111-111", "청주공장", "농협은행", "111-111-1111111");
		return account;
	}
	
	
}
