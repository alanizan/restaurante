package restaurantemesareal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Restaurante {
    
    ListaClientesSimple lc = new ListaClientesSimple();

    public void menu() {
        
        boolean continuar = true;

        do {
            String obj[] = {
                "Registrar Mesa",
                "Registrar Cliente",
                "Asignar mesa",
                "Crear Pedido",
                "Enviar pedido a cocina",
                "Atender pedido",
                "Cancelar plato",
                "Crear reservacion",
                "Ver árbol de mesas",
                "Cobrar cuenta",
                "Ver historial de clientes",
                "Salir"
            };

            String op = (String) JOptionPane.showInputDialog(null, "Seleccione la opción deseada: ",
                    "Menu Principal", JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("src/restaurantemesareal/Imagenes/resize.png"), obj, obj[0]);

            if (op == null) {
                menu();
            }
            switch (op) {
                case "Registrar Mesa":
                    // Lógica para registrar mesa
                    break;
                case "Registrar Cliente":
                    // Lógica para registrar cliente
                    ListaClientesSimple
                    
                    break;
                case "Asignar mesa":
                    // Lógica para asignar mesa
                    break;
                case "Crear Pedido":
                    // Lógica para crear pedido
                    break;
                case "Enviar pedido a cocina":
                    // Lógica para enviar pedido a cocina
                    break;
                case "Atender pedido":
                    // Lógica para atender pedido
                    break;
                case "Cancelar plato":
                    // Lógica para cancelar plato
                    break;
                case "Crear reservacion":
                    // Lógica para crear reservación
                    break;
                case "Ver árbol de mesas":
                    // Lógica para ver árbol de mesas
                    break;
                case "Cobrar cuenta":
                    // Lógica para cobrar cuenta
                    break;
                case "Ver historial de clientes":
                    // Lógica para ver historial de clientes
                    break;
                case "Salir":
                    System.exit(0);
            }
        } while (continuar);
    }

}
