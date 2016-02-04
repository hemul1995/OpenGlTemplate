/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opengltemplate;

import java.awt.Point;
import java.awt.event.KeyEvent;

/**
 *
 * @author Dima
 */
public class Camera
{
    protected Point mouse1;//, mouse2;
    protected double camXRot = 0.0;
    protected double camYRot = 0.0;
    protected double camXPos = 0;
    protected double camYPos = 0;
    protected double camZPos = 0;
    final double VECTOR = 5;
    public void setPoint(Point mouse1)
    {
        this.mouse1 = mouse1;
    }
    public void rotation(Point mouse2)
    { 
        final double VERT_MOUSE_SENSITIVITY = 10.0;
        final double HORIZ_MOUSE_SENSITIVITY = 10.0;

        double horizMovement = mouse2.x - this.mouse1.x;
        double vertMovement = mouse2.y - this.mouse1.y;

        camXRot += vertMovement / VERT_MOUSE_SENSITIVITY;
        camYRot += horizMovement / HORIZ_MOUSE_SENSITIVITY;

        if (camXRot < -90.0f)
        {
            camXRot = -90.0f;
        }

        if (camXRot > 90.0f)
        {
            camXRot = 90.0f;
        }

        if (camYRot < -180.0f)
        {
            camYRot += 360.0f;
        }

        if (camYRot > 180.0f)
        {
            camYRot -= 360.0f;
        }
        this.mouse1 = mouse2;
    }
    
    public void motion(int keyCode)
    {
        if (keyCode == KeyEvent.VK_W)
        {
            double z_end = VECTOR;
            camZPos += z_end * Math.cos(camYRot * Math.PI / 180) * Math.sin((camXRot + 90) * Math.PI / 180);
            camXPos += -z_end * Math.sin(camYRot * Math.PI / 180) * Math.sin((camXRot + 90) * Math.PI / 180);
            camYPos += -z_end * Math.cos((camXRot + 90) * Math.PI / 180);
            return;
        }

        if (keyCode == KeyEvent.VK_S)
        {
            double z_end = -VECTOR;
            camZPos += z_end * Math.cos(camYRot * Math.PI / 180) * Math.sin((camXRot + 90) * Math.PI / 180);
            camXPos += -z_end * Math.sin(camYRot * Math.PI / 180) * Math.sin((camXRot + 90) * Math.PI / 180);
            camYPos += -z_end * Math.cos((camXRot + 90) * Math.PI / 180);
            return;
        }

        if (keyCode == KeyEvent.VK_A)
        {
            double x_end = -VECTOR;
            camXPos += -x_end * Math.cos(camYRot * Math.PI / 180);
            camZPos += -x_end * Math.cos(camYRot * Math.PI / 180) * Math.tan(camYRot * Math.PI / 180);
            return;
        }

        if (keyCode == KeyEvent.VK_D)
        {
            double x_end = VECTOR;
            camXPos += -x_end * Math.cos(camYRot * Math.PI / 180);
            camZPos += -x_end * Math.cos(camYRot * Math.PI / 180) * Math.tan(camYRot * Math.PI / 180);
            return;
        }

    }
}
