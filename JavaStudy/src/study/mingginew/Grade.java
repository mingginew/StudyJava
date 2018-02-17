package study.mingginew;

public class Grade {
	
	private String aGrade = "A grade";
	private String bGrade = "B grade";
	private String cGrade = "C grade";
	private String dGrade = "D grade";
	private String fGrade = "F grade";
	
	public void gradeChecker(int score) {
		
		String xGrade = "";
		
		if(score >= 91) {
			xGrade =aGrade;
		}else if (score >= 81) {
			xGrade =bGrade;
		}else if (score >= 71) {
			xGrade =cGrade;
	    }else if (score >= 61) {
	    	xGrade =dGrade;
		}else{
			xGrade =fGrade;
		}
		System.out.println(xGrade);
	}
	
	public String getaGrade() {
		return aGrade;
	}
	public void setaGrade(String aGrade) {
		this.aGrade = aGrade;
	}
	public String getbGrade() {
		return bGrade;
	}
	public void setbGrade(String bGrade) {
		this.bGrade = bGrade;
	}
	public String getcGrade() {
		return cGrade;
	}
	public void setcGrade(String cGrade) {
		this.cGrade = cGrade;
	}
	public String getdGrade() {
		return dGrade;
	}
	public void setdGrade(String dGrade) {
		this.dGrade = dGrade;
	}
	public String getfGrade() {
		return fGrade;
	}
	public void setfGrade(String fGrade) {
		this.fGrade = fGrade;
	}

}
