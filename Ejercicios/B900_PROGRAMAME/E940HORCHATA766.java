package B900_PROGRAMAME;

import java.util.PriorityQueue;
import java.util.Scanner;

public class E940HORCHATA766 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true){
            int cantidadHorchata = entrada.nextInt();
            int numeroPersonas = entrada.nextInt();

            if (cantidadHorchata == 0 && numeroPersonas == 0) {
                break;
            }

            PriorityQueue<Persona> cola = new PriorityQueue<>();
            for (int i = 0; i < numeroPersonas; i++) {
                int prioridad = entrada.nextInt();
                int capacidadBotella = entrada.nextInt();
                Persona persona = new Persona(prioridad, capacidadBotella);
                cola.add(persona);
            }

            int personasServidas = 0;
            while (!cola.isEmpty()) {
                Persona persona = cola.poll();

                if (cantidadHorchata >= persona.getCapacidadBotella()) {
                    cantidadHorchata = cantidadHorchata - persona.getCapacidadBotella();
                    personasServidas++;
                } else {
                    break;
                }
            }

            System.out.printf("%d %d\n", personasServidas, cantidadHorchata);
        }
    }
}

class Persona implements Comparable<Persona> {
    private int prioridad;
    private int capacidadBotella;

    public Persona(int prioridad, int capacidadBotella) {
        setPrioridad(prioridad);
        setCapacidadBotella(capacidadBotella);
    }

    @Override
    public int compareTo(Persona otra) {
        if (getPrioridad() != otra.getPrioridad()) { //cuando no tienen misma prioridad
            return otra.getPrioridad() - getPrioridad(); // sale negativo cuando mayor este objeto es mayor entonces coloca al de mayor prioridad primero
        }
        // comparar por capacidad de botella para que este ordenado siempre da igual prioridad este se hace en el orden contrario que el de prioridad ya que
        // aqui un valor mayor no indica que deba ir antes si no lo contrario
        return getCapacidadBotella() - otra.getCapacidadBotella();
    }

    public void setCapacidadBotella(int capacidadBotella) {
        this.capacidadBotella = capacidadBotella;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getCapacidadBotella() {
        return capacidadBotella;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
