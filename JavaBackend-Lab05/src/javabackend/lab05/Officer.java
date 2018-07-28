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
public class Officer extends Employee{
    private float coefficient;

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public Officer() {
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("coefficient" + this.getCoefficient());
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input coefficient");
        this.setCoefficient( new Scanner(System.in).nextFloat());
    }
    

    @Override
    public float income() {
        return (float)this.getSalary() * this.coefficient;
    }
    
}
