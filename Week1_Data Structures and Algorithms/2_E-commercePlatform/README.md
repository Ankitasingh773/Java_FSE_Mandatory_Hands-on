Exercise 2: E-commerce Platform Search Function
Scenario: 
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.
Steps:

1.	Understand Asymptotic Notation:
  o	Explain Big O notation and how it helps in analyzing algorithms.
  Ans: Big O notation describes how efficient an algorithm is as the size of the input data increases(denoted by n).
  o	Describe the best, average, and worst-case scenarios for search operations.
  Ans: Best, Average, and Worst Case (Based on Search context).
  Search Algorithm	Best Case	              Average Case	               Worst Case
  Linear Search	    O(1) 	                  O(n/2) ≈ O(n)	               O(n) 
  Binary Search	    O(1) 	                  O(log n)	                   O(log n)


2.	Setup:
  o	Create a class Product with attributes for searching, such as productId, productName, and category.
3.	Implementation:
  o	Implement linear search and binary search algorithms.
  o	Store products in an array for linear search and a sorted array for binary search.

5.	Analysis:
  o	Compare the time complexity of linear and binary search algorithms.
  Ans:     Algorithm	             Time Complexity	            Use Case
           Linear Search   	           O(n)	                     Use when data is unsorted or small
           Binary Search	             O(log n)	                 Use when data is sorted and fast search is needed
  o	Discuss which algorithm is more suitable for your platform and why.
  Ans:   Binary Search is better because of the following reasons:
         Users expect fast results.
  	     Product lists can be pre-sorted by name or ID.
         Time complexity is logarithmic, so even for 100,000 products and more, it takes just ~17 comparisons!
