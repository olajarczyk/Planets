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

public class sketch_200327a extends PApplet {

public void setup()
{
  
  noStroke();
  background(0xffE3AF34);
  
  noLoop();
}

public void draw()
{
  for(int i=0; i<1000;i++)
  {
    fill(0xff024442);
    ellipse(random(0, 1000), random(0, 1000), 5, 5);
  }
  //kwiat1
  stroke(255);
  circleswielkie4(900,350);
  line(500, 600, 900, 350);
  circles_male(900, 350);
  circleswielkie4(500,100);
  line(500, 600, 500, 100);
  circleswielkie4(100,450);
  line(500, 600, 100, 450);
  circles_male(100, 450);
  circles_male(500, 100);
  circles(500, 600);
  circles1(650, 500);
  circles2(480, 380);
  circles1(570, 760);
  circles2(250, 720);
  circles1(300, 550);
  circles2(800, 650);
  circles_male(500, 600);
  circles_male(650, 500);
  circles_male(480, 380);
  circles_male(570, 760);
  circles_male(250, 720);
  circles_male(300, 550);
  circles_male(800, 650);
  stroke(255);
  line(500, 600, 650, 500);
  line(500, 600, 480, 380);
  line(500, 600, 570, 760);
  line(500, 600, 250, 720);
  line(500, 600, 300, 550);
  line(500, 600, 800, 650);
  circleswielkie(50,50);
  circleswielkie2(950,50);
  circleswielkie3(950,950);
  circleswielkie2(50,950);
  line(500, 600, 950, 50);
  line(500, 600, 50, 50);
  line(500, 600, 950, 950);
  line(500, 600, 50, 950);
  circles_male(950, 50);
  circles_male(50, 50);
  circles_male(950, 950);
  circles_male(50, 950);
  circleswielkie4(400,900);
  line(500, 600, 400, 900);
  circles_male(400, 900);
  
  
}

public void circles(int x, int y)
{
  fill(0xff024442);
  ellipse(x,y, 200,200);
}
public void circles1(int x, int y)
{
  fill(0xff9a9a9a);
  ellipse(x,y, 100,100);
}
public void circles2(int x, int y)
{
  fill(0xff4e4e4e);
  ellipse(x,y, 100,100);
}

public void circles_male(int x, int y)
{
  fill(0xffffffff);
  ellipse(x,y, 10,10);
}

public void circleswielkie(int x, int y)
{
  fill(0xff024442);
  ellipse(x,y, 300,300);
}

public void circleswielkie2(int x, int y)
{
  fill(0xff4e4e4e);
  ellipse(x,y, 200,200);
}

public void circleswielkie3(int x, int y)
{
  fill(0xff9a9a9a);
  ellipse(x,y, 200,200);
}

public void circleswielkie4(int x, int y)
{
  fill(0xffa00028);
  ellipse(x,y, 150,150);
}
  public void settings() {  size(1000,1000);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "sketch_200327a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
