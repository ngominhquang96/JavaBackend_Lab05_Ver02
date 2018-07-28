/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend.lab05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ngomi
 */
public class EmployeeManage {
    public static final int OFFICER = 1;
    public static final int WORKER = 2;
    public static final int MANAGER = 3;
    
    public Employee createEmployee(int indexEmployee){
        switch (indexEmployee){
            case 1:
                return new Officer();
            case 2:
                return new Worker();
            case 3: 
                return new Manager();
            default:
                throw  new AssertionError();
        }
        
    }
    public void inputListEmployee(ArrayList<Employee> listEmployees){
        System.out.println("Nhap vao so luong nhan vien");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap vao loại nhan vien");
            int indexEmployee = new Scanner(System.in).nextInt();
            Employee e =createEmployee(indexEmployee);
            listEmployees.add(e);     
        }     
    }
    public void disPlayEmployee(ArrayList<Employee> listEmployees){
        if( ! listEmployees.isEmpty()){
            for (int i = 0; i < listEmployees.size(); i++) {
                if (listEmployees.get(i) != null) {
                    System.out.println("Nhan vien thu " + i );
                    listEmployees.get(i).displayInformation();;
                }
            }
        }
    }
    public ArrayList<Employee> searchByIncomeAndGender(int genderCode,ArrayList<Employee>  listEmployees){
        ArrayList<Employee> listEmployeeIncome =new ArrayList<Employee>();
        if (!listEmployees.isEmpty()){
            float incomeMax = 0;
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() > incomeMax && e.getGender().getCode() == genderCode ){
                    incomeMax = e.income();
                }
            }
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() == incomeMax && e.getGender().getCode() == genderCode ){
                    listEmployeeIncome.add(e);
                }
            }   
        }
        return listEmployeeIncome;    
    }
    private int getClassFromObj(Employee employee) {
        if (employee instanceof Manager) {
            return MANAGER;
        }

        if (employee instanceof Officer) {
            return OFFICER;
        }
        return WORKER;
    }
    public ArrayList<Employee> searchBySalaryAndIndexEmployee(int indexEmployee, ArrayList<Employee> listEmployees){
        ArrayList<Employee> listEmployeeIncomeMax =new ArrayList<Employee>();
        
        if (!listEmployees.isEmpty()){
            float incomeMax =0;
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() > incomeMax && getClassFromObj(e)==indexEmployee ){
                    incomeMax = e.income();
                }
            }
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() == incomeMax && getClassFromObj(e)==incomeMax ){
                    listEmployeeIncomeMax.add(e);
                }
            }   
            
            
        }
        return listEmployeeIncomeMax;
    }
    
}
