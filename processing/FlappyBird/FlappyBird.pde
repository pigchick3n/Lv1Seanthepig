//import ddf.minim.*;
//Minim minim;  
//AudioSample sound;  
int birdX = 200;
int birdY = 400;
int rectX = 740;
float birdYVelocity = 0;
float gravity = .5;
int lowerY=0;
int upperY=500;
int upperPipeHeight = (int) random(100, 400);
int lowerPipeY = 800;
int lowerPipeHeight;
int upperPipeY = 0;
int pipeWidth = 60;
int pipeGap = 150;
int floorY = 800;
int score = 0;
void setup() {
  size(800, 800);
//minim = new Minim (this);
//sound = minim.loadSample("flap.wav", 32);
}

void draw() {
  background(#36FAFF);
  stroke(#FFF300);
  fill(#FFF300);
  ellipse(birdX, birdY, 50, 50);
  fill(#0AFF35);
  rect(rectX, upperPipeY, pipeWidth, upperPipeHeight);
  rect(rectX, lowerPipeY, pipeWidth, lowerPipeHeight);
  rect(0,floorY,800,1);
  lowerPipeY = upperPipeY + upperPipeHeight + pipeGap; 
  lowerPipeHeight = 800-lowerPipeY;
  birdYVelocity+=gravity;
  birdY+=birdYVelocity;
  rectX-=10;
  fill(0,0,0);
  text("Your Score is: " + score , 25, 25);
  check();
  teleportPipes();
}
void mousePressed() {

  birdYVelocity=-10;
}
void mouseReleased(){
   
 //sound.trigger(); 
}
void teleportPipes() {
  if (rectX<= -100) {
    rectX=900;
    upperPipeHeight = (int) random(100, 400);
    lowerPipeHeight = (int) random(100, 400);
    score++;
  }
}
boolean intersectsPipes() { 
  if (birdY < upperPipeHeight && birdX > rectX && birdX < (rectX+pipeWidth)) {
    return true;
  } else if (birdY>lowerPipeY && birdX > rectX && birdX < (rectX+pipeWidth)) {
    return true;
  } else { 
    return false;
  }
}
void check() {
  if (intersectsPipes()||floor()) {
    System.out.println("You're dead.");
    System.out.println("Your score is " + score);
      exit();
  }
}
boolean floor() { 
  if (birdY > floorY) {
    return true;
  } else { 
    return false;
  }
}