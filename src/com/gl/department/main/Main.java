package com.gl.department.main;

import com.gl.department.model.AdminDepartment;
import com.gl.department.model.HrDepartment;
import com.gl.department.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();
		
		HrDepartment hrDepartment = new HrDepartment();
		
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println("Welcome to "+adminDepartment.departmentName()+"\n"+adminDepartment.getTodaysWork()+"\n"+adminDepartment.getWorkDeadline()+"\n"+adminDepartment.isTodayAHoliday());
        
		System.out.println();
		
        System.out.println("Welcome to "+hrDepartment.departmentName()+"\n"+hrDepartment.doActivity()+"\n"+hrDepartment.getTodaysWork()+"\n"+hrDepartment.getWorkDeadline()+"\n"+hrDepartment.isTodayAHoliday());
        
		System.out.println();
		
        System.out.println("Welcome to "+techDepartment.departmentName()+"\n"+techDepartment.getTodaysWork()+"\n"+techDepartment.getWorkDeadline()+"\n"+techDepartment.getTechStackInformation()+"\n"+techDepartment.isTodayAHoliday());
        
		System.out.println();
	}

}
