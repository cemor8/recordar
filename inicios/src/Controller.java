import com.sun.source.tree.BreakTree;

import java.util.*;

public class Controller {
        private ArrayList<Integer> lista=new ArrayList<Integer>(List.of(1,2,3,4,15));
        public String controller(){
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
                    fizz("abc","cde");
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
        public void fizz(String palabra1, String palabra2){
            HashMap<String,Integer> clasificado1=this.clasifica_palabra(palabra1);
            HashMap<String,Integer> clasificado2=this.clasifica_palabra(palabra2);
            System.out.println(clasificado1);
            System.out.println(clasificado2);

            for (Map.Entry<String,Integer> letra: clasificado1.entrySet()) {
                if(clasificado1.containsKey(letra.getKey())){
                    if(letra.getV)
                }
            }

        }
        public HashMap<String,Integer>clasifica_palabra(String palabra) {
            HashMap<String, Integer> clasificado = new HashMap<>();
            for (int i = 0, n = palabra.length(); i < n; i++) {
                char c = palabra.charAt(i);
                String letra = String.valueOf(c);
                if (!clasificado.containsKey(letra)) {

                    clasificado.put(letra, 0);
                }
                clasificado.put(letra, clasificado.get(letra) + 1);
            }
            return clasificado;
        }
    }

