package com.tregulov.spring.rest;

import com.tregulov.spring.rest.configuration.MyConfig;
import com.tregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",Communication.class);
        Employee emp = new Employee("Sveta","Petrova","HR",1000);
        emp.setId(11);
        communication.saveEmployee(emp);
        List<Employee> allEmployees = communication.getAllEmployees();
        Employee employee = communication.getEmployee(11);
        System.out.println(allEmployees);
        System.out.println(employee);
        communication.deleteEmployee(11);
    }
}
