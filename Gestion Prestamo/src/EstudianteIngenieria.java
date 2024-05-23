import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class EstudianteIngenieria extends Estudiante{

    private int numeroSemestre;
    private float promedioAcumulado;
    private String serial;
    



    public static void menuEstudiantesIngenieria() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("ESTUDIANTES DE INGENIERIA");
            System.out.println("1.1 Registrar préstamo de equipo");
            System.out.println("1.2 Modificar préstamo de equipo");
            System.out.println("1.3 Devolución de equipo");
            System.out.println("1.4 Buscar equipo");
            System.out.println("1.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    // registrarPrestamoIngenieria();
                    break;
                case 2:
                    // modificarPrestamoIngenieria();
                    break;
                case 3:
                    // devolucionEquipoIngenieria();
                    break;
                case 4:
                    // buscarEquipoIngenieria();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    public List<EstudianteIngenieria> solicitarInfoEstudiantes() {
        LinkedList<EstudianteIngenieria> estudianteingenieriaList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        

        EstudianteIngenieria objInfo = new EstudianteIngenieria( cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado, serial);

        

        System.out.print("Ingrese la Cédula del estudiante: ");
        objInfo.setCedula(sc.next());

        System.out.print("Ingrese el Nombre del estudiante: ");
        objInfo.setNombre(sc.next());

        System.out.print("Ingrese el Apellido del estudiante: ");
        objInfo.setApellido(sc.next());

        System.out.print("Ingrese el Teléfono del estudiante: ");
        objInfo.setTelefono(sc.next());

        System.out.print("Ingrese el Número de Semestre actualmente cursado: ");
        objInfo.setNumeroSemestre(sc.nextInt());

        System.out.print("Ingrese el Promedio Acumulado: ");
        objInfo.setPromedioAcumulado(sc.nextFloat());

        System.out.print("Ingrese el Serial del estudiante: ");
        objInfo.setSerial(sc.next());

        estudianteingenieriaList.add(objInfo);

        

        return estudianteingenieriaList;
    }

    public String MostrarInfoListEstudiante(List<EstudianteIngenieria> estudianteingenieriaList)
    {
        String cadena="";

        for (EstudianteIngenieria estudianteIngenieria : estudianteingenieriaList) {
            cadena = cadena + "\n" + estudianteIngenieria.getCedula() + "\n" + estudianteIngenieria.getNombre() 
            + "\n"  + estudianteIngenieria.getApellido() + "\n" + estudianteIngenieria.getTelefono() + "\n" + 
            estudianteIngenieria.getNumeroSemestre() + "\n"  + estudianteIngenieria.getPromedioAcumulado() + "\n" +
            estudianteIngenieria.getSerial() + "\n" + cadena;
        }

        return cadena;
    }






    //------------------------------------------------------------------------------------------------------
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado, String serial) {
        super(cedula, nombre, apellido, telefono);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
        this.serial = serial;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    
}
