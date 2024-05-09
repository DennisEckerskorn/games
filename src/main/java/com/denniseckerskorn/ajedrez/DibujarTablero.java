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
        StringBuilder sb = new StringBuilder();
        sb.append("  ").append(s1).append(s2);
        for (int contador = contadorInicio; contador < contadorFinal; contador++) {
            sb.append(s2).append(s3).append(s2);
        }
        sb.append(s2).append(s4).append("\n");
        System.out.print(sb);
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
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(posicionCasilla);
        for (int columna = contadorInicio; columna < contadorFinal; columna++) {
            sb.append(s1).append(s2).append(s3);
        }
        sb.append(s1).append("  ").append(posicionCasilla).append("\n");
        System.out.print(sb);
    }

    /**
     * Metodo que usa un bucle para mostrar las filas y el contenido de las filas.
     * Usa el contador i para el número de la fila o casilla.
     * Las filas y el contenido son métodos invocados.
     */
    public static void generarTablero() {
        pintarLetras();
        for (int i = 8; i >= 0; i--) {
            if (i != 0) {
                if (i == 8) {
                    generarFila(1, 8, Simbolos.ARRIBA_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ARRIBA, Simbolos.ARRIBA_DERECHA);
                } else {
                    generarFila(1, 8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
                }
                generarContenido(i, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);
            } else {
                generarFila(1, 8, Simbolos.ABAJO_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ABAJO, Simbolos.ABAJO_DERECHA);
            }
        }
        pintarLetras();
    }
}