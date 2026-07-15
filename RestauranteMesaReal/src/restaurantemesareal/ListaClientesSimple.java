/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantemesareal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*

    private String nombre;
    private int CantidadPersonas;
    private Mesa MesaAsignada;
    private String estado;
    private String horaIngreso;
 
 */
public class ListaClientesSimple {

    public static void insertar() {

        Cliente c = new Cliente();

        // 1. Solicitar el nombre del cliente
        c.setNombre(JOptionPane.showInputDialog("Ingrese nombre del cliente a registrar"));

        // Se definen las opciones de hora y minutos
        String[] horas = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        String[] minutos = {"00", "30"};
        String[] estado = {"Esperando", "Atendido", "Pagado"};

        // joption pane para el cuadro de dialogo de hora
        String horaSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Seleccione la hora deseada:",
                "Selección de Hora",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("src/restaurantemesareal/Imagenes/resize.png"),
                horas,
                horas[0]);

        // valida que el usuario no haya presionado "Cancelar" o cerrado la ventana
        if (horaSeleccionada != null) {

            // joption pane para el cuadro de dialogo de minutos
            String minutoSeleccionado = (String) JOptionPane.showInputDialog(null,
                    "Seleccione los minutos:",
                    "Selección de Minutos",
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("src/restaurantemesareal/Imagenes/resize.png"),
                    minutos,
                    minutos[0]);

            // validar nuevamente que no haya cancelado
            if (minutoSeleccionado != null) {

                //concatenar ambas cadenas (agregando los dos puntos en el medio)
                String horaCompleta = horaSeleccionada + ":" + minutoSeleccionado;

                c.setHoraIngreso(horaCompleta);

                int CantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas "));

                if (CantidadPersonas == 0) {
                    JOptionPane.showMessageDialog(null, "La mesa no puede quedar vacia", "Error", JOptionPane.ERROR_MESSAGE);

                }
                c.setCantidadPersonas(CantidadPersonas);

                JOptionPane.showMessageDialog(null, "Reserva registrada para las: " + horaCompleta);
                System.out.println(c.getHoraIngreso());
            }
        }
    }

}
