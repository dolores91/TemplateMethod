package menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test

    public void deberiaMostrarmeUnMenuyPrecio(){

        //GIVEN

        Menu menu1 = new Vegetariano(500, 3, 2);

          // CUANDO
        String resultadoObtenido = menu1.prepararMenu();

        String resultadoEsperado = "El menu consiste de: Un menu vegetariano con 3 especias y 2 salsas y el precio es: $519.0";

        //ENTONCES

        assertEquals(resultadoEsperado, resultadoObtenido);

    }


    @Test

    public void deberiaCalcularElPrecio(){

        //GIVEN

        Menu menu2 = new Vegetariano(500, 3, 2);
// Menu menu3 = new Menu(500);     no se puede instanciar una clase abstracta

        // CUANDO
        double resultadoObtenido = menu2.calcularPrecio();

        double resultadoEsperado = 519.0;

        //ENTONCES

        assertEquals(resultadoEsperado, resultadoObtenido);

    }

}