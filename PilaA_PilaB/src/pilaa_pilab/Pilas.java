package pilaa_pilab;

import java.util.Random;
import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        //sirve para leer que es ingresada por teclado
        Scanner obj = new Scanner(System.in);
        Random naleatorio = new Random();
        int tope = 0, tampila, opc;
        //imprimir mensaje en pantalla
        System.out.print("Ingrese el tamaño de la pila:");
        tampila = obj.nextInt();
        //Vectores 
        int apila[] = new int[tampila];
        int bpila[] = new int[tampila];//Vector "bpila" B
        int cpila[] = new int[tampila]; //Vector pila C
//Menu
        do {
            System.out.println("\n1. - Llenar pilas A,B\n"
                    + "2. - Mostrar Pilas A,B\n"
                    + "3. - Vaciar pilas A,B\n"
                    + "4. - Unir pilas A,B\n"
                    + "5. - Mostrar pila C\n"
                    + "6. - Salir");
            switch (opc = obj.nextInt()) {
                //Llenar pilas A
                case 1:
                    for (int i = 0; i < tampila; i++) {
                        apila[i] = naleatorio.nextInt(100 - 1 + 1) + 1;
                    }
                    System.out.println();
//se declara el rango de la serie de numeros que quiero mostara primero se declara el fin seguido del incio de él
//Declramos un cliclo for 
                    for (int j = 0; j < tampila; j++) {
                        //la posicion j se va guardar en el vector bpila 
//Se declara primero el fin , el inicio de la serie de nuermos que va mostrar de forma aleatoria
                        //naleatoria es el nombre del vecotr , utilizamos el metodo random
                        bpila[j] = naleatorio.nextInt(200 - 100 + 1) + 100;                             
                    }
System.out.print("..... Pila Llena .....");
                    break;
                //Mostrar 
                case 2:
                    //Declaramos el ciclo  for 
                    for (int i = 0; i < apila.length; i++) {
                        //Se imprimira los elementos de A
                        System.out.println("Pila A:" + apila[i]);
                    }
                    System.out.println();//se imprimira un salto entre cada pila
                    //Declaramos un cliclo for 
                    for (int j = 0; j < bpila.length; j++) {
                        //mostramos los elementos de la pila B el nombre del vector "bpila " con el contador "j"
                        System.out.println("Pila B:" + bpila[j]);
                    }
                    break;
                    //Vaciar pila AB
                case 3:
                    //Se declara el contador que es igual a ser así , mostrando ceros de que esta bacio 
                    for(int i=0; i<tampila;i++){
                        apila[i]=0;
                        bpila[i]=0;
                       
                    }
                    System.out.print("..... Pila Vacia .....");
                    break;
                    //Unir pilas A,B
                case 4:   
                    //Se inicializa j en 0 , se ira aunmentan en una unidad como vayase ejecutando el ciclo for
                    int j=0;
                    for (int i=0; i<tampila; i++){
                       cpila[j]=apila[i]+bpila[i];                      
                       j++;                       
             } 
                    System.out.print("..... Pilas A y B unidas .....");
                   break;
                    //Mostra pila C
                case 5:
                    System.out.print("Pila C =A+B\n");
                    //Se declara un ciclo for 
                    for (int i=0; i<tampila; i++){
                        //Mandar inprimir el vector con el contador "i"
                         System.out.print(" "+cpila[i]);
                    }
                    break;
            }

        } while (opc != 6);
    }

}