package com.denniseckerskorn.ajedrez;
public class DibujarTablero {

	public static void main(String[] args) {

		dibujarTablero();
	}

    /**
     * Método que genera filas, sirve para generar la fila 1 a la 7.
     * @param contadorInicio valor inicial para el bucle, normalmente 1.
     * @param contadorFinal valor final para el bucle, normalmente 8.
     * @param izquierda Simbolos.IZQUIERDA
     * @param horizontal Simbolos.HORIZONTAL
     * @param centro Simbolos.CENTRO
     * @param derecha Simbolos.DERECHA
     */
    public static void generarFila(int contadorInicio, int contadorFinal, String izquierda, String horizontal, String centro, String derecha) {
        System.out.print("  " + izquierda + horizontal);
        for (int contador = contadorInicio; contador < contadorFinal; contador++) {
            System.out.print(horizontal + centro + horizontal);
        }
        System.out.println(horizontal + derecha);
    }

    /**
     * Método que sirve para pintar unas letras al principio y al final del tablero
     */
    public static void pintarLetras() {
        System.out.println("    a  b  c  d  e  f  g  h");
    }

    public static void dibujarTablero() {

        // Pintando letras de la cabecera
        pintarLetras();

        //Fila 0
        System.out.print("  " + Simbolos.ARRIBA_IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.ARRIBA + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.ARRIBA_DERECHA);
        
        //Contenido fila 0
        System.out.print(" " + (8));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (8));
        
        //Fila 1
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 1
        System.out.print(" " + (7));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (7));
        
        //Fila 2
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 2
        System.out.print(" " + (6));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (6));
        
        //Fila 3
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 3
        System.out.print(" " + (5));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (5));
        
        //Fila 4
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 4
        System.out.print(" " + (4));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (4));
        
        //Fila 5
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 5
        System.out.print(" " + (3));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (3));
        
        //Fila 6
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 6
        System.out.print(" " + (2));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (2));
        
        //Fila 7
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 7
        System.out.print(" " + (1));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (1));        
        
        //Pie del tablero
        System.out.print("  " + Simbolos.ABAJO_IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.ABAJO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.ABAJO_DERECHA);
        
        //Letras del pie del tablero
        pintarLetras();
    }

}