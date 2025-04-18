import java.util.ArrayList;
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

        Scanner scn = new Scanner(System.in);
        String catSintoma = "", catExploracion = "";
        int nuss, temperaturaActual, nivelPrioridad, sintoma, exploracion;
        ArrayList<Paciente> listaEspera = new ArrayList<Paciente>();

        // SOLICITUD NUMERO NUSS
        nuss = Paciente.solicitudNuss();

        // SOLICITUD SINTOMA
        sintoma = Paciente.solicitudSintoma();
        catSintoma = (Paciente.asignacionCatSintoma(sintoma));

        // SOLICITUD EXPLORACION SEGÚN SINTOMA RECOGIDO
        exploracion = Paciente.solicitudExploracion();


        // ASIGNACIÓN DE VALOR DE CATEGORÍA DE EXPLORACIÓN
        switch (sintoma) {
            case 0:
                switch (exploracion) {
                    case 0 -> catExploracion = CAT_00;
                    case 1 -> catExploracion = CAT_01;
                    case 2 -> catExploracion = CAT_02;
                    case 3 -> catExploracion = CAT_03;
                    default -> System.out.println("El tipo de exploración no se encuentra.");
                }
            case 1:
                switch (exploracion) {
                    case 0 -> catExploracion = CAT_10;
                    case 1 -> catExploracion = CAT_11;
                    case 2 -> catExploracion = CAT_12;
                    case 3 -> catExploracion = CAT_13;
                    default -> System.out.println("El tipo de exploración no se encuentra.");
                }
            case 2:
                switch (exploracion) {
                    case 0 -> catExploracion = CAT_20;
                    case 1 -> catExploracion = CAT_21;
                    case 2 -> catExploracion = CAT_22;
                    case 3 -> catExploracion = CAT_23;
                    default -> System.out.println("El tipo de exploración no se encuentra.");
                }
            case 3:
                switch (exploracion) {
                    case 0 -> catExploracion = CAT_30;
                    case 1 -> catExploracion = CAT_31;
                    case 2 -> catExploracion = CAT_32;
                    case 3 -> catExploracion = CAT_33;
                    default -> System.out.println("El tipo de exploración no se encuentra.");
                }
        }

        // SOLICITUD DE NIVEL DE PRIORIDAD
        System.out.print("\n¿Nivel de prioridad?: ");
        validacionInt();
        nivelPrioridad = scn.nextInt(); // Recojo codigo nivelPrioridad
        while ((nivelPrioridad < MIN_PRIORIDAD) || (nivelPrioridad > MAX_PRIORIDAD)) { // compruebo que el dato cumple condiciones
            System.out.println("No has introducido un dato correcto, por favor vuelve a insertarlo: ");
            validacionInt();
            nivelPrioridad = scn.nextInt(); // Recojo codigo nivelPrioridad
        }

        // SOLICITUD DE TEMPERATURA ACTUAL
        System.out.print("\n¿Temperatura actual?: ");
        validacionInt();
        temperaturaActual = scn.nextInt(); // 27 - 45 Recojo codigo temperaturaActual
        while ((temperaturaActual < MIN_TEMPERATURA) || (temperaturaActual > MAX_TEMPERATURA)) { // compruebo que el dato cumple condiciones
            System.out.print("No has introducido un dato correcto, por favor vuelve a insertarlo: ");
            validacionInt();
            temperaturaActual = scn.nextInt(); // 27 - 45 Recojo codigo temperaturaActual
        }

        // Añadimos paciente al arraylist de listaEspera
        Paciente nuevoPaciente = new Paciente(nuss, catSintoma, catExploracion, temperaturaActual, nivelPrioridad, sintoma, exploracion);
        listaEspera.add(nuevoPaciente);

        // Imprimimos arraylist con los pacientes
        for (int i=0;i<listaEspera.size();i++) {
            System.out.println(listaEspera.get(i));
        }

        // IMPRESIÓN POR PANTALLA DE LOS DATOS
//        System.out.printf("\nNUSS: %d\nSíntoma: %s\t/\tExploración: %s\t/\tTemperatura actual: %d\nNivel de prioridad: %d\n", nuss, catSintoma, catExploracion, temperaturaActual, nivelPrioridad);
//        scn.close();
    }
    public static void validacionInt(){
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()){  // Me aseguro de que el usuario introduzca el tipo de dato correcto
            System.out.println("No es un dato válido");
            scn.next(); // Descartar entrada incorrecta
        }
    }

}
