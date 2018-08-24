import ddf.minim.*;
Minim minim;
AudioPlayer song;  
PImage pictureOfRecord;
int rotation = 0;
int raccel = 0;
int count = 0;
void setup(){
  size(600,600);
pictureOfRecord= loadImage("record2.jpeg");
pictureOfRecord.resize(height,width);
minim = new Minim(this);
song = minim.loadFile("harambe.wav", 512);
}
void draw(){
rotateImage(pictureOfRecord,rotation);
image(pictureOfRecord, 0, 0); 
rotation+=raccel;

}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
void mousePressed(){
  count++;
  if(count%2==1){
    raccel=10;
    song.play();
  }else if(count%2==0){
    raccel=0;
    song.pause();
  }
}