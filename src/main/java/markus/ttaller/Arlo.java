/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markus.ttaller;

/**
 *
 * @author johan
 */
public class Arlo extends Valores{
    private int servicios;
    private int total;
    public Arlo() {
    }

    public Arlo(int servicios, int total, int caballero, int dama, int tintura, int peinado) {
        super(caballero, dama, tintura, peinado);
        this.servicios = servicios;
        this.total = total;
    }
    
    public int getCaballero3() {
        return caballero;
    }
    public void setCaballero3(int caballero) {
        setServicios3(servicios+caballero);
        this.caballero = caballero*this.caballero;
        setTotal3(total+this.caballero);
    }
    public int getDama3() {
        return dama;
    }
    public void setDama3(int dama) {
        setServicios3(servicios+dama);
        this.dama = dama*this.dama;
        setTotal3(total+this.dama);
    }
    public int getTintura3() {
        return tintura;
    }
    public void setTintura3(int tintura) {
        setServicios3(servicios+tintura);
        this.tintura = tintura*this.tintura;
        setTotal3(total+this.tintura);
    }
    public int getPeinado3() {
        return peinado;
    }
    public void setPeinado3(int peinado) {
        setServicios3(servicios+peinado);
        this.peinado = peinado*this.peinado;
        setTotal3(total+this.peinado);
    }
    public int getServicios3() {
        return servicios;
    }
    public void setServicios3(int servicios) {
        this.servicios = servicios;
    }
    public int getTotal3() {
        return total;
    }
    public void setTotal3(int total) {
        this.total = total;
    }   
}
