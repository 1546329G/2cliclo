/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jumanji;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WIN 10
 */
public class clsNivelFacil {

    public clsNivelFacil() {
    }

    Scanner sc = new Scanner(System.in);

    public void NivelFacil() {
        clsCarta[] cartas = {
            new clsCarta("Rafaga de viento!", "Avanza 2 casillas"),
            new clsCarta("Plantas Salvajes! ", "Retrocede 2 casillas"),
            new clsCarta("Encontraste un atajo! ", "Avanza 3 casillas"),
            new clsCarta("manada de leones: ! ", "Retrocede 3 casillas"),};

        System.out.println("----------------BIENVENIDO A JUMANJI(nivel Facil)-----------------");
        boolean seguirJugando = true;

        while (seguirJugando) {
            //Array de fichas

            String[] fichas = {"zapato", "carro", "caballo", "chapa"};

            // Determinar el orden de los jugadores
            String[] jugadores = {"Jugador 1", "Jugador 2"};

            // Crear un objeto Random para lanzar los dados
            Random random = new Random();
            //Array de las posiciones de le los jugadores
            // Inicializar la posición de los jugadores en 0
            int[] posiciones = new int[jugadores.length];

            String[] nombresFichas = new String[jugadores.length];
            for (int i = 0; i < jugadores.length; i++) {
                System.out.println("");
                System.out.println("--------------------------------------------");
                System.out.println(jugadores[i] + ", elige una ficha de la lista: ");
                for (int j = 0; j < fichas.length; j++) {
                    System.out.println((j + 1) + ". " + fichas[j]);
                }
                int seleccion = sc.nextInt();
                sc.nextLine();

                if (seleccion >= 1 && seleccion <= fichas.length) {
                    nombresFichas[i] = fichas[seleccion - 1];
                    System.out.println(jugadores[i] + " ha elegido la ficha: " + nombresFichas[i]);
                } else {
                    System.out.println("Selección no válida. Se asignará una ficha por defecto.");
                    nombresFichas[i] = fichas[i]; // Asignar una ficha por defecto
                }
            }
            //Dertiminamos que jugador comienza el juego
            int jugadorQueComienza = 0;
            int mayorResultado = 0;
            System.out.println("--------------------------------------------");
            System.out.println("LOS JUGADORES PROCEDEN A LANZAR LOS DADOS");
            System.out.println("--------------------------------------------");

            for (int i = 0; i < jugadores.length; i++) {

                int resultadoDado = random.nextInt(6) + 1;
                System.out.println("\n" + jugadores[i] + " (" + nombresFichas[i] + ") lanzo el dado y obtuvo un " + resultadoDado);

                if (resultadoDado > mayorResultado) {
                    mayorResultado = resultadoDado;
                    jugadorQueComienza = i;
                }
            }
            System.out.println("\n" + jugadores[jugadorQueComienza] + " (" + nombresFichas[jugadorQueComienza] + ") saco un número mayor y comienza el juego.");

            // Juego principal
            int jugadorActual = jugadorQueComienza;
            boolean ganador = false;
            while (!ganador) {
                System.out.println("--------------------------------------------");
                System.out.println("");
                System.out.println(jugadores[jugadorActual] + " (" + nombresFichas[jugadorActual] + "), es tu turno.");
                System.out.println("Presiona enter para lanzar el Dado.");
                sc.nextLine();

                // Lanzar el dado
                int dado = random.nextInt(6) + 1;
                System.out.println("Has sacado un " + dado);
                //Condiciones de la carta

                //Avanza 2 casillas
                if ((posiciones[jugadorActual] == 10) || (posiciones[jugadorActual] == 20) || (posiciones[jugadorActual] == 30) || (posiciones[jugadorActual] == 31)) {
                    System.out.println("Saca una Carta Presiona enter");
                    sc.nextLine();
                    clsCarta cartaObtenida = cartas[0];
                    System.out.println("Has obtenido la carta: " + cartaObtenida.nombre);
                    System.out.println("Avanza 2 Casillas");
                    if (cartaObtenida.efecto.equals("Avanza 2 casillas")) {
                        posiciones[jugadorActual] += 2;
                    }
                }
                //Retrocede 2 casillas
                else if ((posiciones[jugadorActual] == 7) || (posiciones[jugadorActual] == 11) || (posiciones[jugadorActual] == 27) || (posiciones[jugadorActual] == 33) || (posiciones[jugadorActual] == 37) || (posiciones[jugadorActual] == 35)) {
                    System.out.println("Saca una Carta Presiona enter");
                    sc.nextLine();
                    clsCarta cartaObtenida = cartas[1];
                    System.out.println("Has obtenido la carta: " + cartaObtenida.nombre);
                    System.out.println("Retrocede 2 casillas");
                    if (cartaObtenida.efecto.equals("Retrocede 2 casillas")) {
                        posiciones[jugadorActual] -= 2;
                    }
                }
                
                //avaza 3 casillas 
                                if ((posiciones[jugadorActual] == 8) || (posiciones[jugadorActual] == 14) || (posiciones[jugadorActual] == 22) || (posiciones[jugadorActual] == 25)) {
                    System.out.println("Saca una Carta Presiona enter");
                    sc.nextLine();
                    clsCarta cartaObtenida = cartas[2];
                    System.out.println("Has obtenido la carta: " + cartaObtenida.nombre);
                    System.out.println("Avanza 3 Casillas");
                    if (cartaObtenida.efecto.equals("Avanza 3 casillas")) {
                        posiciones[jugadorActual] += 3;
                    }
                }
                //Retrocede 3 casillas
                if ((posiciones[jugadorActual] == 9) || (posiciones[jugadorActual] == 12) || (posiciones[jugadorActual] == 25) || (posiciones[jugadorActual] == 31) || (posiciones[jugadorActual] == 33) || (posiciones[jugadorActual] == 38)) {
                    System.out.println("Saca una Carta Presiona enter");
                    sc.nextLine();
                    clsCarta cartaObtenida = cartas[3];
                    System.out.println("Has obtenido la carta: " + cartaObtenida.nombre);
                    System.out.println("Retrocede 3 casillas");
                    if (cartaObtenida.efecto.equals("Retrocede 3 casillas")) {
                        posiciones[jugadorActual] -= 3;
                    }
                }
                // Lanza los dados nuevamente
                if (dado == 1) {
                    System.out.println("Vuelve a lanzar el Dado (se anula cartas y te da un nuevo resultado)! ");
                    System.out.println("Presiona enter para lanzar el dado nuevamente.");
                    sc.nextLine();
                    dado = random.nextInt(6) + 1;
                    System.out.println("Has sacado un " + dado);
                }
                // Avanzar a la nueva posición
                posiciones[jugadorActual] += dado;
                System.out.println("Ahora estas en la casilla " + posiciones[jugadorActual]);

                // Verificamos si el jugador ha llegado a la casilla 40
                if (posiciones[jugadorActual] >= 40) {
                    System.out.println("");
                    System.out.println(jugadores[jugadorActual] + " (" + nombresFichas[jugadorActual] + ") HA GANDO EL JUEGO! ");
                    ganador = true;
                }

                // Pasar al siguiente jugador
                jugadorActual = (jugadorActual + 1) % jugadores.length;
                System.out.println("");

            }

            System.out.println("¿Desea seguir jugando otra vez?(si) y (no) para regresar al menu de niveles: ");
            String respuesta = sc.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                seguirJugando = false;
            }
        }

    }
}

