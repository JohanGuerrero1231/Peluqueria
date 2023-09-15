/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markus.ttaller;

/**
 *
 * @author johan
 */
public class Isen extends Valores{
    private int servicios;
    private int total;
    public Isen() {
    }

    public Isen(int servicios, int total, int caballero, int dama, int tintura, int peinado) {
        super(caballero, dama, tintura, peinado);
        this.servicios = servicios;
        this.total = total;
    }
    
    public int getCaballero4() {
        return caballero;
    }
    public void setCaballero4(int caballero) {
        setServicios4(servicios+caballero);
        this.caballero = caballero*this.caballero;
        setTotal4(total+this.caballero);
    }
    public int getDama4() {
        return dama;
    }
    public void setDama4(int dama) {
        setServicios4(servicios+dama);
        this.dama = dama*this.dama;
        setTotal4(total+this.dama);
    }
    public int getTintura4() {
        return tintura;
    }
    public void setTintura4(int tintura) {
        setServicios4(servicios+tintura);
        this.tintura = tintura*this.tintura;
        setTotal4(total+this.tintura);
    }
    public int getPeinado4() {
        return peinado;
    }
    public void setPeinado4(int peinado) {
        setServicios4(servicios+peinado);
        this.peinado = peinado*this.peinado;
        setTotal4(total+this.peinado);
    }
    public int getServicios4() {
        return servicios;
    }
    public void setServicios4(int servicios) {
        this.servicios = servicios;
    }
    public int getTotal4() {
        return total;
    }
    public void setTotal4(int total) {
        this.total = total;
    }   
}
