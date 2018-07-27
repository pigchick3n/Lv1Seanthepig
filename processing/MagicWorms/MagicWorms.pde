void setup(){
size(800, 800);
background(0,255,0);
}
int x=0;
int y=0;
int yspeed=10;
int xspeed=10;
void draw(){
  makeMagical();
   fill(random(255),random(255),random(255));
stroke(#08D6FC);
ellipse(getWormX(0) , getWormY(0) , 25, 25);
y+=yspeed;
x+=xspeed;
}
float frequency = .01;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}