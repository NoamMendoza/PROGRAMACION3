
package Tema_3;

class MiHilo implements Runnable{
    String nombreHilo;
    MiHilo(String nombre){
        nombreHilo=nombre;
    }
    public void run(){
        System.out.println("Comenzando "+ nombreHilo);
        try{
            for(int cont=0;cont<10;cont++){
                Thread.sleep(400);
                System.out.println("En "+nombreHilo+", el recuento "+cont);
            }
        }catch(InterruptedException exc){
            System.out.println(nombreHilo+ "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }
}


public class Hilo_Basico_Runnable {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciado");
        MiHilo mh = new MiHilo("#1");
        Thread nuevoh = new Thread(mh);
        nuevoh.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(" .");
            
        }try{
            Thread.sleep(100);
        }catch(InterruptedException exc){
            System.out.println("Hilo principal interrumpido");
        }
        System.out.println("Hilo principal finalizado");
    }
}
