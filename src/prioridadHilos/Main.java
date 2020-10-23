package prioridadHilos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Prioridad p1, p2;
        p1=new Prioridad("Hilo 1");
        p2=new Prioridad("Hilo 2");

        //Parte de prioridad

        p2.setPriority(10);
        p2.start();
        p1.start();

        //Parte de joins

        /*try {
            p2.join();
            p1.join();
        }catch (InterruptedException e){
            System.out.println("programa interrumpido");
        }*/
    }
}
