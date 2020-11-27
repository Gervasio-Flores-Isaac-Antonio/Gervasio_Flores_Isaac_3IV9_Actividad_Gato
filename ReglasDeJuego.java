public class ReglasDeJuego {
    
    private char[][] tablero;
    private char jugadorUno;
    private char jugadorDos;
    private boolean turno;
    private int contador;

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public char getJugadorUno() {
        return jugadorUno;
    }
    

    public void setJugadorUno(char jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public char getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(char jugadorDos) {
        this.jugadorDos = jugadorDos;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
   
    
}
