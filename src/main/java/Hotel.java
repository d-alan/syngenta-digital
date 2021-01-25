/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author david
 */
public class Hotel {
    private final String nome;
    private final int nota;
    //valor para regular
    private final int v_semana;
    private final int v_fds;
    //valor para reward
    private final int r_semana;
    private final int r_fds;
    
    public Hotel(String nome, int nota, int v_semana, int v_fds, int r_semana, int r_fds){
        this.nome = nome;
        this.nota = nota;
        this.v_semana = v_semana;
        this.v_fds = v_fds;
        this.r_semana = r_semana;
        this.r_fds = r_fds;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }


    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @return the v_semana
     */
    public int getV_semana() {
        return v_semana;
    }

    /**
     * @return the v_fds
     */
    public int getV_fds() {
        return v_fds;
    }

    /**
     * @return the r_semana
     */
    public int getR_semana() {
        return r_semana;
    }

    /**
     * @return the r_fds
     */
    public int getR_fds() {
        return r_fds;
    }
}
