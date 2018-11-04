# LAB2
## Documented by: Jonas Lundberg (Jonas.Lundberg@lnu.se)
## Edited by: [gu2rks](https://github.com/gu2rks)

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
                      "DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head> 
<link rel="stylesheet" type="text/css" href="assignment.css">
<title>1DV506: Assignment 2</title> 
</head>

<body text="#000000" bgcolor="#FFFFFF" link="#0000EE"  
      vlink="#551A8B" alink="#FF0000">


<ul>
<li><b>Exercise 1</b><br>
Write a program <tt>CountA.java</tt> that reads a string from the keyboard  
and then prints how many 'a' and 'A' the string contains. 
An example of what an execution might look like:

<pre>
Provide a line of text: All cars got the highest safty grading A.
Number of 'a': 3
Number of 'A': 2
</pre>
</li>
<p>

<li><b>Exercise 2</b><br>
Write a program <tt>Backwards.java</tt> that reads an arbitrary string from the keyboard 
and then prints it backwards. An example of an execution:
<pre>
Provide a line of text: Anakin Skywalker
Backwards: reklawykS nikanA
</pre>
<b>Notice:</b> You are supposed to use control statements to iterate over the input text backwards.

</li>
<p/>


<li><b>Exercise 3</b><br>
Write a program <tt>LargestK.java</tt>, which for any given positive integer N (read from the keyboard) 
computes the largest integer K such that 0+2+4+6+8+...+K < N. An example of an execution:
<pre>
Give a positive integer: 25
The largest K such that 0+2+4+6+...+K < 25 => K=8
</pre>
<b>Notice:</b> The program should be terminated with a suitable error message if a non-positive N is provided.

</li>
<p/>


<li><b>Exercise 4</b><br>
Write a program <tt>HighLow.java</tt>, implementing the game <em>High and Low</em>. 
The computer chooses a random integer between 1 and 100 and lets the user guess the value. 
After each guess, the user is given a clue of the type â€œhigherâ€ or â€œlowerâ€. An example of an execution:
<pre>
Guess 1: 67
   Clue: higher
Guess 2: 82
   Clue: lower
Guess 3: 77
   Correct answer after only 3 guesses â€“ Excellent!
</pre>
After 10 guesses, the program ends with a proper comment. 
</li>
<p/>

<li><b>Exercise 5</b><br>
Write a program <tt>Triangle.java</tt> reading a positive odd 
integer N from the keyboard, and then prints two triangles. First a 
<em>right-angled</em> triangle, then an <em>isosceles</em> triangle. 
An example of an execution:
<pre>
Provide an odd positive integer: 7
Right-Angled Triangle:
      *
     **
    ***
   ****
  *****
 ******
*******
</pre>
Isosceles Triangle:
<pre>
   *
  ***
 *****
*******
</pre>
The program should end with an error message if the input N is not an 
odd postive integer. 
</li>
<p/>

</p><li><b>Exercise 6</b><br>
Write a program <tt>SecondLargest</tt> that reads 10 integers from the 
keyboard and then prints the second largest one.
An example of an execution:
<pre>
Provide 10 integers: 67 -468 36 1345 -7778 0 34 7654 45 -666 
The second largest is: 1345
</pre>
Try to design the program such that changing the number of integers to be read (10) is easy.<br/>
<b>Recommendation:</b> Use a smaller value than 10 while developing the program.<br/>

<b>Notice:</b> You are not allowed to use arrays or any other data structure for storing all the integers.
</li>
<p>






</p><li><b>Exercise 7 (VG-exercise)</b><br>
Write a program <tt>CountDigits.java</tt> that for an arbitrary positive integer N (read from the keyboard) 
prints the number of zeros, odd digits, and even digits. An example of an execution:
<pre>
Provide a positive integer: 6789500
Zeros: 2
Odd: 3
Even: 2
</pre>
<b>Notice:</b> We consider 0 to be neither odd nor even.

</p><li><b>Exercise 8 (VG-exercise)</b><br>
Write a program <tt>BirthdayCandles</tt> that computes how many boxes of candles 
a person needs to buy each year for his birthday cake. You can assume that the person
reaches an age of 100, the number of candles used each year is the same as the age,
that you save non-used candles from one year to another, and that each each box contains 
24 candles. Also, at the end, we want you to print the total number of boxes one has to buy, 
and how many candles that are available after having celebrated the 100th birtday.
An example of an execution:
<pre>
Before birthday 1, buy 1 box(es)
Before birthday 7, buy 1 box(es)
Before birthday 10, buy 1 box(es)
Before birthday 12, buy 1 box(es)
Before birthday 14, buy 1 box(es)

...

