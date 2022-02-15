package lovvey.dto;

public class Page3Dto {


	private String kor;
	private String eng;
	
	
	
	public Page3Dto() {
		super();
	}
	public Page3Dto( String kor, String eng) {
		

		this.kor = kor;
		this.eng = eng;
	}
	
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Page3Dto [ kor=" + kor + ", eng=" + eng + "]";
	}
	
	
}
