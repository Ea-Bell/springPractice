package lovvey.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;




public class Custom {

	private String busiNum;
	private String custom;
	private String customShort;
	private String ceo;
	private String chargePerson;
	private String busiCondition;
	private String item;
	private String postNum;
	private String addr1;
	private String addr2;
	private String tel;
	private String fax;
	private String homepage;
	private String coYn;
	private String foreignYn;
	private String taxYn;
	private String country_eng;
	private String country_kor;
	private String specialRelation;
	private String tradeStop;
	private String contractPeriodS;
	private String contractPeriodE;
	private String regiInfoMan;
	private String regiInfoDate;
	private String modiInfoMan;
	private String modiInfoDate;
	
	public Custom() {
		
	}
	
	public Custom(String busiNum, String custom, String customShort, String ceo, String chargePerson,
			String busiCondition, String item, String postNum, String addr1, String addr2, String tel, String fax,
			String homepage, String coYn, String foreignYn, String taxYn, String country_eng, String country_kor,
			String specialRelation, String tradeStop, String contractPeriodS, String contractPeriodE,
			String regiInfoMan, String regiInfoDate, String modiInfoMan, String modiInfoDate) {
		super();
		this.busiNum = busiNum;
		this.custom = custom;
		this.customShort = customShort;
		this.ceo = ceo;
		this.chargePerson = chargePerson;
		this.busiCondition = busiCondition;
		this.item = item;
		this.postNum = postNum;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.coYn = coYn;
		this.foreignYn = foreignYn;
		this.taxYn = taxYn;
		this.country_eng = country_eng;
		this.country_kor = country_kor;
		this.specialRelation = specialRelation;
		this.tradeStop = tradeStop;
		this.contractPeriodS = contractPeriodS;
		this.contractPeriodE = contractPeriodE;
		this.regiInfoMan = regiInfoMan;
		this.regiInfoDate = regiInfoDate;
		this.modiInfoMan = modiInfoMan;
		this.modiInfoDate = modiInfoDate;
	}
	
	
	public String getBusiNum() {
		return busiNum;
	}


	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}


	public String getCustom() {
		return custom;
	}


	public void setCustom(String custom) {
		this.custom = custom;
	}


	public String getCustomShort() {
		return customShort;
	}


	public void setCustomShort(String customShort) {
		this.customShort = customShort;
	}


	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


	public String getChargePerson() {
		return chargePerson;
	}


	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}


	public String getBusiCondition() {
		return busiCondition;
	}


	public void setBusiCondition(String busiCondition) {
		this.busiCondition = busiCondition;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getPostNum() {
		return postNum;
	}


	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}


	public String getAddr1() {
		return addr1;
	}


	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}


	public String getAddr2() {
		return addr2;
	}


	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getHomepage() {
		return homepage;
	}


	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}


	public String getCoYn() {
		return coYn;
	}


	public void setCoYn(String coYn) {
		this.coYn = coYn;
	}


	public String getForeignYn() {
		return foreignYn;
	}


	public void setForeignYn(String foreignYn) {
		this.foreignYn = foreignYn;
	}


	public String getTaxYn() {
		return taxYn;
	}


	public void setTaxYn(String taxYn) {
		this.taxYn = taxYn;
	}


	public String getCountry_eng() {
		return country_eng;
	}


	public void setCountry_eng(String country_eng) {
		this.country_eng = country_eng;
	}


	public String getCountry_kor() {
		return country_kor;
	}


	public void setCountry_kor(String country_kor) {
		this.country_kor = country_kor;
	}


	public String getSpecialRelation() {
		return specialRelation;
	}


	public void setSpecialRelation(String specialRelation) {
		this.specialRelation = specialRelation;
	}


	public String getTradeStop() {
		return tradeStop;
	}


	public void setTradeStop(String tradeStop) {
		this.tradeStop = tradeStop;
	}


	public String getContractPeriodS() {
		return contractPeriodS;
	}


	public void setContractPeriodS(String contractPeriodS) {
		this.contractPeriodS = contractPeriodS;
	}


	public String getContractPeriodE() {
		return contractPeriodE;
	}


	public void setContractPeriodE(String contractPeriodE) {
		this.contractPeriodE = contractPeriodE;
	}


	public String getRegiInfoMan() {
		return regiInfoMan;
	}


	public void setRegiInfoMan(String regiInfoMan) {
		this.regiInfoMan = regiInfoMan;
	}


	public String getRegiInfoDate() {
		return regiInfoDate;
	}


	public void setRegiInfoDate(String regiInfoDate) {
		this.regiInfoDate = regiInfoDate;
	}


	public String getModiInfoMan() {
		return modiInfoMan;
	}


	public void setModiInfoMan(String modiInfoMan) {
		this.modiInfoMan = modiInfoMan;
	}


	public String getModiInfoDate() {
		return modiInfoDate;
	}


	public void setModiInfoDate(String modiInfoDate) {
		this.modiInfoDate = modiInfoDate;
	}


	@Override
	public String toString() {
		return "Custom [busiNum=" + busiNum + ", custom=" + custom + ", customShort=" + customShort + ", ceo=" + ceo
				+ ", chargePerson=" + chargePerson + ", busiCondition=" + busiCondition + ", item=" + item
				+ ", postNum=" + postNum + ", addr1=" + addr1 + ", addr2=" + addr2 + ", tel=" + tel + ", fax=" + fax
				+ ", homepage=" + homepage + ", coYn=" + coYn + ", foreignYn=" + foreignYn + ", taxYn=" + taxYn
				+ ", country_eng=" + country_eng + ", country_kor=" + country_kor + ", specialRelation="
				+ specialRelation + ", tradeStop=" + tradeStop + ", contractPeriodS=" + contractPeriodS
				+ ", contractPeriodE=" + contractPeriodE + ", regiInfoMan=" + regiInfoMan + ", regiInfoDate="
				+ regiInfoDate + ", modiInfoMan=" + modiInfoMan + ", modiInfoDate=" + modiInfoDate + "]";
	}
	
	
	
	
	
	
}
