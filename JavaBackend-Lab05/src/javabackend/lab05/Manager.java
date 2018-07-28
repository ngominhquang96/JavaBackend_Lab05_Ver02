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
public class Manager extends Employee{
    private int numberEmployee;

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Manager() {
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); //To change body of generated methods, choose Tools | Templates.
          System.out.println("Number Employee" + this.getNumberEmployee());
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input Number Employee");
        this.setNumberEmployee(new Scanner(System.in).nextInt());
    }
    

    @Override
    public float income() {
       if ( this.numberEmployee <10 ){
            return (float)this.getSalary() + 500;
        }else {
            if( this.numberEmployee < 20)
                return (float)this.getSalary() + 1000;
            else
                return (float)this.getSalary() + 2000;
        }
    }
    
}
