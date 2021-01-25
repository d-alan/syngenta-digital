/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;

/**
 *
 * @author david
 */
public class Reserva {
    private final List<Hotel> hotel;
    private final Pedido pedido;
    private final int [] valores;
    public String nome;
    
    public Reserva(List<Hotel> hotel, Pedido pedido){
        this.hotel = hotel;
        this.pedido = pedido;
        this.valores = new int[hotel.size()];
        int i=0;
        
        if ("Regular".equals(pedido.getTipo())){
            for(Hotel h : hotel){
                valores[i] = pedido.getD_semana()*hotel.get(i).getV_semana()+
                             pedido.getD_fds()*hotel.get(i).getV_fds();
                i++;
            }
        }
        
        if ("Rewards".equals(pedido.getTipo())){
            for(Hotel h : hotel){
                valores[i] = pedido.getD_semana()*hotel.get(i).getR_semana()+
                             pedido.getD_fds()*hotel.get(i).getR_fds();
                i++;
            }
        }
        
        int menor = valores[0];
        int index = 0;
        this.nome = hotel.get(0).getNome();
        
        for(int j = 1; j<valores.length; j++){
            if(valores[j]<menor){
                menor = valores[j];
                nome = hotel.get(j).getNome();
                index = j;
            }if(valores[j]==menor){
                if(hotel.get(index).getNota()>hotel.get(j).getNota()) this.nome = hotel.get(index).getNome();
                else this.nome = hotel.get(j).getNome();
            }
            /*
            if(valores[j]<menor || ((valores[j]<menor)&&(hotel.get(j).getNota()>hotel.get(index).getNota()))){
                System.out.println("index: "+index);
                menor = valores[j];
                index=j;
                nome = hotel.get(j).getNome();
            }
            */
        }
    }
}
