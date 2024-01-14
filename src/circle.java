/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-Chomreoun
 */
public class circle {
    public double r;
    public circle(){
        r=5;
    }
    public circle(double r){ 
        this.r=r;
        
    }
    public circle(double r,String name){
        this.r=r;
        System.out.println(name);
    }
    public double getArea(){
        return (3.14)*r*r;
    }
    public static void main(String[] args){
        circle myObj=new circle();
        System.out.println(myObj.getArea());
    }
    
}