Before birthday 95, buy 3 box(es)
Before birthday 96, buy 4 box(es)
Before birthday 97, buy 5 box(es)
Before birthday 98, buy 4 box(es)
Before birthday 99, buy 4 box(es)
Before birthday 100, buy 4 box(es)

Total number of boxes: 211, Remaining candles: 14
</pre>
<p/>
<b>Notice:</b> In our example we only have a print-out of those birthdays where you must buy boxes. 
In the non-printed years (e.g. 2-6 and 8-9) you can handle the birthdays without having to buy any more candles.



<li><b>Exercise 9 (VG-exercise)</b><br>
Write a program <tt>Palindrome.java</tt>, testing if a line of text (read from the keyboard) is a palindrome. A palindrome is a text consisting of the same sequence of characters read backwards, as if read from the front. Ignore all characters that are not letters, and consider an upper case letter to be equal to the corresponding lower case letter. Examples of palindromes:
<pre>
"Anna"  "x"  "Ff"   "A1 n2%}=3N{[a]"  "Was it a rat I saw?â€
</pre>
<b>Hint: </b> The two static methods <tt>Character.isLetter(char c)</tt> and <tt>Character.toLowerCase(char c)</tt> might be useful!
</li>
<p/>

</ul>
</p>


<H3 style=color:#0000cc>Lecture 5 - Arrays and ArrayList</H3>
<ul>
<li><b>Exercise 10</b><br>
Complete the program  <tt>Reverse.java</tt> below such that:
<ol>
<li> It first prints the content of the array <tt>text</tt>.
<li> Reorder the array elements backwards (in opposite order) by shifting place of 
first and last character, second and second to last character, etc.
<li> Then print the array content one more time.
</ol>

<pre>
public class Reverse {
   public static void main(String[] args) {
      char[] text = { '!', 'y', 's', 'a', ' E', ' ', 's', 'a', 'w', ' ', 
         			's', 'i', 'h', 'T' };
         			
      // Continue here ...
   }
}
</pre>
<b>Notice:</b> You should not only print them backwards. You should also swap places of the elements in the array.
</li>
<p>

<li><b>Exercise 11</b><br>
Create a program <tt>ReverseOrder.java</tt> that reads an arbitrary number of positive integers 
from the keyboard and then prints them in reverse order. The reading stops when the user inputs a 
negative number. An example of an execution:  

<pre>
Enter positive integers. End by giving a negative integer.
Integer 1: 5
Integer 2: 10
Integer 3: 15
Integer 4: 20
Integer 5: -7

Number of positive integers: 4
In reverse order: 20, 15, 10, 5
</pre>
<b>Note</b>: The user is not supposed to give the number of integers to enter. 
</li>
<p/>

</p><li><b>Exercise 12</b><br>
Write a program <tt>FrequencyTable.java</tt> that simulates that you are rolling a dice 6000 times.
At the same time, keep track of the number of times you get the result 1, 2, .... (Use an array to save the numbers.)
After the simulation, present the frequencies for the different numbers.  
An example of an execution: 
<pre>
Frequencies when rolling a dice 6000 times. 
1: 1025
2: 996
3: 980
4: 1006
5: 1035
6: 958
</pre>
</li>
<p/>

</p><li><b>Exercise 13 (VG-exercise)</b><br>
When the union is reporting about the latest salary negotiations they are presenting 
the <em>average salary</em>, the  <em>median salary</em>, and the  <em> salary gap</em>
for the workers that they represent. Write a program <tt>SalaryRevision.java</tt> that reads 
an arbitrary number of salaries (integers) and then reports the median and average salaries, 
and the salary gap. All of them should be integers (correctly rounded off).<p/>
By <em> salary gap</em> we mean the difference between the highest and lowest saleries. The 
<em>median salary</em> is the middle salary (or average of the two middle salaries) when all 
saleries have been sorted. The easiest way to sort an <tt>ArrayList</tt> is to use the static <tt>sort</tt> 
method in class <tt>java.util.Collections</tt>. <p/>

Two different executions might look like this:

<pre>Provide salaries (and terminate input with 'X'): 21700 28200 26300 25100 22600 22800 19900 X
Median: 22800
Average: 23800
Gap: 8300

Provide salaries (and terminate input with 'X'): 22100 29800 27300 25400 23100 22300 X
Median: 24250
Average: 25000
Gap: 7700
</pre>
Notice, the following programming pattern can be used to read an arbitrary number of integers from the keyboard.

<pre>
Scanner scan = new Scanner(System.in);
...
while (scan.hasNextInt()) {
    int salary = scan.nextInt();
    ...
}
</pre>
</li>


</ul>


</body>
</html>

