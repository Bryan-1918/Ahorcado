import java.util.Scanner;
import java.util.Random;

public class Ahorcado {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        // Arreglo con palabras
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

        boolean palabraAdivinada;
        
        String palabra;

        int continuar;
        
        int maxIntentos = 10;
        
        Random randomWord = new Random();
        
        System.out.println("-------Bienvenido al juego del ahorcado-------");
        
        do {
            
            // Elegir el index del arreglo para escoger una palabra
            int indexWord = randomWord.nextInt(palabraSecreta.length);
            
            palabra = palabraSecreta[indexWord];
            
            int intentos = 0;
            
            // Guardar las letras ingresadas durante toda la partida
            char[] letraIng = new char[27];
            int letrasIngresadas = 0;

            palabraAdivinada = false;

            char[] letrasAdivinadas = new char[palabra.length()];
            
            for(int i = 0; i < letrasAdivinadas.length; i++) {
                letrasAdivinadas[i] = '_';
            }
            
            // Inicio del juego
            while(!palabraAdivinada && intentos < maxIntentos) {
                System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabra.length() + " letras)");
                System.out.print("Introduce una letra: ");
                char letra = Character.toLowerCase(sc.next().charAt(0));
                System.out.println();

                // Verificar si ya se había ingresado la letra
                boolean letraRepetida = false;
                
                for(int i = 0; i < letrasIngresadas; i++) {
                    if(letraIng[i] == letra) {
                        letraRepetida = true;
                        break;
                    }   
                }

                // Si está repetida se pide otra letra
                if(letraRepetida) {
                    System.out.println("Ya ingresaste la letra " + letra + ". Intenta con otra");
                    continue;
                }
                
                // Almacenarla en el array
                letraIng[letrasIngresadas] = letra;
                letrasIngresadas++;

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
                    System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabra);
                }
            }

            if(!palabraAdivinada && ((maxIntentos - intentos) == 0)) {
                System.out.println("Te quedaste sin intentos, la palabra era: " + palabra);
            }

            do {
                System.out.println("¿Desea seguir jugando?");
                System.out.println("1. Si");
                System.out.println("2. No");
                continuar = sc.nextInt();

                switch(continuar) {
                    case 1:
                        System.out.println("----Comenzando una nueva partida----");
                        break;
                    case 2:
                        System.out.println("----Ha salido del juego----");
                        break;
                    default:
                        System.out.println("Opción inválida. Ingrese 1 o 2.");
                }

            }while(continuar != 1 && continuar != 2);

        }while(continuar == 1);
        sc.close();

    }
}