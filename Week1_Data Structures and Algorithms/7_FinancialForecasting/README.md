Exercise 7: Financial Forecasting
Scenario: 
You are developing a financial forecasting tool that predicts future values based on past data.
Steps:

1.	Understand Recursive Algorithms:
  o	Explain the concept of recursion and how it can simplify certain problems.
  Ans: Recursion is the process in which function calls itself again and again.
      code of Recursion for clear understanding:
  	  int factorial(int n) {
         if (n == 0 || n == 1) return 1;
         return n * factorial(n - 1);
      }
  	
3.	Setup:
  o	Create a method to calculate the future value using a recursive approach.
4.	Implementation:
  o	Implement a recursive algorithm to predict future values based on past growth rates.

6.	Analysis:
  o	Discuss the time complexity of your recursive algorithm.
  Ans: Time complexity is o(n).
       Space complexity is also o(n).
  o	Explain how to optimize the recursive solution to avoid excessive computation.
  Ans: To avoid too much recursion (especially for large n), We can use iterative version.
