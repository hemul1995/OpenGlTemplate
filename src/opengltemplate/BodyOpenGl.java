/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opengltemplate;

import com.jogamp.opengl.GL;//////////////////////////////////////dfgfdgfdgfdg///
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 *
 * @author Dima
 */
public class BodyOpenGl extends Camera
{
    FPSAnimator fpsAnimator;
    final int FPS = 60;    
    BodyOpenGl(GLJPanel gLJPanel)
    {
        fpsAnimator = new FPSAnimator(gLJPanel, FPS, true);
        fpsAnimator.start();
        gLJPanel.addGLEventListener(new GLEventListener()
        { 
            @Override
            public void reshape(GLAutoDrawable glautodrawable, int x, int y, int width, int height) 
            {
                setup(glautodrawable.getGL().getGL2(), width, height );
            }
            
            @Override
            public void init( GLAutoDrawable glautodrawable ) 
            {
                
            }
            
            @Override
            public void dispose( GLAutoDrawable glautodrawable ) 
            {
                
            }
            
            @Override
            public void display( GLAutoDrawable glautodrawable ) 
            {
                render(glautodrawable.getGL().getGL2(), glautodrawable.getSurfaceWidth(), glautodrawable.getSurfaceHeight());
            }
        });        
    }
    
    public void setup( GL2 gl2, int width, int height ) 
    {
        GLUT glut = new GLUT();
        GLU glu = new GLU();
        //glut.glutInit();
        //glut.glutInitDisplayMode(gl2.GL_DEPTH | gl2.GL_DOUBLE | gl2.GL_RGB);
        gl2.glEnable(GL2.GL_DITHER);
        gl2.glClearColor(192, 181, 0, 10);
        gl2.glViewport(0, 0, width, height);


        gl2.glMatrixMode(GL2.GL_PROJECTION);
        gl2.glLoadIdentity();

        glu.gluPerspective(45, (float)width / (float)height, 0.1, 500);
        gl2.glEnable(GL2.GL_DITHER);
        gl2.glMatrixMode(GL2.GL_MODELVIEW);
        gl2.glLoadIdentity();
        //float[] f = new float[4] { 0.5f, 0.5f, 0.5f, 0f };
        //Gl.glEnable(Gl.GL_FOG);
        //Gl.glFogfv(Gl.GL_FOG_COLOR, f);
        // Gl.glFogf(Gl.GL_FOG, 10.0f);
        gl2.glEnable(GL2.GL_DEPTH_TEST);
        gl2.glEnable(GL2.GL_LIGHTING);
        gl2.glEnable(GL2.GL_LIGHT0);
        gl2.glEnable(GL2.GL_COLOR_MATERIAL);

        //pictureBox1.Image = new Bitmap(Image.FromFile("X9qxn1viHXo.jpg"), pictureBox1.Size);
        //Gl.glMatrixMode(Gl.GL_PROJECTION);
        /*Gl.glLoadIdentity();
        Gl.glEnable(Gl.GL_COLOR_MATERIAL);
        Glu.gluPerspective(45, (float)AnT.Width / (float)AnT.Height, 0.1, 200);
        Gl.glMatrixMode(Gl.GL_MODELVIEW);
        Gl.glEnable(Gl.GL_TEXTURE_2D);
        Gl.glLoadIdentity(); */  
        //flag = true;
    }
    
    public void render( GL2 gl2, int width, int height )
    {
        //Timer timer=new Timer();
        //timer.schedule(new TimerTask() {
                
        gl2.glClear( GL.GL_COLOR_BUFFER_BIT );
        gl2.glMatrixMode(GL2.GL_PROJECTION);
        //Gl.glEnable(Gl.GL_DITHER);
        gl2.glMatrixMode(GL2.GL_MODELVIEW);
        //g_LightPosition = new float[4] { Convert.ToSingle(camXPos), Convert.ToSingle(camYPos), Convert.ToSingle(camZPos), 1 };
        //Gl.glClearColor(0.6f, 0.6f, 1.0f, 1.0f);
        gl2.glClearColor(0.7f * 1.2f, 0.999f * 1.2f, 0.568f * 1.2f, 1.0f);
        gl2.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl2.glEnable(GL2.GL_DEPTH_TEST);
        gl2.glEnable(GL2.GL_LIGHTING);
        gl2.glEnable(GL2.GL_LIGHT0);
        gl2.glEnable(GL2.GL_COLOR_MATERIAL);
        //Gl.glLightfv(Gl.GL_LIGHT0, Gl.GL_POSITION, g_LightPosition);
        // gl2.glColor3d(0, 0,0);//фон редактить здесь
        // draw a triangle filling the window
        //gl2.glLoadIdentity();
        GLUT g = new GLUT();
        gl2.glRotated(-90, 1, 0, 0);
        gl2.glRotated(90, 0, 0, 1);
       // DrawGround(gl2);
        //GLUT g = new GLUT();
        gl2.glRotated(-90, 0, 0, 1);
            gl2.glRotated(90, 1, 0, 0);
            gl2.glColor3d(0.31, 0.31, 0.31);
        gl2.glPushMatrix();
            gl2.glColor3d(1, 0, 0);
            //g.glutSolidTeapot(30);
            
            g.glutWireTeapot(30);
        gl2.glPopMatrix();
        gl2.glLoadIdentity();
        gl2.glRotated(camXRot, 1, 0, 0);
        gl2.glRotated(camYRot, 0, 1, 0);
        gl2.glTranslated( camXPos, camYPos,  camZPos);
        //gl2.glTranslated(0, -0.5, -2.5);
        gl2.glBegin(GL2.GL_QUADS);
            gl2.glVertex2d(0, 0);
            gl2.glVertex2d(0, 5);
            gl2.glVertex2d(5, 5);
            gl2.glVertex2d(5, 0);
        gl2.glEnd();
    }
}
