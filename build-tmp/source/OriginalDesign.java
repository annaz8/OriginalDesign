import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{ 
	size(500, 300);

}

public void draw()
{
  background(51);
  head();
  body();
  leg();
  light();
}


public void head ()
{
	fill(0,0,0);
	noStroke();
	ellipse(265, 150, 40, 40);
	ellipse(310,150,30,30);
}

public void body ()
{
	fill(0,0,0);
	rect(230,180,10,20);
	rect(240, 170, 10,40);
	rect(250,160, 70,60);
	beginShape();
	vertex (220,170);
	vertex (230, 180);
	vertex (230, 200);
	vertex (220, 210);
	endShape();
}

public void leg() 
{
	rect(270, 220,30,10 );
	rect(280,220,10,80);
	beginShape();
	vertex (275, 220);
	vertex(285,220);
	vertex(250,300);
	vertex(240,300);
	endShape();
	beginShape();
	vertex(285,220);
	vertex(295, 220);
	vertex(330,300);
	vertex(320,300);
	endShape();
}

int q;
public void light() 
{
	fill(255,255,255,q);
	beginShape();
	vertex(170, 130);
	vertex(220,170);
	vertex(220, 210);
	vertex(170,250);
	endShape();
	if (mousePressed == true) {
		q = 255;
	} else {
		q = 0;
	}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
