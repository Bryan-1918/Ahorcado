import java.util.Scanner;
import java.util.Random;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] palabraSecreta = {
            "computadora",
            "programacion",
            "java",
            "teclado",
            "pantalla",
            "internet",
            "telefono",
            "videojuego",
            "pelicula",
            "musica",
            "guitarra",
            "biblioteca",
            "escuela",
            "universidad",
            "montaña",
            "playa",
            "desierto",
            "bosque",
            "oceano",
            "planeta",
            "elefante",
            "jirafa",
            "canguro",
            "mariposa",
            "tortuga",
            "cocodrilo",
            "delfin",
            "tigre",
            "hamburguesa",
            "chocolate",
            "pizza",
            "manzana",
            "sandia",
            "bicicleta",
            "avion",
            "helicoptero",
            "cohete",
            "castillo",
            "aventura",
            "misterio",
            "fletero"
        };

        Random randomWord = new Random();

        int indexWord = randomWord.nextInt(palabraSecreta.length);

        String palabra = palabraSecreta[indexWord];

        int maxIntentos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabra.length()];

        for(int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < maxIntentos) {
            System.out.println("--------Bienvenido al ahorcado--------");
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabra.length() + " letras)");
            System.out.print("Introduce una letra: ");
            char letra = Character.toLowerCase(sc.next().charAt(0));
            System.out.println();

            boolean letraCorrecta = false;

            for(int i = 0; i < palabra.length(); i++) {
                if(palabra.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }


            if(!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (maxIntentos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabra)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta! " + palabra);
            }

        }

        if(!palabraAdivinada) {
            System.out.println("Has perdido, la palabra era: " + palabra);
        }

        sc.close();
    }
}
