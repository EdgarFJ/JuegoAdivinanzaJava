import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int numeroGenerado = numeroAleatorio.nextInt(101);
        Scanner teclado = new Scanner(System.in);

        int intentos = 0;

        while(intentos < 5){
            System.out.println("Por favor ingrese un numero:");
            int entradaUsuario = teclado.nextInt();

            if(entradaUsuario == numeroGenerado){
                System.out.println("El numero coincide");
                break;
            }else{
                if (entradaUsuario < numeroGenerado) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            }
            intentos++;
            }
            if (intentos == 5) {
            System.out.println("Lo siento, se te acabaron los intentos. El número era: " + numeroGenerado);
        }
    }
}