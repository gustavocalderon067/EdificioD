/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
import javax.media.j3d.BranchGroup;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.Transform3D;
import javax.vecmath.Vector3f;

public class Posicionador {

    // Método para posicionar una figura en el universo
    public static TransformGroup posicionarFigura(BranchGroup figura, float x, float y, float z) {
        Transform3D transform = new Transform3D();
        transform.setTranslation(new Vector3f(x, y, z));

        TransformGroup tg = new TransformGroup(transform);
        tg.addChild(figura);

        return tg;
    }
}