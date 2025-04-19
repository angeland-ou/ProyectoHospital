import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hospital {

    // VALORES MIN-MAX
    final static int MIN_NUSS = 100000, MAX_NUSS = 999999, MIN_SINTOMA = 0, MAX_SINTOMA = 3, MIN_EXPLORACION = 0, MAX_EXPLORACION = 3, MIN_PRIORIDAD = 0, MAX_PRIORIDAD = 5, MIN_TEMPERATURA = 27, MAX_TEMPERATURA = 45;
    // VALORES SINTOMAS
    final static String CAT_0 = "Dolor", CAT_1 = "Lesión traumática", CAT_2 = "Fiebre alta", CAT_3 = "Confusión o desorientación";
    // VALORES EXPLORACION
    // Con sintoma 0 - Dolor
    final static String CAT_00 = "Dolor Torácico", CAT_01 = "Dolor Abdominal", CAT_02 = "Dolor de cabeza", CAT_03 = "Migraña";
    // Con sintoma 1 - Lesión traumática
    final static String CAT_10 = "Fractura ósea", CAT_11 = "Herida de bala", CAT_12 = "Quemadura", CAT_13 = "Lesión cerebral traumática";
    // Con sintoma 2 - Fiebre Alta
    final static String CAT_20 = "Neumonía", CAT_21 = "Meningitis", CAT_22 = "Infección viral", CAT_23 = "Reacción alérgica";
    // Con sintoma 3 - Confusión o desorientación
    final static String CAT_30 = "Intoxicación por drogas o alcohol", CAT_31 = "Deshidratación severa", CAT_32 = "Accidente cerebrovascular", CAT_33 = "Hipoglucemia severa";

    public static void main(String[] args) {

        try {
            // Creamos registro de pacientes
            RegistroPacientes registroPacientes1 = new RegistroPacientes();
            boolean salir = false;
            do {
                //Mostramos menu de opciones
                mostrarMenu();
                int opcion = Paciente.solicitarYValidarInt();
                switch (opcion){
                    case 1:
                        Paciente nuevoPaciente = Paciente.nuevoPaciente();
//                        // Imprimimos por pantalla paciente a insertar
//                        Paciente.imprimirPaciente(nuevoPaciente);
                        // Añadimos paciente al registro que hemos creado
                        registroPacientes1.anadirPaciente(nuevoPaciente);
                        break;
                    case 2:
                        // Listamos todos los pacientes que hay en el registro
                        registroPacientes1.listarPacientes();
                        break;
                    case 3:
                        break;
                    case 4:
                        // Salimos del programa
                        salir = true;
                        break;
                    default:
                        System.out.println("Debes elegir una opción de las disponibles.");
                }
            } while (!salir);

        } catch (NumberFormatException nfe){
            throw new NumberFormatException(nfe.getMessage());
        } catch (NullPointerException npe){
            throw new NullPointerException(npe.getMessage());
        } catch (InputMismatchException ime) {
            throw new InputMismatchException(ime.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    // Metodo para mostrar el menu contextual para elegir opciones de registro
    public static void mostrarMenu(){
        System.out.println("------MENU OPCIONES------");
        System.out.println("1. Introducir paciente");
        System.out.println("2. Mostrar registro de pacientes");
        System.out.println("3. Borrar paciente del registro (en construcción)");
        System.out.println("4. Salir del programa");
    }
}
