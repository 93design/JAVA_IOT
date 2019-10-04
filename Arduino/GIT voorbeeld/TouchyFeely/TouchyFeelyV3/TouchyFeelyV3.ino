#include <CapacitiveSensor.h> 
CapacitiveSensor capSensor = CapacitiveSensor(4,2);

int threshold = 400; 
const int ledPin = 12;                                       

void setup() {
  Serial.begin(9600);  
  pinMode(ledPin, OUTPUT); 
}

void loop() {
   int result = sensorResult(); 
   if(result > threshold) {
    digitalWrite(ledPin, HIGH);  
    } else {
      digitalWrite(ledPin, LOW);  
    }
   delay(10); 
}
// average van sensorReading and sending back mapped *10 for better treshold range control  
int sensorResult() {
  int total = 0;
  int result = 0;
  for (int i = 0; i <50; i++) {
       long sensorValue = capSensor.capacitiveSensor(30);  
       total = total + sensorValue;
       delay(1);
       //Serial.print(sensorValue);
       //Serial.print(" ");
  }
   result = total/5;
   Serial.print(" Result : ");
   Serial.println(result);
   return result;
}
