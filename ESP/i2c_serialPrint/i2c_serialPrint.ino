void setup() {
  Serial.begin(115200);
  Serial.println(SDA);
  Serial.println(SCL);
}

void loop() {
  Serial.print("SDA:");
  Serial.println(SDA);
  Serial.print("SCL:");
  Serial.println(SCL);
  delay(2000);
}
