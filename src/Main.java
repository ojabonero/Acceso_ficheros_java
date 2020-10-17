import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean menu=true;
        File miDirectorio2;
        File miFichero2;

        File miDirectorio = new File("C:\\AD\\Ejercicios\\miDirectorio");


        File miFichero = new File("C:\\AD\\Ejercicios\\miFichero.txt");

        try {
            miDirectorio.mkdir();
            if(miFichero.createNewFile())
                System.out.println("Fichero creado correctamente...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        do{
            System.out.println("Introduzca una opción:\n 1. Crear nuevoDirectorio y fichero2\n 2. Eliminar miFichero \n" +
                    " 3. Eliminar nuevoDirectorio \n 4. Salir");

            Scanner sc = new Scanner(System.in);

            int opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    //Directorio
                    miDirectorio2 = new File("C:\\AD\\Ejercicios\\nuevoDirectorio");

                    //Fichero de texto
                    miFichero2 = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\miFichero2.txt");

                    try {
                        miDirectorio2.mkdir();
                        if(miFichero2.createNewFile())
                            System.out.println("Fichero creado correctamente...");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    miFichero.delete();
                    break;

                case 3:
                    miDirectorio2 = new File("C:\\AD\\Ejercicios\\nuevoDirectorio");
                    miFichero2 = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\miFichero2.txt");
                    miFichero2.delete();
                    miDirectorio2.delete();
                    break;

                case 4:
                    System.out.println("FIN DEL PROGRAMA");
                    menu=false;
                    break;

                default:
                    System.out.println("Opción incorrecta. Introduzca opción correcta");
            }
        }while(menu);
    }
}
