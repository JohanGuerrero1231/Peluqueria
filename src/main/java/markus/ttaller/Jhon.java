/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markus.ttaller;

/**
 *
 * @author johan
 */
public class Jhon extends Valores {
    private int servicios;
    private int total;

    public Jhon() {
    }

    public Jhon(int servicios, int total, int caballero, int dama, int tintura, int peinado) {
        super(caballero, dama, tintura, peinado);
        this.servicios = servicios;
        this.total = total;
    }
    
    
    public int getCaballero1() {
        return caballero;
    }
    public void setCaballero1(int caballero) {
        setServicios1(servicios+caballero);
        this.caballero = caballero*this.caballero;
        setTotal1(total+this.caballero);
    }
    public int getDama1() {
        return dama;
    }
    public void setDama1(int dama) {
        setServicios1(servicios+dama);
        this.dama = dama*this.dama;
        setTotal1(total+this.dama);
    }
    public int getTintura1() {
        return tintura;
    }
    public void setTintura1(int tintura) {
        setServicios1(servicios+tintura);
        this.tintura = tintura*this.tintura;
        setTotal1(total+this.tintura);
    }
    public int getPeinado1() {
        return peinado;
    }
    public void setPeinado1(int peinado) {
        setServicios1(servicios+peinado);
        this.peinado = peinado*this.peinado;
        setTotal1(total+this.peinado);
    }
    public int getServicios1() {
        return servicios;
    }
    public void setServicios1(int servicios) {
        this.servicios = servicios;
    }
    public int getTotal1() {
        return total;
    }
    public void setTotal1(int total) {
        this.total = total;
    }
}
