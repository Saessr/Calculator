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
public class KalkulatorBagus {
    private double x;
    private double y;

    public KalkulatorBagus(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double Akar(){
        return (Math.sqrt(x));
    }
    public double Pangkat(){
        return (Math.pow(x, y));
    }
}
