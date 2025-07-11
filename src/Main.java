import java.util.Scanner;
/*
El programa crea un arreglo de 20 numeros creados al azar
Te imprime los numeros que se crearon en la consola
Te pide que selecciones si quieres que resalte los multiplos de 5 o 7
Resalta los multiplos de la opcion seleccionada rodeandolos con corchetes [] al momento de imprimirlos en la consola
 */

public class Main {
    public static void main(String[] args) {
        Codigo6 numeros = new Codigo6();
        numeros.resaltarNumeros();
    }
}

//Se agrego clase Codigo6 con metodo resaltarNumeros() para conservar archivo y clase Main
class Codigo6{
    public void resaltarNumeros () {
        //Se agrego la palabra reservada "new" para que se cree apropiadamente el arreglo
        int[] n = new int[20];
        //Se arreglo el incremento del acumulador
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            //Se agrego el .out al sout
            System.out.print(n[i] + " ");
        }
        //Se corrigio el sout al escribir correctamente println
        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        //Se agrego un parentesis de cierre a Integer.paresInt()
        Scanner scan = new Scanner(System.in);
        //Se reemplazo System.console().readLine() ya que este metodo solo funciona fuera de un IDE
        int opcion = scan.nextInt();
        //Se corrigio la sintaxis del operador ternario, se cambiaron de posicion los simbolos ? y :
        int multiplo = (opcion == 1) ? 5 : 7;
        //Se corrigio la sintaxis del ciclo for each, se cambio el tipo de valor que es "e" de char a int
        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
                //Se agrego llave de cierre de condicional if
            }else {
                //Se corrigio cambio el metodo .in por .out para imprimir la palabra
                System.out.print(e + " ");
            }
        }
    }
}