// circle


#include<GL/glut.h>
#include<GL/gl.h>
#include<cmath>


void myInit(void)
{
	glClearColor(1.0, 1.0, 1.0, 0.0);      // set the bg color to a bright white
	glColor3f(20.0f, 0.0f, 0.0f);           // set the drawing color to black 
}
void circle(void){

glClear(GL_COLOR_BUFFER_BIT);
 glBegin(GL_POINTS);
 for(int i=0;i<1000;++i)
  {
  glVertex3f(cos(2*3.14159*i/1000.0),sin(2*3.14159*i/1000.0),0);
  }
 glEnd();

glEnd();
glFlush();
}

int main(int argc,char** argv){
glutInit(&argc,argv);
glutInitDisplayMode(GLUT_SINGLE);
glutInitWindowSize(500,500);
glutCreateWindow("sumyak Circle");
myInit();
glutDisplayFunc(circle);
glutMainLoop();

return 0;
}
