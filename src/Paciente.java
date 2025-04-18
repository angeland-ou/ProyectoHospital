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

    public static int solicitudTemperaturaActual(){

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
