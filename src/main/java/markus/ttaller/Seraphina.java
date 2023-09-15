/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markus.ttaller;

/**
 *
 * @author johan
 */
public class Seraphina extends Valores {
    private int servicios;
    private int total;
    public Seraphina() {
    }

    public Seraphina(int servicios, int total, int caballero, int dama, int tintura, int peinado) {
        super(caballero, dama, tintura, peinado);
        this.servicios = servicios;
        this.total = total;
    }
    
    public int getCaballero2() {
        return caballero;
    }
    public void setCaballero2(int caballero) {
        setServicios2(servicios+caballero);
        this.caballero = caballero*this.caballero;
        setTotal2(total+this.caballero);
    }
    public int getDama2() {
        return dama;
    }
    public void setDama2(int dama) {
        setServicios2(servicios+dama);
        this.dama = dama*this.dama;
        setTotal2(total+this.dama);
    }
    public int getTintura2() {
        return tintura;
    }
    public void setTintura2(int tintura) {
        setServicios2(servicios+tintura);
        this.tintura = tintura*this.tintura;
        setTotal2(total+this.tintura);
    }
    public int getPeinado2() {
        return peinado;
    }
    public void setPeinado2(int peinado) {
        setServicios2(servicios+peinado);
        this.peinado = peinado*this.peinado;
        setTotal2(total+this.peinado);
    }
    public int getServicios2() {
        return servicios;
    }
    public void setServicios2(int servicios) {
        this.servicios = servicios;
    }
    public int getTotal2() {
        return total;
    }
    public void setTotal2(int total) {
        this.total = total;
    }   
}
