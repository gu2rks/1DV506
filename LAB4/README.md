# LAB4
## Documented by: Jonas Lundberg (Jonas.Lundberg@lnu.se)
## Edited by: [gu2rks](https://github.com/gu2rks)

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<h3 style=color:#0000cc>Lecture 9 - IO and Exceptions</h3>
All exceptions related to exercises 1 and 2 should be handled within the programs. Also, exercises 1 
and 2 can be handled by a single class respectively. Hence, there  is no need for any additional classes 
apart from the one containing the main method. However, feel free to divide your programs into a 
number of methods.
<ul>
<li><b>Exercise 1</b><br>
Create a program <tt>Histogram.java</tt>,  reading any number of integers from a file and then 
printing a histogram bar-chart for all integers between 1 and 100. Note:  not all integers in the 
file are neccesarily in the interval [1-100]. An example of an execution: 
<pre>
Reading integers from file: C:\Temp\integers.dat
Number of integers in the interval [1,100]: 46
Others: 16
Histogram
  1  - 10  | ******
  11 - 20  | ****
  21 - 30  | **
  31 - 40  | ***
  41 - 50  | *******
  51 - 60  | ****
  61 - 70  | ***
  71 - 80  | *********
  81 - 90  | *****
  91 - 100 | ***   
       
</pre>
<b>Note 1:</b> You will have to create your own data file. We expect it to be an ordinary text file with one integer on each row.
<b>Note 2:</b> The absolute path to the data file should be provided as an argument to the main method. 
</li>
<p/>

<li><b>Exercise 2</b><br>
Write a program <tt>CountChar.java</tt>, counting characters of different types in a text read from 
a file. Give the number of characters of the following types:
<ul>
    <li> Upper case letters
    <li> Lower case letters
    <li> "Whitespace" (i.e. space, tab, return)
    <li> Other characters
</ul>
The path to the text file to read can be coded into the program. (We will test with some other file.) 
An example of a text file is <a href="./HistoryOfProgramming.txt"><tt>HistoryOfProgramming</tt></a>. 
It is a part of an article from Wikipedia about the history of programming. However, we strongly 
recommend you to start testing your program with a smaller file where you can manually check the result.<p/>
An execution with the file <tt>HistoryOfProgramming</tt> as input should give the following result:
<pre>
Number of upper case letters: 86
Number of lower case letters: 3715
Number of digits: 41
Number of "whitespaces": 728
Number of others: 111
</pre>
If your result does not agree completely with the example above you have to add a written explanation, 
why you think this happens, to your submission.
</li>
<p/>
</ul>

<h3 style=color:#0000cc>Lecture 10 - Static Members and Interfaces</h3>

<ul>
<li><b>Exercise 3</b><br>
Start by creating a new sub package named <tt>stack</tt>
inside your package <tt>YourLnuUserName_assign4</tt> and save all .java files related to this 
exercise inside this package.<br/>
A stack is a LiFo (Last-in, first-out) data structure with three basic operations: push, pop and peek.
push is putting an element on the top of the stack, pop removes (and returns) the top element, and
peek returns (without removing) the top element. Think of a stack as a pile of plates that can be 
found in certain restaurants. You can only add and remove the top-most plate. You can not remove 
any plates in the middle of the pile (without first removing all plates above it).

Your task is to implement the following stack interface:
<pre>
public interface Stack {
   int size(); 			// Current stack size
   boolean isEmpty(); 		// true if stack is empty
   void push(Object element); 	// Add element at top of stack
   Object pop(); 		// Return and remove top element,
				// exception if stack is empty
   Object peek(); 		// Return (without removing) top element,
				// exception if stack is empty.
   Iterator&lt;Object&gt; iterator(); // Element iterator
}

</pre>
The iterator traverses all elements currently in the stack, starting with the top element. 
Illegal operations on an empty stack (e.g., pop() and peek()) should generate an exception. 
You should also present a test program StackMain.java that demonstrates how each method can be used.
Notice: You are not allowed to use any of the data structures in the Java library. However, you can 
use arrays.

</li>
<p/>

