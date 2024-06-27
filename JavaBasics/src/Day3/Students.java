package Day3;

public class Students {
    private int sid;
    private String sname;
    private String scity;
    
    public void setSid(int sid)
    {
    	this.sid=sid;
    }
    public int getSid()
    {
    	return sid;
    }
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
}
