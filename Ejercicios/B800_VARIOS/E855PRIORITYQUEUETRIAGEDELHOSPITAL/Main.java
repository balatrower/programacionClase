package B800_VARIOS.E855PRIORITYQUEUETRIAGEDELHOSPITAL;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    void main() {
        String[] nombresRandom = {"Taimur", "Felix", "Blazquez"};
        String[] sintomasRandom = {"Picor en la zona escrotal", "Pierna hinchada", "Dolor en el testiculo derecho al conducir"};
        PriorityQueue<Paciente> colaUrgencias = new PriorityQueue<>();

        colaUrgencias.offer(new Paciente("Elena", "Brazo roto", 2));
        colaUrgencias.offer(new Paciente("Marcos", "Dolor de garganta", 3));
        colaUrgencias.offer(new Paciente("Sofia", "Ataque cardiaco", 1));
        colaUrgencias.offer(new Paciente("Luis", "Fiebre alta", 2));
        colaUrgencias.offer(new Paciente("Carmen", "Corte leve", 3));
        colaUrgencias.offer(new Paciente("Jorge", "Dificultad para respirar", 1));

        Random random = new Random();
        int contadorNuevos = 1;

        IO.println("inicio atencion a pacientes de la sala");
        IO.println();

        while (!colaUrgencias.isEmpty()) {
            Paciente atendido = colaUrgencias.poll();
            IO.println("se ha atendido a: " + atendido);

            if (random.nextInt(100) < 30) {
                int prioridadAleatoria = random.nextInt(3) + 1;
                String nombreRandom = nombresRandom[random.nextInt(3)] + " "; // espacio concatenado necesario para que no quede junto
                String sintomaRandom = sintomasRandom[random.nextInt(3)];
                Paciente nuevo = new Paciente(nombreRandom, sintomaRandom, prioridadAleatoria);

                colaUrgencias.offer(nuevo);
                IO.println("nuevo paciente en urgencias: " + nuevo + " total de nuevos pacientes: " + contadorNuevos);
                contadorNuevos++;
            }

            // parar un pelin la consola pa que se lea mejor
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        IO.println();
        IO.println("no hay mas pacientes en la sala, finalizar turno");
    }
}
