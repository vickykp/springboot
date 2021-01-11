package mobiloitte.com.postman.dto;

public class Employeedto {

	private Integer empId;
	private String empName;
	private double empSal;
	private String password;
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employeedto(Integer empId, String empName, double empSal, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.password = password;
	}
	public Employeedto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
