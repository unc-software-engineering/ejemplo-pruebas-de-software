/**
 * Created by jnonino on 24/03/2016.
 */
public class Main {

    public static final String MENSAJE_DE_ERROR_POR_FALTA_O_EXCESO_DE_ARGUMENTOS_AL_EJECUTAR = "Proveer dos parametros. Ejemplo: java -jar proyecto.jar <miNombre> <nombreDeOtraPersona>";

    public static void main(String [] args){

        if (args.length == 2) {
            String miNombre = args[0];
            String nombreDeOtraPersona = args[1];
            String saludo = armarSaludo(miNombre, nombreDeOtraPersona);
            System.out.print(saludo);
        } else {
            System.err.print(MENSAJE_DE_ERROR_POR_FALTA_O_EXCESO_DE_ARGUMENTOS_AL_EJECUTAR);
        }
    }

    private static String armarSaludo(String miNombre, String nombreDeOtraPersona) {
        return "Hola " + nombreDeOtraPersona + ", soy " + miNombre;
    }
}
