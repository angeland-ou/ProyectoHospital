import java.util.Scanner;

public class Paciente {
    private String catSintoma = "", catExploracion = "";
    private int nuss, temperaturaActual, nivelPrioridad, sintoma, exploracion;

    public Paciente(int nuss, String catSintoma, String catExploracion, int temperaturaActual, int nivelPrioridad, int sintoma, int exploracion){
        this.nuss = nuss;
        this.catSintoma = catSintoma;
        this.catExploracion = catExploracion;
        this.temperaturaActual = temperaturaActual;
        this.nivelPrioridad = nivelPrioridad;
        this.sintoma = sintoma;
        this.exploracion = exploracion;
    }

    public static int solicitudNuss(){
        int nuss;
        Scanner scn = new Scanner(System.in);
        System.out.println("¿NUSS?: ");
        Hospital.validacionInt();
        nuss = scn.nextInt();
        while ((nuss < Hospital.MIN_NUSS) || (nuss > Hospital.MAX_NUSS)) {  // compruebo que el dato cumple condiciones
            System.out.println("No has introducido un dato correcto, por favor vuelve a insertarlo: ");
            Hospital.validacionInt();
            nuss = scn.nextInt();
        }
        return nuss;
    }

    public static int solicitudSintoma(){
        System.out.println("\n¿Síntomas?:\n"
                + Hospital.CAT_0 + " (0)\n"
                + Hospital.CAT_1 + " (1)\n"
                + Hospital.CAT_2 + " (2)\n"
                + Hospital.CAT_3 + " (3)\n: ");
        Hospital.validacionInt();
        Scanner scn = new Scanner(System.in);
        int sintoma = scn.nextInt(); // Recojo codigo sintoma
        while ((sintoma < Hospital.MIN_SINTOMA) || (sintoma > Hospital.MAX_SINTOMA)) { // compruebo que el dato cumple condiciones
            System.out.print("No has introducido un dato correcto, por favor vuelve a insertarlo: ");
            Hospital.validacionInt();
            sintoma = scn.nextInt(); // Recojo codigo sintoma
        }
        return sintoma;
    }

    public static String asignacionCatSintoma(int sintoma){
        String catSintoma = "";
        switch (sintoma) {
            case 0:
                catSintoma = Hospital.CAT_0;
                System.out.println("\n¿Exploración?:\n"
                        + Hospital.CAT_00 + " (0)\n"
                        + Hospital.CAT_01 + " (1)\n"
                        + Hospital.CAT_02 + " (2)\n"
                        + Hospital.CAT_03 + " (3)\n: ");
                break;
            case 1:
                catSintoma =  Hospital.CAT_1;
                //catSintoma = getCatSintoma();
                System.out.println("\n¿Exporación?:\n"
                        + Hospital.CAT_10 + " (0)\n"
                        + Hospital.CAT_11 + " (1)\n"
                        + Hospital.CAT_12 + " (2)\n"
                        + Hospital.CAT_13 + " (3)\n: ");
                break;
            case 2:
                catSintoma =  Hospital.CAT_2;
                //setCatSintoma(Hospital.CAT_2);
                //catSintoma = getCatSintoma();
                System.out.println("\n¿Exploración?:\n"
                        + Hospital.CAT_20 + " (0)\n"
                        + Hospital.CAT_21 + " (1)\n"
                        + Hospital.CAT_22 + " (2)\n"
                        + Hospital.CAT_23 + " (3)\n: ");
                break;
            case 3:
                catSintoma =  Hospital.CAT_3;
                System.out.println("\n¿Exploración?:\n"
                        + Hospital.CAT_30 + " (0)\n"
                        + Hospital.CAT_31 + " (1)\n"
                        + Hospital.CAT_32 + " (2)\n"
                        + Hospital.CAT_33 + " (3)\n: ");
                break;
            default:
                System.out.println("El tipo de exploración no se encuentra.");
        }
        return catSintoma;
    }

    public static int solicitudExploracion(){
        Scanner scn = new Scanner(System.in);
        int exploracion = scn.nextInt(); // Recojo codigo exploracion
        while ((exploracion < Hospital.MIN_EXPLORACION) || (exploracion > Hospital.MAX_EXPLORACION)) { // compruebo que el dato cumple condiciones
            System.out.print("No has introducido un dato correcto, por favor vuelve a insertarlo: ");
            Hospital.validacionInt();
            exploracion = scn.nextInt(); // Recojo codigo exploracion
        }
        return exploracion;
    }

    public static String asignacionCatExploracion(int sintoma, int exploracion){
        String catExploracion= "";
        switch (sintoma) {
            case 0:
                switch (exploracion) {
                    case 0:
                        catExploracion = Hospital.CAT_00;
                        break;
                    case 1:
                        catExploracion = Hospital.CAT_01;
                        break;
                    case 2:
                        catExploracion = Hospital.CAT_02;
                        break;
                    case 3:
                        catExploracion = Hospital.CAT_03;
                        break;
                    default:
                        System.out.println("El tipo de exploración no se encuentra.");
                }
            case 1:
                switch (exploracion) {
                    case 0:
                        catExploracion = Hospital.CAT_10;
                        break;
                    case 1:
                        catExploracion = Hospital.CAT_11;
                        break;
                    case 2:
                        catExploracion = Hospital.CAT_12;
                        break;
                    case 3:
                        catExploracion = Hospital.CAT_13;
                        break;
                    default:
                        System.out.println("El tipo de exploración no se encuentra.");
                }
            case 2:
                switch (exploracion) {
                    case 0:
                        catExploracion = Hospital.CAT_20;
                        break;
                    case 1:
                        catExploracion = Hospital.CAT_21;
                        break;
                    case 2:
                        catExploracion = Hospital.CAT_22;
                        break;
                    case 3:
                        catExploracion = Hospital.CAT_23;
                        break;
                    default:
                        System.out.println("El tipo de exploración no se encuentra.");
                }
            case 3:
                switch (exploracion) {
                    case 0:
                        catExploracion = Hospital.CAT_30;
                        break;
                    case 1:
                        catExploracion = Hospital.CAT_31;
                        break;
                    case 2:
                        catExploracion = Hospital.CAT_32;
                        break;
                    case 3:
                        catExploracion = Hospital.CAT_33;
                        break;
                    default:
                        System.out.println("El tipo de exploración no se encuentra.");
                }
        }
        return catExploracion;
    }

    public static int solicitudTemperaturaActual(){


        return 0;
    }

    public String getCatSintoma() {
        return catSintoma;
    }

    public void setCatSintoma(String catSintoma) {
        this.catSintoma = catSintoma;
    }

    public String getCatExploracion() {
        return catExploracion;
    }

    public void setCatExploracion(String catExploracion) {
        this.catExploracion = catExploracion;
    }

    public int getNuss() {
        return nuss;
    }

    public void setNuss(int nuss) {
        this.nuss = nuss;
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getSintoma() {
        return sintoma;
    }

    public void setSintoma(int sintoma) {
        this.sintoma = sintoma;
    }

    public int getExploracion() {
        return exploracion;
    }

    public void setExploracion(int exploracion) {
        this.exploracion = exploracion;
    }
}
