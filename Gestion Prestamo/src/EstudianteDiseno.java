import java.util.Scanner;
public class EstudianteDiseno extends Estudiante {
    private String modalidadEstudio;
    private int cantidadAsignaturas;
    private String serial;


    public static void menuEstudiantesDiseno() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("ESTUDIANTES DE DISEÑO");
            System.out.println("2.1 Registrar préstamo de equipo");
            System.out.println("2.2 Modificar préstamo de equipo");
            System.out.println("2.3 Devolución de equipo");
            System.out.println("2.4 Buscar equipo");
            System.out.println("2.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //registrarPrestamoDiseno();
                    break;
                case 2:
                    //modificarPrestamoDiseno();
                    break;
                case 3:
                    //devolucionEquipoDiseno();
                    break;
                case 4:
                    //buscarEquipoDiseno();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }





    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas, String serial) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serial = serial;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(String modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    
}
