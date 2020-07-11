void setup()
{
  size(1000,1000);
  noStroke();
  background(#E3AF34);
  smooth();
  noLoop();
}

void draw()
{
  for(int i=0; i<1000;i++)
  {
    fill(#024442);
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

void circles(int x, int y)
{
  fill(#024442);
  ellipse(x,y, 200,200);
}
void circles1(int x, int y)
{
  fill(#9a9a9a);
  ellipse(x,y, 100,100);
}
void circles2(int x, int y)
{
  fill(#4e4e4e);
  ellipse(x,y, 100,100);
}

void circles_male(int x, int y)
{
  fill(#ffffff);
  ellipse(x,y, 10,10);
}

void circleswielkie(int x, int y)
{
  fill(#024442);
  ellipse(x,y, 300,300);
}

void circleswielkie2(int x, int y)
{
  fill(#4e4e4e);
  ellipse(x,y, 200,200);
}

void circleswielkie3(int x, int y)
{
  fill(#9a9a9a);
  ellipse(x,y, 200,200);
}

void circleswielkie4(int x, int y)
{
  fill(#a00028);
  ellipse(x,y, 150,150);
}
