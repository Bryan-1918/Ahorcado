# Juego de Ahorcado en JAVA
Se desarrolló un el juego de ahorcado en java en donde el usuario deberá ingresar una letra para adivinar la palabra. El juego cuenta con cierto número de intentos los cuales se van agotando a medida que el jugador ingrese una letra que no esté en la palabra a adivinar, el jugador no perderá intentos si adivina las letras que contiene la palabra. El juego termina cuando el jugador adivina la palabra o cuando se quede sin intentos.

## Herramientas utilizadas
1. Scanner
2. Random
3. Arreglos
4. Bucles
5. Clase String y sus métodos charAt, valueOf y length()
6. Clase Character y su método toLowerCase
7. Condicional

El desarrollo incluye una lista con varias palabras con el fin de que el programa busque aleatoriamente una palabra de la lista usando Random y que la palabra no sea definida dentro del código. A través de una variable tipo int, analizamos el tamaño del arreglo que contiene todas las palabras que más tarde con ayuda de random nos ayuda a seleccionar una palabra del arreglo usando los índices del mismo. Luego, creando una variable tipo String, le asignamos al arreglo la variable que recorrerá los índices. De esta manera se recorre el arreglo y escogerá una palabra de la lista para que el usuario la adivine.