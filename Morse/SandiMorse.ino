int led = 2; // Input LED dengan port 2
//char input; // Buat masukin input nama
void setup () {
  pinMode (led, OUTPUT); // output pake led
  Serial.begin(9600);
}

void loop () {
  if (Serial.available()) {
    //Baca input yg diterima input faris
    lF(); lA(); lR(); 1I(); lS();
    //input = Serial.read();
    //if (input == 'a' || input == 'A') {lA();}
    //if (input == 'b' || input == 'B') {lB();}
    //if (input == 'c' || input == 'C') {lC();}
    //if (input == 'd' || input == 'D') {lD();}
    //if (input == 'e' || input == 'E') {lE();}
    //if (input == 'f' || input == 'F') {lF();}
    //if (input == 'g' || input == 'G') {lG();}
    //if (input == 'h' || input == 'H') {lH();}
    //if (input == 'i' || input == 'I') {lI();}
    //if (input == 'j' || input == 'J') {lJ();}
    //if (input == 'k' || input == 'K') {lK();}
    //if (input == 'l' || input == 'L') {lL();}
    //if (input == 'm' || input == 'M') {lM();}
    //if (input == 'n' || input == 'N') {lN();}
    //if (input == 'o' || input == 'O') {lO();}
    //if (input == 'p' || input == 'P') {lP();}
    //if (input == 'q' || input == 'Q') {lQ();}
    //if (input == 'r' || input == 'R') {lR();}
    //if (input == 's' || input == 'S') {lS();}
    //if (input == 't' || input == 'T') {lT();}
    //if (input == 'u' || input == 'U') {lU();}
    //if (input == 'v' || input == 'V') {lV();}
    //if (input == 'w' || input == 'W') {lW();}
    //if (input == 'x' || input == 'X') {lX();}
    //if (input == 'y' || input == 'Y') {lY();}
    //if (input == 'z' || input == 'Z') {lZ();}

    Serial.println (input);//Print hasil input
  }
}

//Fungsi dari setiap huruf membuat Sandi morse tiap huruf
void lA () {dot();dash();shortspace();}
void lB () {dash();dot();dot();dot();shortspace();}
void lC () {dash();dot();dash();dot();shortspace();}
void lD () {dash();dot();dot();shortspace();}
void lE () {dot();shortspace();}
void lF () {dot();dot();dash();dot();shortspace();}
void lG () {dash();dash();dot();shortspace();}
void lH () {dot();dot();dot();dot();shortspace();}
void lI () {dot();dot();shortspace();}
void lJ () {dot();dash();dash();dash();shortspace();}
void lK () {dash();dot();dash();shortspace();}
void lL () {dot();dash();dot();dot();shortspace();}
void lM () {dash();dash();shortspace();}
void lN () {dash();dot();shortspace();}
void lO () {dash();dash();dash();shortspace();}
void lP () {dot();dash();dash();dot();shortspace();}
void lQ () {dash();dash();dot();dash();shortspace();}
void lR () {dot();dash();dot();shortspace();}
void lS () {dot();dot();dot();shortspace();}
void lT () {dash();shortspace();}
void lU () {dot();dot();dash();shortspace();}
void lV () {dot();dot();dot();dash();shortspace();}
void lW () {dot();dash();dash();shortspace();}
void lX () {dash();dot();dot();dash();shortspace();}
void lY () {dash();dot();dash();dash();shortspace();}
void lZ () {dash();dash();dot();dot();shortspace();}

// isi fungsi dot and dash
void dot () {digitalWrite(led,HIGH); delay (500); digitalWrite(led,LOW); delay (300);}// Untuk dot delay 500
void dash () {digitalWrite(led,HIGH); delay (1000); digitalWrite(led,LOW); delay (300);}// yang dash 1000 ( Sesuai di submisi tugas )
void shortspace () {delay(500);}// Jeda antara huruf
