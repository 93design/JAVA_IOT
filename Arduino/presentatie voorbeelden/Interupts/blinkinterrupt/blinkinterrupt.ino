
// digital pin 2 has a pushbutton attached to it. Give it a name:
int pushButton = 2;
int led = 12;
volatile int delayValue = 1000;
// the setup routine runs once when you press reset:
void setup() {
  // initialize serial communication at 9600 bits per second:
  Serial.begin(9600);
  pinMode(led,OUTPUT);
  pinMode(pushButton, INPUT_PULLUP);
  attachInterrupt(0,blink,RISING);
  
}

void loop() {
  digitalWrite(led, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(delayValue);                       // wait for a second
  digitalWrite(led, LOW);    // turn the LED off by making the voltage LOW
  delay(delayValue);                       // wait for a second
}

void blink() {
  delayValue= delayValue - 100;
}
