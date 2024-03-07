package com.learning.day5;

import java.util.Random;

class Employee {
    public String name;
    public long phoneNo;
    public String passportNo;
    public int licenseNo;
    public String panCardNo;
    public int employeeId;
    
    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }
    
    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }
    
    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo, String voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }
    
    public Employee(String name, long phoneNo, int employeeId, String voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
    }
    
    // Other methods as needed
}

class Student {
    public String name;
    public long phoneNo;
    public String passportNo;
    public int licenseNo;
    public String panCardNo;
    public int voterId;
    
    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }
    
    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }
    
    public Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }
    
    // Other methods as needed
}

class Register<T> {
    private String registerId;
    
    public Register(String registerId) {
        this.registerId = registerId;
    }
    
    public String generateRegistrationId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    
    public void displayDetails(T user) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.name);
            System.out.println("Phone No: " + employee.phoneNo);
            System.out.println("Employee ID: " + employee.employeeId);
            // Display other details as needed
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println("Student Details:");
            System.out.println("Name: " + student.name);
            System.out.println("Phone No: " + student.phoneNo);
            // Display other details as needed
        }
        System.out.println("Registration ID: " + registerId);
    }
}

public class D05P01 {
    public static void main(String[] args) {
        Register<Employee> empRegister = new Register<>("EMP");
        Register<Student> stuRegister = new Register<>("STU");
        
        Employee employee1 = new Employee("John Doe", 1234567890, 101, "ABC12345");
        Employee employee2 = new Employee("Jane Smith", 9876543210L, 102, 123456, "XYZ789");
        Student student1 = new Student("Alice", 5551234567L, "DEF67890");
        Student student2 = new Student("Bob", 9876543210L, 789012, "PQR456");
        
        String empRegId = empRegister.generateRegistrationId(6);
        String stuRegId = stuRegister.generateRegistrationId(6);
        
        empRegister.displayDetails(employee1);
        System.out.println("Registration ID: " + empRegId);
        System.out.println();
        empRegister.displayDetails(employee2);
        System.out.println("Registration ID: " + empRegId);
        System.out.println();
        stuRegister.displayDetails(student1);
        System.out.println("Registration ID: " + stuRegId);
        System.out.println();
        stuRegister.displayDetails(student2);
        System.out.println("Registration ID: " + stuRegId);
    }
}