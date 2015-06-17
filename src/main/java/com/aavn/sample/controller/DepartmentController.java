package com.aavn.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aavn.sample.domain.Department;
import com.aavn.sample.services.interfaces.IDepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private IDepartmentService DepartmentSerivce;
	
	@RequestMapping("/loadDepartment")
	public String loadDepartment(Model model) {
		List<Department> DepartmentList = new ArrayList<Department>();
		DepartmentList = DepartmentSerivce.getOrderDepartment();
		model.addAttribute("DepartmentList", DepartmentList);
		return "Department";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartment(@RequestParam String department_name, @RequestParam int location_id){
		Department department = new Department();
		department.setDepartment_name(department_name);
		department.setLocation_id(location_id);
		DepartmentSerivce.add(department);
		return "redirect:loadDepartment";
	}
	@RequestMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam String department_id) {
		DepartmentSerivce.delete(Integer.parseInt(department_id));
		return "redirect:loadDepartment";
	}
	
	@RequestMapping("/updateDepartment")
	public String updateDepartment(@RequestParam String department_id, @RequestParam String department_name, @RequestParam int location_id) {
			
      Department department = new Department();
      department	= DepartmentSerivce.getById(Integer.parseInt(department_id));
		department.setDepartment_name(department_name);
		department.setLocation_id(location_id);
		DepartmentSerivce.update(department);
		return "redirect:loadDepartment";
}

}