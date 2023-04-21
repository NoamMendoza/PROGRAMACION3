
package Tema_3;


class MisHilo extends Thread{
    
    MisHilo(String nombre){
        super(nombre);
    }
    
    public void run(){
        int numero= ((int)Math.random()*3+1);
        System.out.println(getName()+" ha iniciando.");
        try{
            for(int cont=0;cont<10;cont++){
                Thread.sleep(numero*100);
                System.out.println(getName()+", el recuento es: "+cont);
            }
        }catch(InterruptedException exc){
            System.out.println(getName()+ " Interrumpido.");
        }
        System.out.println(getName()+" ha finalizado.");   
    }
}

public class Con2Hilos {
    public static void main(String[] args) {
        Thread hiloA=new MisHilo("Hilo_1");
        Thread hiloB=new MisHilo("Hilo_2");
        
        hiloA.start();
        hiloB.start();
        
        try{
            Thread.currentThread().sleep(1000);
        }catch(InterruptedException e){
            
        }
        
        hiloA.stop();
        hiloB.stop();
    }
}
