/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.computadora.Cpu;
import ico.fes.computadora.Monitor;
import ico.fes.computadora.Mouse;
import ico.fes.computadora.Teclado;



/**
 *
 * @author angel
 */
public class Computadora {
 private int marca;
 private int modelo;

    public Computadora() {
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // TODO code application logic here   
     
     Monitor m1=new Monitor("Benq", "Odyssey", 32);
     Mouse r1=new Mouse("Razer", "Glorius", "Bluetooth");
     Teclado i1=new Teclado("Hyperx", "Alloy Elite", 104, 0);
     Cpu p1=new Cpu("AMD Ryzen","7 5800x", 3.8);     
     
        System.out.println("Monitor " + m1.getMarca() + " modelo " + m1.getModelo() + " pulgadas " + m1.getPulgadas());
        System.out.println("Mouse  " + r1.getMarca() + " modelo " + r1.getModelo() + " tipo " + r1.getTipo());
        System.out.println("Teclado " + i1.getMarca() + " modelo " + i1.getModelo()+ " numero de teclas " + i1.getNumeroDeTeclas());
        System.out.println("Cpu " + p1.getMarca() + " modelo " + p1.getModelo() + " Velocidad procesador " + p1.getVelocidadProcesador());
        
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
    
}
