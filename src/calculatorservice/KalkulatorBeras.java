/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorservice;

/**
 *
 * @author Lk09Nu2UTY
 */
public class KalkulatorBeras {
    private double x;
    private double y;

    public KalkulatorBeras(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double Ping(){
        return(x*y);
    }
    public double Po(){
        return (x/y);
    }
    public double Lan(){
        return (x+y);
    }
    public double Do(){
        return (x-y);
    }
    }

