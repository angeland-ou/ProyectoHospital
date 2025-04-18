import java.util.ArrayList;

public class RegistroPacientes {
    private ArrayList<Paciente> registroPacientes;

    public RegistroPacientes(Paciente paciente) {
        registroPacientes.add(paciente);
    }

    public void listarPacientes(){
        System.out.println("------LISTADO PACIENTES------");
        for(int i =0; i<registroPacientes.size();i++){
            System.out.println("Paciente "+i+":");
            System.out.println(registroPacientes.get(i).getNuss());
            System.out.println(registroPacientes.get(i).getSintoma());
            System.out.print(" -> " +registroPacientes.get(i).getCatSintoma());
            System.out.println(registroPacientes.get(i).getExploracion());
            System.out.print(" -> " +registroPacientes.get(i).getCatExploracion());
            System.out.println(registroPacientes.get(i).getTemperaturaActual());
            System.out.println(registroPacientes.get(i).getNivelPrioridad());
            System.out.println(" ");
        }
        System.out.println("----------------------------");
    }
}
