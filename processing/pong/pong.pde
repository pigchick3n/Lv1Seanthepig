import ddf.minim.*;  
Minim minim;
AudioSample sound;

void setup(){
size(800,800);

}
int x=1;
int y=400;
int xspeed = 5;
int yspeed = 5;
int width = 800;
void draw(){
  background(#1B7FAF);
fill(#0BFF00);
stroke(#FF7740);
ellipse(x,y,20,20);
x+=xspeed;
y+=yspeed;
if(x >=800){
xspeed = -xspeed;
}
if(x <=1){
xspeed = -xspeed;
}
if(y >=800){
yspeed = -yspeed;
}
if(y <=1){
yspeed = -yspeed;
}
}