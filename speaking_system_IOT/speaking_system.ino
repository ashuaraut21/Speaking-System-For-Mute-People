#include <ESP8266WiFi.h>
#include <ESP8266HTTPClient.h>
const char* ssid = "home";// 
const char* password = "home@1234";

int ir1 = D1; // choose pin for the LED
int ir2 = D4;
int ir3 = D2;
int ir4 = D5;
int ir5 = D3;
int val1=0;
int val2=0;
int val3=0;
int val4=0;
int val5=0;


void setup() 
{ 
   pinMode(ir1, INPUT); 
   pinMode(ir2, INPUT);
   pinMode(ir3, INPUT); 
   pinMode(ir4, INPUT);
   pinMode(ir5, INPUT); 
   Serial.begin(115200); 
              WiFi.begin(ssid, password);
              while (WiFi.status() != WL_CONNECTED) {
                delay(500);
                Serial.print(".");
              }
              Serial.println("");
              Serial.println("WiFi connected");
             
            
} 


void loop()
{ 
  String data="";
   val1 = digitalRead(ir1);
   val2 = digitalRead(ir2);
   val3 = digitalRead(ir3);
   val4 = digitalRead(ir4);
   val5 = digitalRead(ir5);
   if (val1 == HIGH)
   { 
      data=data+"1";  
   } 
   else 
   { 
      data=data+"0";
   } 
   if (val2 == HIGH)
   {
     data=data+"1";
   } 
   else 
   { 
      data=data+"0"; 
   } 
    if (val3 == HIGH)
   { 
      data=data+"1"; 
   } 
   else 
   { 
     data=data+"0";
   } 
   if (val4 == HIGH)
   {
     data=data+"1";
   } 
   else 
   { 
      data=data+"0";
   } 
    if (val5 == HIGH)
   { 
      data=data+"1";  
   } 
   else 
   { 
      data=data+"0";
   } 
   Serial.println(data);
    HTTPClient http;
    String url="http://mahavidyalay.in/AcademicDevelopment/ServerDemo/Led2.php?status="+data;
    http.begin(url);
    http.addHeader("Content-Type","text/plain");
    int httpCode=http.GET();
    String payload=http.getString();
    Serial.println("While sending I received this from server : "+payload);
    http.end();
   delay(3000);
   Serial.println();
   
}
