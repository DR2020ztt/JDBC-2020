package com.neusoft;

import java.util.List;

import com.neusoft.dao.EmpDao;
import com.neusoft.dao.impl.EmpDaoImpl;
import com.neusoft.po.Emp;

public class Test {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		List<Emp> list=dao.selectEmpAll();
		/*
		if(list.size()==0){
			System.out.println("没有数据");
		}else{
			for(Emp emp:list){
				System.out.println(emp);
		}
		*/
		
		/*
		Emp emp = dao.selectEmpById(2);
		if(emp!=null) {
			System.out.println(emp);
		}else {
			System.out.println("查无此人");
		}
		*/
		/*
		Emp emp=new Emp();
		emp.setEnmae("ztt");
		emp.setJob("AA");
		emp.setSal(10000.0);
		emp.setDeptno(10);
		int result=dao.insertEmp(emp);
		
		if(result>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
			*/
		
		/*
		Emp emp=new Emp();
		emp.setEmpno(8001);
		emp.setEnmae("zttA");
		emp.setSal(10000.09);
		emp.setDeptno(10);
		int result=dao.updateEmp(emp);
		
		if(result>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		*/
		
		int result=dao.deleteEmpById(8001);
		if(result>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}

}