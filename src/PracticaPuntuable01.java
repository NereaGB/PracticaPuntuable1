import java.util.Scanner;

public class PracticaPuntuable01 {
    public static void main(String[] args) {
        //Introducimos la longitud del array "numeros"
        int[] numeros = new int[10];
        Scanner read = new Scanner(System.in);

        //Realizamos un for con un escaner dentro para que se asigne cada numero a una posicion.
        for (int i = 0; i < 10; i++) {
            numeros[i]= read.nextInt();
        }

        //"La idea" de este for es que lea cada numero de cada posicion del array y los compare con la posicion siguiente, de ahi j+1.
        //Si j = 0, j+1 = 1
        for (int j = 0; j < 10; j++) {

            if (numeros[j] > numeros[j+1]) {
                System.out.println(numeros[j]);
            }
        }


    }
}
