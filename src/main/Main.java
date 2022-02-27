package main;

import com.umg.data.structures.Queue.ArrayBasedQueue;
import com.umg.data.structures.Queue.LinkedListBasedQueue;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static ArrayBasedQueue arrayQueue = new ArrayBasedQueue(5);
    static LinkedListBasedQueue listQueue = new LinkedListBasedQueue();

    public static void main(String[] args) {queueMenu();}

    private static void queueMenu(){
        System.out.println("Implementación de Colas");
        System.out.println("1.-Basada en Arrays\n2.-Basada en Listas\n0.-Salir");
        int opc = read.nextInt();

        switch (opc){
            case 1: arrayQueueMenu();break;
            case 2: linkedListQueueMenu();break;
            default: break;
        }
    }

    private static void arrayQueueMenu(){
        System.out.println("\nColas basadas en Arrays");
        System.out.println("1.-Encolar\n2.-Desencolar\n3.-Cima\n4.-Tamaño\n5.-Volver");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                System.out.println("\nIngresa valor a encolar");
                int value = read.nextInt();
                arrayQueue.enqueue(value);
                arrayQueueMenu();
                break;
            case 2:
                System.out.println("\nElemento: "+arrayQueue.dequeue()+" Desencolado...");
                arrayQueueMenu();
                break;
            case 3:
                System.out.println("\nCima: "+arrayQueue.peek());
                arrayQueueMenu();
                break;
            case 4:
                System.out.println("\nEl tamaño de la cola: "+arrayQueue.size());
                arrayQueueMenu();
                break;
            case 5:
                queueMenu();
                break;
            default:break;
        }
    }
    private static void linkedListQueueMenu(){
        System.out.println("\nColas basadas en Listas");
        System.out.println("1.-Encolar\n2.-Desencolar\n3.-Cima\n4.-Tamaño\n5.-Volver");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                linkedListQueueMenu();
                break;
            case 2:
                linkedListQueueMenu();
                break;
            case 3:
                linkedListQueueMenu();
                break;
            case 4:
                linkedListQueueMenu();
                break;
            case 5:
                queueMenu();
                break;
            default:break;
        }
    }
}
