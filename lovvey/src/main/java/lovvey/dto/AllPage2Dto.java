package lovvey.dto;

public class AllPage2Dto {

	
	private String busiNum;
	private String custom;
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
	public AllPage2Dto(String busiNum, String custom) {
		super();
		this.busiNum = busiNum;
		this.custom = custom;
	}
	
	@Override
	public String toString() {
		return "AllPage2Dto [busiNum=" + busiNum + ", custom=" + custom + "]";
	}	
}
