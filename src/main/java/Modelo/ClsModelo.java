/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author davba
 */
public class ClsModelo {

    private boolean turno = true;
    private boolean ocupado = false;
    private byte juego = 0;
    private String tablero[][] = {{"", "", ""}, {"", "", ""}, {"", "", ""}};

    public ClsModelo() {

    }

    public boolean getOcupado() {
        return ocupado;
    }

    public byte getJuego() {
        return juego;
    }

    public void iniaTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "";
            }
        }

        turno = true;
        ocupado = false;
        juego = 0;

    }

    public String movimiento(int pos) {

        String simbolo;
        if (turno) {
            simbolo = marcar(pos, "X");
            if (Gano("X")) {
                juego = 1;
            } else if (Empato()) {
                juego = 3;
            }
        } else {
            simbolo = marcar(pos, "O");
            if (Gano("O")) {
                juego = 2;
            } else if (Empato()) {
                juego = 3;
            }
        }
        return simbolo;
    }

    public String marcar(int pos, String valor) {
        String simbolo;

        switch (pos) {
            case 0 ->
                simbolo = verificar(0, 0, valor);
            case 1 ->
                simbolo = verificar(0, 1, valor);
            case 2 ->
                simbolo = verificar(0, 2, valor);
            case 3 ->
                simbolo = verificar(1, 0, valor);
            case 4 ->
                simbolo = verificar(1, 1, valor);
            case 5 ->
                simbolo = verificar(1, 2, valor);
            case 6 ->
                simbolo = verificar(2, 0, valor);
            case 7 ->
                simbolo = verificar(2, 1, valor);
            case 8 ->
                simbolo = verificar(2, 2, valor);
            default ->
                simbolo = valor;
        }

        return simbolo;

    }

    public String verificar(int fila, int col, String valor) {
        String simbolo;
        ocupado = false;
        if (tablero[fila][col].equals("")) {
            tablero[fila][col] = valor;
            simbolo = valor;
            turno = !turno;
        } else {
            simbolo = tablero[fila][col];
            ocupado = true;

        }
        return simbolo;

    }

    public boolean Gano(String marca) {
        boolean fila1 = tablero[0][0].equals(marca) && tablero[0][1].equals(marca) && tablero[0][2].equals(marca);
        boolean fila2 = tablero[1][0].equals(marca) && tablero[1][1].equals(marca) && tablero[1][2].equals(marca);
        boolean fila3 = tablero[2][0].equals(marca) && tablero[2][1].equals(marca) && tablero[2][2].equals(marca);
        boolean col1 = tablero[0][0].equals(marca) && tablero[1][0].equals(marca) && tablero[2][0].equals(marca);
        boolean col2 = tablero[0][1].equals(marca) && tablero[1][1].equals(marca) && tablero[2][1].equals(marca);
        boolean col3 = tablero[0][2].equals(marca) && tablero[1][2].equals(marca) && tablero[2][2].equals(marca);
        boolean dg1 = tablero[0][0].equals(marca) && tablero[1][1].equals(marca) && tablero[2][2].equals(marca);
        boolean dg2 = tablero[0][2].equals(marca) && tablero[1][1].equals(marca) && tablero[2][0].equals(marca);
        return fila1 || fila2 || fila3 || col1 || col2 || col3 || dg1 || dg2;

        //
    }

    public boolean Empato() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablero[i][j].equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
}