<li><b>Exercise 4</b><br>
Start by creating a new subpackage named <tt>sort_cities</tt>
inside your package <tt>YourLnuUserName_assign4</tt> and save all .java files related to this 
exercise inside this package.<br/>
Implement a program <tt>SortCities</tt> that reads an arbitrary number of city names and their 
zip codes from a text file. You can assume one city in each line and that each city name (String) and zip code 
(integer) is separated by a  semi-colon(;). Create a class </tt>City</tt> that represents a city and create 
a city object for each city you read from the file. The </tt>City</tt> class should also implement 
the interface </tt>Comparable</tt>. Once you have read (and constructed) one </tt>City</tt> object for each line in the file you 
should print the cities in a sorted order based on their zip codes. An execution might look like this:


<pre>
Reading cities from file: C:\Temp\cities.dat
Number of cities found: 7

23642 Höllviken
35243 Växjö
51000 Jönköping
72211 Västerås
75242 Uppsala
90325 Umeå
96133 Boden
</pre>

<b>Notice: </b> We expect you to use one of the predefined sorting algorithms in the Java 
class library when sorting the cities.
</li>
<p/>
</ul>

<h3 style=color:#0000cc>General Java</h3>

For this task, assume a plane given by a grid, with the point (0, 0) at the center. The size of the 
plane is given by an integer; if the given integer is <em>k</em>, then the values of the <em>x</em> 
and <em>y</em> coordinates can vary from -<em>k</em> to <em>k</em>. Each step will be one unit up, 
one unit down, one unit to the right or one unit to the left (no diagonal movements).<p/>

The class <tt>RandomWalk</tt> will have the following instance data :

<ul>
<li> X coordinate of the current position
<li> Y coordinate of the current position
<li> The maximum number of steps in a walk
<li> The number of steps taken so far in the walk
<li> The size of the plane (according to the description above)
</ul>
<p/>

<b>Other members</b><br/>
<ul>

<li><tt>RandomWalk(int max, int size)</tt>: 
the maximum number of steps is <tt>max</tt> and <tt>size</tt> is the size of the plane. The start position is set to (0, 0). <br/>

<li><tt>String toString()</tt>: returns a string containing the number of steps taken so far and the current position.<br/>

<li><tt>void takeStep()</tt>: 
simulates taking a single step. Generate a random number, taking on four different values, and let them correspond to a 
movement up, down, to the right and to the left, respectively. The method should also increase the number of steps taken.<br/>

<li><tt>boolean moreSteps()</tt>: 
returns <tt>true</tt> if the number of steps taken is less than the maximal number of steps, otherwise <tt>false</tt> is returned.<br/>

<li><tt>boolean inBounds()</tt>: 
returns <tt>true</tt> if the current position is inside the boundary of the plane, otherwise <tt>false</tt> is returned.<br/>

<li><tt>void walk()</tt>: 
simulates a random walk, i.e. steps are taken until the maximum number of steps has been taken or 
until a step goes outside the boundary of the plane.<br/>
</ul>
<p/>

<b>Simulation</b><br/>
Create another class <tt>DrunkenWalk</tt>, simulating walks of drunken people on a platform in a lake. The program should read the boundary, the maximum number of steps, and the number of drunks to simulate. One drunk at a time should be put on the platform and perform its walk. Your program should count how many drunks fall into the water. Test your program for some different values of size and number of steps.

Example of an execution:
<pre>
   Enter the size: 10
   Enter the number of steps: 50
   Enter the number of walks: 150
   Out of 150 drunk people, 14 (9.34%) fell into the water.
</pre>
 
</li>
<p/>
-->

<li><b>Exercise 5</b> (VG Exercise)<br>
The following exercise 
description is rather vague, more of a sketchy scenario than a concrete problem specification. Your 
task is to create the necessary classes to simulate this scenario. All classes should be properly
documented and encapsulated. </br><p/>
Start by creating a new sub package named <tt>newsagency</tt>
inside your package <tt>YourLnuUserName_assign4</tt> and save all .java files related to this 
exercise inside this package.<br/>
Newspapers exchange news by using news agencies (such as Reuters and ITAR-
TASS). A newspaper registers at a news agency and sends all its news to the
agency. The news agency collects the news and broadcasts it to all registered
newspapers, except from to the one who delivered it. Create the classes needed
to simulate this scenario. Also create a main class to show a simulation where a
couple of newpapers generate news and receive news from others.
</li>
<p/>
</ul>
</body>
</html>
