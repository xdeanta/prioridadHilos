package prioridadHilos;

public class Prioridad extends Thread{
    public Prioridad(String nomb){
        super(nomb);
    }

    @Override
    public void run() {
        System.out.println("Soy " + getName());
    }
}
