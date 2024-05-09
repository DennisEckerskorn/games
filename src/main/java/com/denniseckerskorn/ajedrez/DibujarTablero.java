package com.denniseckerskorn.ajedrez;

public class DibujarTablero {

    public static void main(String[] args) {
        generarTablero();
    }

    /**
     * Método que pinta las letras al principio y al final del tablero.
     */
    public static void pintarLetras() {
        String letras = "    a  b  c  d  e  f  g  h";
        System.out.println(letras);
    }

    /**
     * Método que genera una fila del tablero.
     *
     * @param contadorInicio valor inicial para el bucle, debe estar entre 1 y 8.
     * @param contadorFinal  valor final para el bucle, debe estar entre 1 y 8.
     * @param s1             símbolo inicial de la fila.
     * @param s2             símbolo medio de la fila.
     * @param s3             símbolo final de la fila.
     * @param s4             símbolo al final de la fila.
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
     * Método que genera el contenido de una fila del tablero.
     *
     * @param posicionCasilla posición de la casilla en la fila.
     * @param contadorInicio  contador inicial del bucle, normalmente 0.
     * @param contadorFinal   contador final del bucle, normalmente 8.
     * @param s1              símbolo a la izquierda de cada casilla.
     * @param s2              símbolo dentro de cada casilla.
     * @param s3              símbolo entre casillas.
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
     * Método que genera el tablero completo.
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