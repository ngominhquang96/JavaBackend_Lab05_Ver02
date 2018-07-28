/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend.lab05;

import java.util.Scanner;

/**
 *
 * @author ngomi
 */
public class Worker extends Employee{
    private int numberOfWorkDays;

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setNumberOfWorkDays(int numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public Worker() {
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number Of WorkDays: " + this.getNumberOfWorkDays());
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input Number Of WorkDays");
        this.setNumberOfWorkDays(new Scanner(System.in).nextInt());
    }
    

    @Override
    public float income() {
        return (float)this.getSalary()*this.numberOfWorkDays/26;
    }
    
    
}
