import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ComputadorPortatil {
    private String serial;
    private String marca;
    private float tamano;
    private float precio;
    private String sistemaOperativo;
    private String procesador;

    public List<ComputadorPortatil> solicitarInfoComputador() {
        LinkedList<ComputadorPortatil> ComputadorList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        

        ComputadorPortatil objInfo = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador);

        

        System.out.print("Ingrese el serial del computador ");
        objInfo.setSerial(sc.next());

        System.out.print("Ingrese la marca del computador portátil: ");
        objInfo.setMarca(sc.next());

        System.out.print("Ingrese el tamaño (pulgadas): ");
        objInfo.setTamano(sc.nextFloat());
       
        System.out.print("Ingrese el precio ");
        objInfo.setPrecio(sc.nextFloat());

        System.out.print("Ingrese el Sistema Operativo: ");
        objInfo.MenuSistemaOp();
        objInfo.setSistemaOperativo(sc.next());

        System.out.print("Ingrese el procesador: ");
        objInfo.setProcesador(sc.next());


        ComputadorList.add(objInfo);

        

        return ComputadorList;
    }

    public String MenuSistemaOp()
    {
        ComputadorPortatil objInfo = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador);
        Scanner sc = new Scanner(System.in);
        int opcion;
        String Mensaje;

        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                
                objInfo.setSistemaOperativo("Windows 7");
                break;
            case 2:
                objInfo.setSistemaOperativo("Windows 10");
                break;
            case 3:
                objInfo.setSistemaOperativo("Windows 11");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
        Mensaje="Información Guardada Exitosamente";
        return Mensaje;
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




//-------------------------------------------------------------------------------------------------------
    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
}
