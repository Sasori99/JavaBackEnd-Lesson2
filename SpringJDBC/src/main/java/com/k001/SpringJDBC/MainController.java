package com.k001.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// make this as rest controller

@RestController
@RequestMapping(path="/user") // This means URL's start with /user (after Application path)
public class MainController {

    // autowiring user repository
    @Autowired
    EmployeeDAO employeeDAO;

    // to test service is up and running
    @GetMapping
    public String check(){
        return "Welcome to Java Inspires";
    }

    @GetMapping(path = "/addemployee")
//    @ResponseBody
    public String addemployee(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String address) {
        Employee emp = new Employee(id,firstName,lastName,address);
        employeeDAO.addEmplyeeUsingSimpelJdbcInsert(emp);
        return "Add successful :'>";
    }
    @GetMapping(path = "/addEmployee")
    public String add() {
        employeeDAO.addEmplyeeUsingExecuteMethod();
        return "Add successful !!!";
    }
    /**
     * this method return list of usernames
     * @return usernameList
     */
    @GetMapping(path = "/getallemployee")
    public List<Employee> get(){
        return employeeDAO.getAllEmployees();
    }

}
