Exercise 4: Implementing the Adapter Pattern
Scenario: 
You are developing a payment processing system that needs to integrate with multiple third-party payment gateways with different interfaces. Use the Adapter Pattern to achieve this.
Steps:
1.	Create a New Java Project:
  o	Create a new Java project named AdapterPatternExample.
2.	Define Target Interface:
  o	Create an interface PaymentProcessor with methods like processPayment().
3.	Implement Adaptee Classes:
  o	Create classes for different payment gateways with their own methods.
4.	Implement the Adapter Class:
  o	Create an adapter class for each payment gateway that implements PaymentProcessor and translates the calls to the gateway-specific methods.
5.	Test the Adapter Implementation:
  o	Create a test class to demonstrate the use of different payment gateways through the adapter.
