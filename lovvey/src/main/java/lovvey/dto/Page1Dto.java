package lovvey.dto;

public class Page1Dto {
	
	private String busiNum;
	private String custom;
	
	public Page1Dto() {}
	
	public Page1Dto(String busiNum, String custom) {
		this.busiNum = busiNum;
		this.custom = custom;
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

	@Override
	public String toString() {
		return "Page1Dto [busiNum=" + busiNum + ", custom=" + custom + "]";
	}


	
	
	

}
