import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by jnonino on 24/03/2016.
 */
public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testLlamarMetodoMainSinArgumentos() throws Exception {
        String[] arguments = new String[0];
        Main.main(arguments);
        String esperado = Main.MENSAJE_DE_ERROR_POR_FALTA_O_EXCESO_DE_ARGUMENTOS_AL_EJECUTAR;
        String obtenido = errContent.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testLlamarMetodoMainConUnArgumento() throws Exception {
        String[] arguments = new String[1];
        arguments[0] = "MI NOMBRE";
        Main.main(arguments);
        String esperado = Main.MENSAJE_DE_ERROR_POR_FALTA_O_EXCESO_DE_ARGUMENTOS_AL_EJECUTAR;
        String obtenido = errContent.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testLlamarMetodoMainConDosArgumentos() throws Exception {
        String[] arguments = new String[2];
        arguments[0] = "MI NOMBRE";
        arguments[1] = "OTRO NOMBRE";
        Main.main(arguments);
        String esperado = "Hola " + arguments[1] + ", soy " + arguments[0];
        String obtenido = outContent.toString();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testLlamarMetodoMainConTresArgumentos() throws Exception {
        String[] arguments = new String[3];
        arguments[0] = "MI NOMBRE";
        arguments[1] = "OTRO NOMBRE 1";
        arguments[1] = "OTRO NOMBRE 2";
        Main.main(arguments);
        String esperado = Main.MENSAJE_DE_ERROR_POR_FALTA_O_EXCESO_DE_ARGUMENTOS_AL_EJECUTAR;
        String obtenido = errContent.toString();
        assertEquals(esperado, obtenido);
    }
}