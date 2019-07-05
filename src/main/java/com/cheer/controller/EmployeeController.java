package com.cheer.controller;

import com.cheer.dao.DepartmentDao;
import com.cheer.dao.EmployeeDao;
import com.cheer.entities.Department;
import com.cheer.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping("emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "list";
    }

    @RequestMapping("emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "add";
    }

    @PostMapping("emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @RequestMapping("emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        model.addAttribute("emp",employee);
        return "edit";
    }

    @PutMapping("emp")
    public String editEmp(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
