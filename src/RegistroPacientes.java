import java.util.ArrayList;

public class RegistroPacientes {
    private static ArrayList<Paciente> registroPacientes;

    public RegistroPacientes() {
        this.registroPacientes = new ArrayList<>();
    }

    public void anadirPaciente(Paciente paciente){
        this.registroPacientes.add(paciente);
        Paciente.imprimirPaciente(paciente);
        System.out.println("Se ha registrado el paciente.\n");
    }

    public void listarPacientes(){
        System.out.println("------LISTADO PACIENTES------");
        if (getRegistroPacientes().isEmpty()){
            System.out.println("El listado está vacío.");
        } else {
            for(int i =0; i<registroPacientes.size();i++){
                System.out.println("\n*** Paciente "+(i+1)+":");
                System.out.println("NUSS: "+registroPacientes.get(i).getNuss());
                System.out.println("Síntoma: "+registroPacientes.get(i).getSintoma()+" -> " +registroPacientes.get(i).getCatSintoma());
                System.out.println("Exploración: "+registroPacientes.get(i).getExploracion()+" -> " +registroPacientes.get(i).getCatExploracion());
                System.out.println("Temperatura: "+registroPacientes.get(i).getTemperaturaActual());
                System.out.println("Nivel de prioridad: "+registroPacientes.get(i).getNivelPrioridad());
            }
            System.out.println("----------------------------\n");
        }

    }

    public static ArrayList<Paciente> getRegistroPacientes() {
        return registroPacientes;
    }

    public static void setRegistroPacientes(ArrayList<Paciente> registroPacientes) {
        RegistroPacientes.registroPacientes = registroPacientes;
    }
}
