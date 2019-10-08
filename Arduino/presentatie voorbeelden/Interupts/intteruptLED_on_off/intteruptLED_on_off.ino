// pin definitions
int ledPin = 12;
int buttonPin = 2;

// global variables
int toggleState;
int lastButtonState = 1;
long unsigned int lastPress;
volatile int buttonFlag;
int debounceTime = 20;

void setup() {
  // setup pin modes
  pinMode(ledPin, OUTPUT);
  pinMode(buttonPin, INPUT_PULLUP);
  attachInterrupt(digitalPinToInterrupt(2), ISR_button, CHANGE);
}

void loop() {
  if ((millis() - lastPress) > debounceTime && buttonFlag)
  {
    lastPress = millis();   //update lastPress
    if (digitalRead(buttonPin) == 0 && lastButtonState == 1)   //if button is pressed and was released last change
    {
      toggleState = ! toggleState;                //toggle the LED state
      digitalWrite(ledPin, toggleState);
      lastButtonState = 0;    //record the lastButtonState
    }

    else if (digitalRead(buttonPin) == 1 && lastButtonState == 0)   //if button is not pressed, and was pressed last change
    {
      lastButtonState = 1;    //record the lastButtonState
    }
    buttonFlag = 0;
  }
}

void ISR_button()
{
  buttonFlag = 1;
}
