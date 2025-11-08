package com.mycompany.app.collections;

import java.util.List;
import com.mycompany.app.collections.Classes.Employee;
import com.mycompany.app.collections.Classes.EmployeeData;
public class BasicCollection implements Practise {

    @Override
    public void run() {
        System.out.println("BasicCollection");
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list);
    }
}
