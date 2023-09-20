import java.util.Scanner;

public class controller {
    public controller controller(){
        System.out.println("menu\n1.Hola\n2.Adios\n3.Cerrar");
        Integer opcion=null;
        Scanner opcionIN=new Scanner(System.in);
        try {
            opcion=opcionIN.nextInt();
        }catch (Exception err){

            return controller();
        }

        switch (opcion){
            case 1:
                System.out.println("hola");
                return controller();
            case 2:
                System.out.println("Adios");
                return controller();
            case 3:
                System.exit(0);
            default:
                System.out.println("invalido");
                return controller();
        }

    }
}
