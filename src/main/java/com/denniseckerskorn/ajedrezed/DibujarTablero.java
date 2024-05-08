public class DibujarTablero {

	public static void main(String[] args) {

		dibujarTablero();
	}    

    public static void dibujarTablero() {

        // Pintando letras de la cabecera
        System.out.println("    a  b  c  d  e  f  g  h");

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
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 1
        System.out.print(" " + (7));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (7));
        
        //Fila 2
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 2
        System.out.print(" " + (6));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (6));
        
        //Fila 3
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 3
        System.out.print(" " + (5));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (5));
        
        //Fila 4
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 4
        System.out.print(" " + (4));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (4));
        
        //Fila 5
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 5
        System.out.print(" " + (3));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (3));
        
        //Fila 6
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
        //Contenido fila 6
        System.out.print(" " + (2));
        for (int columna = 0; columna < 8; columna++) {
            System.out.print(Simbolos.VERTICAL + Simbolos.ESPACIO_EN_BLANCO + Simbolos.ESPACIO_EN_BLANCO);
        }
        System.out.println(Simbolos.VERTICAL + "  " + (2));
        
        //Fila 7
        System.out.print("  " + Simbolos.IZQUIERDA + Simbolos.HORIZONTAL);
        for (int contador = 1; contador < 8; contador++) {
            System.out.print(Simbolos.HORIZONTAL + Simbolos.CENTRO + Simbolos.HORIZONTAL);
        }
        System.out.println(Simbolos.HORIZONTAL + Simbolos.DERECHA);
        
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
        System.out.println("    a  b  c  d  e  f  g  h");
    }

}