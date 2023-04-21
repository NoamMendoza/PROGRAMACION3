
package Tema_3;

import java.util.Scanner;

class MiHilox extends Thread{
    MiHilox(String nombre){
        super(nombre);
    }
    public void run(){
        System.out.println(getName()+" ha iniciando.");
        try{
            for(int cont=0;cont<10;cont++){
                Thread.sleep(300);
                System.out.println(getName()+", el recuento es: "+cont);
            }
        }catch(InterruptedException exc){
            System.out.println(getName()+ " Interrumpido.");
        }
        System.out.println(getName()+" ha finalizado.");
    }
}

public class Hilo_Basico_Thread {
    public static void main(String[] args) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del hilo");
        name = sc.next();
        System.out.println("Iniciando hilo "+name);
        MiHilox mh = new MiHilox(name);
        mh.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
        try{
            Thread.sleep(100);
        }catch(InterruptedException exc){
            System.out.println("Hilo " + name+  "interrumpido");
        }
        }
        System.out.println("Hilo "+name+" ha finalizado");
    }
}
