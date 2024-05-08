package com.denniseckerskorn.ajedrez;
public class DibujarTablero {

	public static void main(String[] args) {

		dibujarTablero();
	}

    /**
     * Método que genera filas, sirve para generar la fila 1 a la 7.
     * @param contadorInicio valor inicial para el bucle, normalmente 1.
     * @param contadorFinal valor final para el bucle, normalmente 8.
     * @param s1 Simbolos.IZQUIERDA
     * @param s2 Simbolos.HORIZONTAL
     * @param s3 Simbolos.CENTRO
     * @param s4 Simbolos.DERECHA
     */
    public static void generarFila(int contadorInicio, int contadorFinal, String s1, String s2, String s3, String s4) {
        System.out.print("  " + s1 + s2);
        for (int contador = contadorInicio; contador < contadorFinal; contador++) {
            System.out.print(s2 + s3 + s2);
        }
        System.out.println(s2 + s4);
    }

    /**
     * Método que sirve para pintar unas letras al principio y al final del tablero
     */
    public static void pintarLetras() {
        System.out.println("    a  b  c  d  e  f  g  h");
    }

    public static void generarContenido(int posicionCasilla, int contadorInicio, int contadorFinal, String s1, String s2, String s3) {
        System.out.print(" " + (posicionCasilla));
        for (int columna = contadorInicio; columna < contadorFinal; columna++) {
            System.out.print(s1 + s2 + s3);
        }
        System.out.println(s1 + "  " + (posicionCasilla));
    }

    public static void generarVariosContenidos() {
        for(int i = 8; i >= 1; i--) {
            generarContenido(i, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);
        }
    }

    public static void generarTablero() {
        pintarLetras();
        for(int i = 0; i < 8; i++) {
            if(i == 0) {
                generarFila(1, 8, Simbolos.ARRIBA_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ARRIBA, Simbolos.ARRIBA_DERECHA);
            } else {

            }
        }
    }

    public static void dibujarTablero() {

        // Pintando letras de la cabecera
        pintarLetras();

        //Fila 0


        //Contenido fila 0
        generarContenido(8, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

        //Fila 1
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 1
        generarContenido(7, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

        //Fila 2
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 2
        generarContenido(6, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

        //Fila 3
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 3
        generarContenido(5, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

        //Fila 4
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 4
        generarContenido(4, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

        //Fila 5
        generarFila(1,8, Simbolos.IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.CENTRO, Simbolos.DERECHA);
        
        //Contenido fila 5
        generarContenido(3, 0, 8, Simbolos.VERTICAL, Simbolos.ESPACIO_EN_BLANCO, Simbolos.ESPACIO_EN_BLANCO);

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
        generarFila(1, 8, Simbolos.ABAJO_IZQUIERDA, Simbolos.HORIZONTAL, Simbolos.ABAJO, Simbolos.ABAJO_DERECHA);

        
        //Letras del pie del tablero
        pintarLetras();
    }

}