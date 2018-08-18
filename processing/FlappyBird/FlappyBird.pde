int birdX = 200;
int birdY = 400;
int rectX = 740;
float birdYVelocity = 0;
float gravity = .5;
int lowerY=0;
int upperY=500;
int upperPipeHeight = (int) random(100, 400);
int lowerPipeHeight = (int) random(100, 400);
int lowerPipeY;
int upperPipeY = 0;
int pipeWidth = 60;
void setup(){
 size(800,800); 

}

void draw(){
 background(#36FAFF);
 stroke(#FFF300);
 fill(#FFF300);
ellipse(birdX, birdY, 50, 50);
fill(#0AFF35);
rect(rectX, upperPipeY, pipeWidth, upperPipeHeight);
rect(rectX, lowerPipeY,pipeWidth, lowerPipeHeight);
birdYVelocity+=gravity;
birdY+=birdYVelocity;
rectX-=10;
check();
teleportPipes();
}
void mousePressed(){
 
  birdYVelocity=-10; 
}
void teleportPipes(){
 if(rectX<= -100){
 rectX=900;
 upperPipeHeight = (int) random(100, 400);
 lowerPipeHeight = (int) random(100, 400);
 }
}
boolean intersectsPipes() { 
     if (birdY < upperPipeHeight && birdX > rectX && birdX < (rectX+pipeWidth)){
          return true; }
     else if (birdY>lowerPipeY && birdX > rectX && birdX < (rectX+pipeWidth)) {
          return true; }
     else { return false; }
}
void check(){
 if(intersectsPipes()==true){
   System.out.println("Youre dead.");
 }
}