/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author david
 */
public class Pedido {
    private final String tipo;
    private final int d_semana;
    private final int d_fds;
    
    public Pedido(String tipo, int d_semana, int d_fds){
        this.tipo = tipo;
        this.d_semana = d_semana;
        this.d_fds = d_fds;
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the d_semana
     */
    public int getD_semana() {
        return d_semana;
    }

    /**
     * @return the d_fds
     */
    public int getD_fds() {
        return d_fds;
    }
}
