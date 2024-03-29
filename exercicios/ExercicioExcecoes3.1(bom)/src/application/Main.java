// finalmente o exercicio de exceções está usando exceções

package application;
import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.print("Numero do quarto: ");
            int n = Integer.parseInt(sc.nextLine());

            System.out.print("Data de entrada (dd/mm/aaaa): ");
            Date entrada = sdf.parse(sc.next());

            System.out.print("Data de saída (dd/mm/aaaa): ");
            Date saida = sdf.parse(sc.next());


            Reserva rs = new Reserva(n, entrada, saida);
            System.out.println(rs.toString());

            System.out.println();
            System.out.println("Insira a data de reserva atualizada");

            System.out.print("Data de entrada (dd/mm/aaaa): ");
            entrada = sdf.parse(sc.next());

            System.out.print("Data de saída (dd/mm/aaaa): ");
            saida = sdf.parse(sc.next());

            rs.atualizaDatas(entrada, saida); // armazenando o método em uma string
            System.out.println(rs.toString());

        } catch (ParseException e){

            System.out.println("Formato de data inválido");

        } catch (IllegalArgumentException e){

            System.out.println(e.getMessage());  // imprime a mensagem de erro lá do método
            // faço o catch com o mesmo tipo de exceção que está no método update

        }

        sc.close();

    }
}
