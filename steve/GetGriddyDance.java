package steve;

import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

public class GetGriddyDance extends crearEscenaGrafica {

    public GetGriddyDance() {
        super(); // Llama al constructor de la clase padre para inicializar la escena
    }

    public void performDance() {
        // Realiza una secuencia de movimientos para el baile "Get Griddy"
        for (int i = 0; i < 4; i++) {
            // Movimiento 1: Brazos hacia arriba y piernas flexionadas
            girarTG(tgSpHomDer, -30, "X");
            girarTG(tgSpHomIzq, -30, "X");
            girarTG(tgSpMusDer, 30, "X");
            girarTG(tgSpMusIzq, 30, "X");
            girarTG(tgSpRodDer, -30, "X");
            girarTG(tgSpRodIzq, -30, "X");

            // Espera un momento para simular el ritmo del baile
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Movimiento 2: Brazos hacia abajo y piernas extendidas
            girarTG(tgSpHomDer, 30, "X");
            girarTG(tgSpHomIzq, 30, "X");
            girarTG(tgSpMusDer, -30, "X");
            girarTG(tgSpMusIzq, -30, "X");
            girarTG(tgSpRodDer, 30, "X");
            girarTG(tgSpRodIzq, 30, "X");

            // Espera un momento para simular el ritmo del baile
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Movimiento 3: Brazos hacia los lados y piernas cruzadas
            girarTG(tgSpHomDer, -30, "Z");
            girarTG(tgSpHomIzq, 30, "Z");
            girarTG(tgSpMusDer, 30, "Z");
            girarTG(tgSpMusIzq, -30, "Z");

            // Espera un momento para simular el ritmo del baile
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Movimiento 4: Brazos hacia los lados y piernas extendidas
            girarTG(tgSpHomDer, 30, "Z");
            girarTG(tgSpHomIzq, -30, "Z");
            girarTG(tgSpMusDer, -30, "Z");
            girarTG(tgSpMusIzq, 30, "Z");

            // Espera un momento para simular el ritmo del baile
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GetGriddyDance dance = new GetGriddyDance();
        dance.performDance();
    }
}