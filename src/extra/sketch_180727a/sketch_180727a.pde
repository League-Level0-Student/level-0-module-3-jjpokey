int x = 150;
  int y = 250;
  int xa = x + 200;
void setup() {
  background(255,255,255);
  size(500,500);
  
}

void draw() {
  
  int s = 80;
  background(255,255,255);
  noFill();
  for(int a = 0; a < 8; a++) {
    ellipse(x,y,s,s);
    s -= 10;
  }
  for(int b = 0; b < 9; b++) {
    ellipse(xa,y,s,s);
    s -= 10;
  }
  for(int d = 0; d < 10; d++) {
    x += .5;
    xa -= .5;
  }
}