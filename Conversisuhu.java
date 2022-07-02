/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author Ni Luh Putu Trisna Kantina Dewi_20103001
 */
public class Conversisuhu {
    
    private double Hasil, F, C;
    
    public void setC(double nilai){
        this.C = nilai;
    }
    
    public double getC(){
        return this.C;
    }
    
    public void setF(double nilai){
        this.F = nilai;
    }   
    
    public double getF(){
        return this.F;
    }
    
    public double getHASIL (){
        return this.Hasil;
    }
    
    public double conversi(String jns){
        if (jns == "C2F"){
            this.Hasil = ((9*this.C)/5)+32;
            return this.Hasil;
        }else if (jns == "F2C"){
            this.Hasil = ((this.F-32)*5)/9;
            return this.Hasil;
        }
        return 0;
    }
    
}
