void setup(){
size(800,800);
}
int speed = 20;
int frogx = 400;
int frogy = 775;
Car car1 = new Car(450,400,100,10);
Car car2 = new Car(450,300,100,20);
Car car3 = new Car(450,600,100,35);
Car car4 = new Car(450,750,100,50);
void draw(){
  background(#FCF000);
  fill(#007405);
ellipse(frogx, frogy, 50, 50);
electricfence();
car1.display();
car2.display();
car3.display();
car4.display();
car2.moveleft();
car1.moveright();
car3.moveleft();
car4.moveleft();
if (intersects(car1)||intersects(car2)||intersects(car3)||intersects(car4)){
  frogx=400;
  frogy=775;
}
if(frogy<=0){
 text("The frog is alive!!! Yay!",25,25);
}
}

void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                 frogy-=speed;
            }
            else if(keyCode == DOWN)
            {
                  frogy+=speed;
            }
            else if(keyCode == RIGHT)
            {
                  frogx+=speed;
            }
            else if(keyCode == LEFT)
            {
                  frogx-=speed;
            }
      }
     
}
void electricfence(){
 if(frogy <= -50){
 frogy=25;
 } else if(frogy >= 775){
 frogy=775;
 } else if(frogx <= 25){
 frogx=25;
} else if(frogx >= 775){
 frogx=775;
 
}
}
class Car{
  int carx;
  int cary;
  int carsize;
  int carspeed;  

Car(int carx, int cary, int carsize, int carspeed){
this.carx=carx;
this.cary=cary;
this.carsize=carsize;
this.carspeed=carspeed;
}
  void display() {
      fill(0,255,0);
      rect(carx , cary, carsize, 50);
}
void moveleft(){
  carx-=carspeed;
  if (carx<=-100){
  carx=800;
  }
}
  void moveright(){
  carx+=carspeed;
  if (carx>=900){
  carx=0;
  }
  }
  int getX(){
  return carx;
}
  int getY(){
  return cary;
  }
  int getSize(){
  return carsize;

  

  
  
}
}
boolean intersects(Car car) {
      if ((frogy > car.getY() && frogy < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize()))
      {
        System.out.println("SMUUUSH!");
        
        return true;
             
      }
      else 
      {
             return false;
      }

}