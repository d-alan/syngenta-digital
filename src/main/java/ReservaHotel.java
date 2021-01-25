import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservaHotel {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Hotel lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
        Hotel bridgewood = new Hotel("Bridgewood", 4, 160, 60, 110, 50);
        Hotel ridgewood = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
        List<Hotel> hoteis = new ArrayList<>();
        hoteis.add(lakewood);
        hoteis.add(bridgewood);
        hoteis.add(ridgewood);
        int d_semana=0, d_fds=0;
        
        //Teste de entrada como no exemplo dado
        //String entrada = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)"; /*Lakewood*/
        //String entrada = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";  /*Bridgewood*/
        //String entrada = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"; /*Ridgewood*/
        
        //Entrada do usuário
        String entrada;
        System.out.println("Digite a entrada: ");
        entrada = ent.nextLine();
        
        String[] vet = entrada.split(",");
        String clienteTipo = "";
        if (vet.length > 0) {
            String tempVet[] = vet[0].split(":");
            clienteTipo = tempVet[0];
            vet[0] = tempVet[1];
        }
        
        for (String dia : vet) {
            if (dia.contains("mon") || dia.contains("tues") || dia.contains("wed") || dia.contains("thur") || dia.contains("fri")) {
                d_semana++;
            } else {
                d_fds++;
            }
        }
        
        Pedido p = new Pedido(clienteTipo, d_semana, d_fds);
        
        Reserva r = new Reserva(hoteis,p);
        System.out.println("Hotel mais barato: "+r.nome);
    }
}
