
void setup(){
  size(800,800);
}
int x=400;
int y=10;
int yspeed=10;
int score=0;

void draw(){
  background(#64FA03);
  fill(#08D6FC);
stroke(#08D6FC);
ellipse(x, y, 20, 20);
fill(#4B0074);
stroke(#4B0074);
rect(mouseX, 780, 100, 40);
y+=yspeed;
if(y==800){
  int randomNumber = (int) random(width);
  x=randomNumber;
y=0;
//
}
if(y==780){
checkCatch(x);
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }