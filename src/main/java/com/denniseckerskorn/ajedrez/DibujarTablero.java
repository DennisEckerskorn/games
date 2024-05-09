package com.denniseckerskorn.ajedrez;

public class DibujarTablero {

    public static void main(String[] args) {
        generarTablero();
    }

    /**
     * Metodo que sirve para pintar unas letras al principio y al final del tablero
     */
    public static void pintarLetras() {
        System.out.println("    a  b  c  d  e  f  g  h");
    }

    /**
     * Metodo que genera filas, sirve para generar una fila por cada iteración del bucle.
     * Recibe los contadores del bucle for y 4 String como parámetros para los direcciones.
     *
     * @param contadorInicio valor inicial para el bucle, normalmente 1.
     * @param contadorFinal  valor final para el bucle, normalmente 8.
     * @param s1             Simbolos
     * @param s2             Simbolos
     * @param s3             Simbolos
     * @param s4             Simbolos
     */
    public static void generarFila(int contadorInicio, int contadorFinal, String s1, String s2, String s3, String s4) {
        System.out.print("  " + s1 + s2);
        for (int contador = contadorInicio; contador < contadorFinal; contador++) {
            System.out.print(s2 + s3 + s2);
        }
        System.out.println(s2 + s4);
    }

    /**
     * Metodo que sirve para generar el contenido de las filas creadas por el metodo previo.
     * Recibe como prámetro la posición de la casilla y los contadores para el bucle for.
     * También recibe las direcciones como String.
     *
     * @param posicionCasilla La posición de cada fila
     * @param contadorInicio  Contador bucle inicial, normalmente 0
     * @param contadorFinal   Contador bucle final, normalmente 8
     * @param s1              Simbolos
     * @param s2              Simbolos
     * @param s3              Simbolos
     */
    public static void generarContenido(int posicionCasilla, int contadorInicio, int contadorFinal, String s1, String s2, String s3) {
        System.out.print(" " + (posicionCasilla));
        for (int columna = contadorInicio; columna < contadorFinal; columna++) {
            System.out.print(s1 + s2 + s3);
        }
        System.out.println(s1 + "  " + (posicionCasilla));
    }

    /**
     * Metodo que usa un contador que decrementa para la posición de cada fila (casilla).
     * Se pintan las letras y empieza el bucle para genera filas y contenido.
     * Si el contador i es igual a 0 imprime una fila diferente al ser la primera y decrementa el contador en 1.
     * Se imprimen el resto de filas y contenidos hasta que el contador llegue a 0,
     * en este caso imprime una última fila que es diferente a las otras y sale del bucle.
     */
    public static void generarTablero() {
        int contadorContenido = 8;
        pintarLetras();
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                generarFila(1, 8, Simbolos.ARRIBA_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ARRIBA, Simbolos.ARRIBA_DERECHA);
                generarContenido(contadorContenido, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);
                contadorContenido--;
            }
            generarFila(1, 8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
            generarContenido(contadorContenido, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);
            contadorContenido--;
            if (contadorContenido == 0) {
                generarFila(1, 8, Simbolos.ABAJO_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ABAJO, Simbolos.ABAJO_DERECHA);
                pintarLetras();
                break;
            }
        }
    }
}