Exercise 7: Implementing the Observer Pattern
Scenario: 
You are developing a stock market monitoring application where multiple clients need to be notified whenever stock prices change. Use the Observer Pattern to achieve this.
Steps:
1.	Create a New Java Project:
  o	Create a new Java project named ObserverPatternExample.
2.	Define Subject Interface:
  o	Create an interface Stock with methods to register, deregister, and notify observers.
3.	Implement Concrete Subject:
  o	Create a class StockMarket that implements Stock and maintains a list of observers.
4.	Define Observer Interface:
  o	Create an interface Observer with a method update().
5.	Implement Concrete Observers:
  o	Create classes MobileApp, WebApp that implement Observer.
6.	Test the Observer Implementation:
  o	Create a test class to demonstrate the registration and notification of observers.
 
