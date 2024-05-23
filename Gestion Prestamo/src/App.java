import java.util.Scanner;
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        
     
        int option;

        System.out.println("---------------------------------------------");
        System.out.println("Sistema de Gestión de Préstamo");
        System.out.println("---------------------------------------------");

         

        do {
            System.out.println("MENÚ");
            System.out.println("1. ESTUDIANTES DE INGENIERIA");
            System.out.println("2. ESTUDIANTES DE DISEÑO");
            System.out.println("3. IMPRIMIR INVENTARIO TOTAL");
            System.out.println("4. SALIR DEL PROGRAMA");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    EstudianteIngenieria estudianteIngenieria = new EstudianteIngenieria(null, null, null, null, 0, 0, null);
                    estudianteIngenieria.menuEstudiantesIngenieria();

                    break;
                case 2:
                    EstudianteDiseno estudianteDiseno = new EstudianteDiseno("654321", "Maria", "Gomez", "5554321", "Presencial", 6, "E5F6G7H8");
                    estudianteDiseno.menuEstudiantesDiseno();

                    break;
                case 3:
                    //imprimirInventarioTotal();

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");

                    break;
                default:
                
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 4);

    }


}
