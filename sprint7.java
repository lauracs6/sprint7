import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = comprobarNumero(teclado);  //Llama al metodo de entero

        multiplosNumero (numero);       //Llama al metodo de multiplos
        
    }



    public static int comprobarNumero(Scanner teclado) {   //Comprobar si es número entero y en rango
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println("Introduce un número entero entre 1 y 20: ");
            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                if (numero >= 1 && numero <= 20) {
                    valido = true;
                } else {
                    System.out.println("Número fuera de rango. Introduce un número válido: ");
                }
            } else {
                System.out.println("El número no es entero. Introduce un número entero: ");
            }
        }
        return numero;
    }




    public static void multiplosNumero(int numero) {    //Calcular los múltiplos

        System.out.println("Múltiplos de " + numero + " entre 0 y 100: ");

        int i = 1;
        while (numero * i <= 100) {
            System.out.println(numero * i);
            i++;
        }
    }
}
