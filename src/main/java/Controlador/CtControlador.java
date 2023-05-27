package Controlador;

import Modelo.ClsModelo;
import Vista.FrmInterfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtControlador implements ActionListener {

    private FrmInterfaz vInterfaz;
    private ClsModelo vModelo;

    public CtControlador(FrmInterfaz vInterfaz, ClsModelo vModelo) {
        this.vInterfaz = vInterfaz;
        this.vModelo = vModelo;
    }

    public void inicioInterfaz() {

        vInterfaz.setTitle("Tres en Raya");
        vInterfaz.btn0.addActionListener(this);
        vInterfaz.btn1.addActionListener(this);
        vInterfaz.btn2.addActionListener(this);
        vInterfaz.btn3.addActionListener(this);
        vInterfaz.btn4.addActionListener(this);
        vInterfaz.btn5.addActionListener(this);
        vInterfaz.btn6.addActionListener(this);
        vInterfaz.btn7.addActionListener(this);
        vInterfaz.btn8.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (vModelo.getJuego() == 0) {
            evaluaBotones(boton);
        }
    }

    private void evaluaBotones(Object boton) {

        if (boton == vInterfaz.btn0) {
            vInterfaz.btn0.setText(vModelo.movimiento(0));
        } else if (boton == vInterfaz.btn1) {
            vInterfaz.btn1.setText(vModelo.movimiento(1));
        } else if (boton == vInterfaz.btn2) {
            vInterfaz.btn2.setText(vModelo.movimiento(2));
        } else if (boton == vInterfaz.btn3) {
            vInterfaz.btn3.setText(vModelo.movimiento(3));
        } else if (boton == vInterfaz.btn4) {
            vInterfaz.btn4.setText(vModelo.movimiento(4));
        } else if (boton == vInterfaz.btn5) {
            vInterfaz.btn5.setText(vModelo.movimiento(5));
        } else if (boton == vInterfaz.btn6) {
            vInterfaz.btn6.setText(vModelo.movimiento(6));
        } else if (boton == vInterfaz.btn7) {
            vInterfaz.btn7.setText(vModelo.movimiento(7));
        } else if (boton == vInterfaz.btn8) {
            vInterfaz.btn8.setText(vModelo.movimiento(8));

        }
        if (vModelo.getOcupado()) {
            JOptionPane.showMessageDialog(null, "Casillero Ocupado");
        }
        switch (vModelo.getJuego()) {

            case 1:
                mensaje("Gano el jugador X");
                break;
            case 2:
                mensaje("Gano el jugador O");
                break;
            case 3:
                mensaje("Es un empate");
                break;
        }
    }

    private void mensaje(String ms) {
        int op = JOptionPane.showOptionDialog(null, ms + "Que desea hacer", "Fin del juego", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Jugar otra vez", "Salir del progrma"},null);

        if (op != 11) {
            if (op == 0) {
                vModelo.iniaTablero();
                vInterfaz.btn0.setText("");
                vInterfaz.btn1.setText("");
                vInterfaz.btn2.setText("");
                vInterfaz.btn3.setText("");
                vInterfaz.btn4.setText("");
                vInterfaz.btn5.setText("");
                vInterfaz.btn6.setText("");
                vInterfaz.btn7.setText("");
                vInterfaz.btn8.setText("");

            }else {
                System.exit(0);
            }
        }
    }

}
