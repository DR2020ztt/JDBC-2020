package com.neusoft.po;
//实体类/对象
public class Emp {

	private Integer empno;
	private String ename;
	private String job;
	private String hireDate;
	private Double sal;
	private Integer deptno;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empno +"\t"+this.ename+"\t"+this.job+"\t"+this.hireDate+"\t"+
				this.sal+"\t"+this.deptno;
		
	}
	public Integer getEmpno() {
		return this.empno ;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String enmae) {
		this.ename = enmae;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
}
