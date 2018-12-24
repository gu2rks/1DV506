# LAB3
## Documented by: Jonas Lundberg (Jonas.Lundberg@lnu.se)
## Edited by: [gu2rks](https://github.com/gu2rks)
<li><b>Exercise 1</b><br>
<b>Notice: </b> In this exercise ou are supposed to implement all methods from scratch without any use of 
the array related methods in the Java library.</p>
Create a class <tt>Arrays.java</tt> that apart from the <tt>main</tt> method also contains the 
following <b>static</b> methods: 
<ol>
<li> Method <tt>int sum(int[] arr)</tt>, adding all elements of the array <tt>arr</tt> and returning the sum.
<li> Method <tt>String toString(int[] arr)</tt>, creating a string containing a nice-looking print out of      
the content of the array. It should be possible to use it in the following way.	
     <pre>
     int[] n = {3,4,5,6,7};
     String str = Arrays.toString(n);
     System.out.println("n = " + str);
     </pre>
<li> Method <tt>int[] addN(int[] arr, int n)</tt>, creating and returning a new array, where               
<tt>n</tt> have been added to all elements in <tt>arr</tt>. Array <tt>arr</tt> should be left         
unchanged.
<li> Method <tt>int[] reverse(int[] arr)</tt>, creating and returning a new array, consisting of 
all elements in <tt>arr</tt> in  reverse order. Array <tt>arr</tt> should be left unchanged. 

<li> Method <tt>boolean hasN(int[] arr, int n)</tt>, returning <tt>true</tt> if <tt>n</tt> is      
contained in the array <tt>arr</tt>, <tt>false</tt> otherwise.   
<li> Method <tt>void replaceAll(int[] arr, int old, int nw)</tt>, replacing all occurrences of      
<tt>old</tt> with <tt>nw</tt> in <tt>arr</tt>.

<li> Method <tt>int[] sort(int[] arr)</tt>, returning a new sorted array (increasing order), 
containing the same set of integers as <tt>arr</tt>. Array <tt>arr</tt> should be left unchanged. 
<li> <b>(VG-exercise)</b> Method <tt>boolean hasSubsequence(int[] arr, int[] sub)</tt>, returning true if     
the sequence <tt>sub</tt> is a subsequence of array <tt>arr</tt>, <tt>false</tt> otherwise. 
The case <tt>hasSubsequence({1,2,3,4,5}, {3,4,5})</tt> should return <tt>true</tt> since     
<tt>{3,4,5}</tt> is a part of <tt>{1,2,3,4,5}</tt>. The case <tt>hasSubsequence({1,2,3,4,5}, {1,3,5})</tt> 
should return <tt>false</tt> since the exact sequence of elements    
<tt>{1,3,5}</tt> cannot be found in <tt>{1,2,3,4,5}</tt>.
<li> <b>(VG-exercise)</b> Method <tt>boolean isLarger(int[] a1, int[] a2)</tt>, returning true if
array a1 is larger than a2. Starting from the head, we compare the two arrays element by element.
As soon as we find an element that is larger than the corresponding element in the other array
we stop and declare the array with the largest element as “larger”. If they have the same initial
sequence of elements but one array contains more elements, than the longer array is larger. 
A few examples;
<pre>
	{4,3} vs {1,2,3,4,5} ==> {4,3} is larger since 4 > 1
	{1,2,3,4} vs {1,3,5} ==> {1,3,5} is larger since 3 > 2
	{1,2,3,4} vs {1,2,3} ==> {1,2,3,4} is larger since the first array is longer 
</pre>
</ol>

<p/>
</p>
</li>

<li><b>Exercise 2</b><br>
Create a class <tt>SweID.java</tt> that apart from the <tt>main</tt> method also contains a number 
of static methods related to the Swedish identity number in the form <tt>YYMMDD-NNNN</tt>. 
Information about the structure of Swedish identity numbers can be found at Wikipedia
(<a href="http://en.wikipedia.org/wiki/Personal_identity_number_(Sweden)">Wikipedia: Personal identity number (Sweden)</a>). 
<p/>
We expect you to consider each ID number as a single string of type <tt>"YYMMDD-NNNN"</tt>. The class should contain the following static methods: 
<ol>
<li> Methods <tt>getFirstPart(String sweID)</tt> and <tt>getSecondPart(String sweID)</tt>, returning the first part (YYMMDD) and 
second part (NNNN) of the identity number, respectively.</li>
<li> <tt>isFemaleNumber(String sweID)</tt>, returning <tt>true</tt> if the personal identity number 
belongs to a woman.</li>
<li> <tt>areEqual(String id1, String id2)</tt>, comparing two ID numbers checking if they correspond to the same 
identity number.</li>
<li> <b>(VG-exercise)</b> <tt>isCorrect(String sweID)</tt>, returning <tt>true</tt> if the number is a correct identity number. 
To get a passed result you have to check that the date is correct (i.e. the year, month and day should be correct). 
You must also check that the last digit of the number is correct according to the rules given in the link above.

</ol>
Feel free to add more methods, if you think anything is missing. Suitable types for 
the return values are up to you to decide.<br>
Examples:
<ul>
<li>640123-8826 is a correct female number</li>
<li>550414-0913 is a correct male number</li>
<li>551314-0913 is not correct number (unvalid month)</li>
<li>550414-0912 is not correct number (unvalid last digit)</li>
</ul>
<em>Clarification: all students are supposed to do subtasks 1, 2, and 3. To get the highest 
grades you must also do subtask 4.</em>
</li>
<p/>
</p>
</ul>


<h3 style=color:#0000cc>Lecture 7 - Create Your Own Classes</h3>
In the exercises below you are supposed to create your own classes. We  also want that you, for each class 
(e.g. <tt>MultiDisplay</tt>), to create a test program (e.g. <tt>MultiDisplayMain</tt>) containing a <tt>main</tt> 
method that demonstrates how the different methods in your class can be used.

<ul>
<li><b>Exercise 3</b><br>
Create a class <tt>MultiDisplay</tt> that when executed using this code: 
<pre>
MultiDisplay md = new MultiDisplay();
		
md.setDisplayMessage("Hello World!");
md.setDisplayCount(3);
md.display();                           // ==> print-out
		
md.display("Goodbye cruel world!", 2);  // ==> print-out
		
System.out.println("Current Message: "+ md.getDisplayMessage());
</pre>
results in the following console print-out:
<pre>
Hello World!
Hello World!
Hello World!
Goodbye cruel world!
Goodbye cruel world!
Current Message: Goodbye cruel world!
</pre>
The class  <tt>MultiDisplay</tt> should of course be able to handle other messages and other 
numbers of display counts.
</li>
<p>

<li><b>Exercise 4</b><br>
Download and install the class 
<a href="AlarmClock.zip"><tt>AlarmClock</tt></a>.
Then write a program <tt>AlarmMain</tt> that uses <tt>AlarmClock</tt> to:
<ol>
<li> Set clock time to 23:48
<li> Display time
<li> Set alarm to wake up at 6:15
<li> Let the clock "tick" for 500 minutes
<li> Display time again 
</ol>
<b>Notice:</b> You are not allowed to make any changes in the <tt>AlarmClock</tt> class 
except maybe to change the package name.
</li>
<p>



<li><b>Exercise 5</b><br>
Create a class  <tt>Radio</tt> that when executed using this code:
<pre>
System.out.println("Radio 1");
Radio r1 = new Radio();
System.out.println( r1.getSettings());  // Default settings
		
// Update Radio 1 settings
r1.turnOn();
r1.setVolume(3);
r1.channelUp();
r1.channelUp();
r1.channelUp();
System.out.println( r1.getSettings()); // New settings
		
r1.turnOff();
System.out.println( r1.getSettings());  // Reset default settings
		
System.out.println("\nRadio 2");
Radio r2 = new Radio();
r2.volumeUp();   // Radio off ==> No adjustment possible
		
r2.turnOn();
r2.volumeDown();   // volume = 0 ==> OK!
r2.volumeDown();   // volume < 0 ==> error and neglect
r2.setChannel(15); // out of range = ==> error and neglect
System.out.println( r2.getSettings());
</pre>
results in the following console print-out:
<pre>
Radio 1
Settings: On false, Channel 1, Volume 1
Settings: On true, Channel 4, Volume 3
Settings: On false, Channel 1, Volume 1

Radio 2
Radio off ==> No adjustment possible
New volume not within range!
New channel not within range!
Settings: On true, Channel 1, Volume 0
</pre>
Notice
<ul>
<li> The default settings of a Radio is <tt>on = false, channel = 1, volume = 1</tt>. </li>
<li> The volume must be in range [0,5] </li>
<li> The channel must be in range [1,10] </li>
<li> You cannot adjust either volume or channel when the radio  is off </li>
</ul>
Adjustments not in range, or if radio is off, should generate an error message and not change the settings.
</p>

Finally, the class <tt>Radio</tt> should contain the following nine methods
<pre>
getSettings()  // A string with current settings
turOn(), turnOff()  // turnOff() ==> restore default settings
setVolume(int newVolume), volumeUp(), volumeDown() // up/down ==> +- 1 step
setChannel(int newChannel), channelUp(), channelDown() // up/down ==> +- 1 step
</pre>
</li>
<b>Hint: </b> Do not try to add all features at once. We suggest that you start with one 
of the adjustable parameters (say Volume) and try to make it work without any range checks. 
Then add range checks, then add Channel.
<p>

<li><b>Exercise 6</b><br>
Create a class <tt>Point</tt> that when executed using this code:
<pre>
Point p1 = new Point();
Point p2 = new Point(3,4);
		
System.out.println(p1.toString());   // ==> (0,0)
System.out.println(p2.toString());   // ==> (3,4)
		
if (p1.isEqualTo(p2))              // False!
	System.out.println("The two points are equal");
		
double dist = p1.distanceTo(p2);
System.out.println("Point Distance: "+dist);
		
p2.move(5,-2);         // ==> (8,2)
p1.moveToXY(8,2);      // ==> (8,2)
		
if (p1.isEqualTo(p2))              // True!
	System.out.println("The two points are equal");
</pre>
results in the following console print-out:
<pre>
(0,0)
(3,4)
Point Distance: 5.0
The two points are equal
</pre>
The class <tt>Point</tt> should of course be able to handle other points with different (x,y) values.
<b>Notice:</b>
<ul>
<li> The coordinates (x,y) are always integers.
<li> The method <tt>toString</tt> returns a string with coordinates suitable for print-outs.
<li> Distance between two points is computed in the same way as in Exercise 15, Assignment 1.
<li> Two points are <em>equal</em> if they have the same coordinates.
<li> Method <tt>move</tt> moves the point certain steps in x- and y-direction. 
<li> Method <tt>moveToXY</tt> provide a new set of coordinates. 
</ul>
</li>
<p>

</ul>


<h3 style=color:#0000cc>Lecture 8 - More Classes</h3>

This section contains a number of exercises where you are supposed to create you own classes. 
For each task, we expect a <tt>Main</tt> class, showing how all methods in the class or classes work. 
For example, for the class <tt>Fraction.java</tt> there should be a class <tt>FractionMain.java</tt> showing 
how all methods of <tt>Fraction.java</tt> can be used.

<p>
All classes are supposed to be commented and follow principles such as encapsulation.
<ul>



<li><b>Exercise 7</b><br>
Create a class <tt>Fraction.java</tt>, representing a fractional number of the form <tt>N/D</tt>, where <tt>N</tt> (the numerator) and <tt>D</tt> (the denominator) both are integers. If the denominator is equal to zero, an error message should be printed.

The class should include the following members:
<ol>
<li> A constructor, creating and initializing a new fractional number.</li>
<li> Methods <tt>getNumerator</tt> and <tt>getDenominator</tt>, returning the numerator or denominator, respectively.</li>
<li> Method <tt>isNegative</tt>, returning <tt>true</tt> if the fractional number is negative.

<li> Methods <tt>add, subtract, multiply, divide</tt>, performing the corresponding operations on two fractional numbers and returning a new fractional number. It is up to you to decide a proper way of handling the case when one of the fractional numbers have a zero denominator.</li>
<li> <tt>isEqualTo</tt>, comparing two <tt>Fraction</tt>-instances, checking if they correspond to the same fractional number.</li>
<li> <tt>toString</tt>, returning a string representation of the fractional number on the form <tt>N/D</tt>.</li>

</ol>
Feel free to add more methods, if you think anything is missing. Suitable argument and return types are up to you to decide.
<p/>
<b>Extra, voluntary work if you are interested in mathematics:</b> 
Make sure that the fractional number is in the most simplified  form possible. For example, the fractional numbers <tt>2/4</tt> and <tt>35/50</tt> should internally be represented as <tt>1/2</tt> and <tt>7/10</tt>. This means that the internal representation always should be the two smallest integers <tt>N</tt> and <tt>D</tt> corresponding to the given fractional number. Useful information can be found at Wikipedia: <a href="http://en.wikipedia.org/wiki/Euclidean_algorithm">Euclidean algorithm</a>.
</li>
<p/>

<li><b>Exercise 8 </b><br>
Create a class <tt>Card</tt>, representing a playing card in an ordinary card deck with 52 cards. 
A card has a <em>suite</em> (4 different) and a <em>rank</em> (13 different). Write a class 
<tt>Deck</tt> initially containing 52 different objects of the class <tt>Card</tt>. 
The class <tt>Deck</tt> should contain methods for shuffling the deck, deal a card and telling 
how many cards are still in the deck. Note that it should only be possible to shuffle a deck if 
it contains 52 cards. (Information at Wikipedia about <a href="http://en.wikipedia.org/wiki/Card_deck">card
decks</a> and <a href="http://en.wikipedia.org/wiki/Card_game">card games</a>.)
<p/>
Also write a program <tt>PlayCardsMain</tt>, creating a card deck and dealing some cards, telling the 
number of remaining cards and which cards that have been dealt.<p/>
<b>Hint</b>: Use enumeration types.
</li>
</p>

</p><li><b>Exercise 9 (VG-exercise)</b><br>
In this exercise you should use the <tt>Deck</tt> class from the previous exercise.

In the patience (single player card game) 1-2-3 you take one card at a time from the deck at 
the same time as you are counting  1,2,3,1,2,3,1,2,3 etc. You lose the game as soon as you 
get an Ace when counting "one", a 2 card when counting "two", or a 3 card when counting "three".
The chances to win, to make it through the whole deck without losing, are quite small. But how small?

<p/>
Write a program <tt>Play123Main</tt> that plays the 1-2-3 game 10000 times and then computes the probability (%)
that you win the game. The program should use a method <tt>play123</tt> that plays the game once and reports
<tt>true</tt> if you win (or <tt>false</tt> if you lose) that particular game.
</li>

<li><b>Exercise 10 (VG-exercise)</b>  (The Drunken Walker)<br>
Create a class <tt>RandomWalk.java</tt>, simulating a random walk. A random walk is basically a sequence 
of steps in some enclosed plane, where the direction of each step is random. The walk terminates when 
a maximal number of steps have been taken or when a step goes outside the given boundary of the plane.<p/> 

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

<li><tt>RandomWalk(int max, int edge)</tt>: 
the maximum number of steps is <tt>max</tt> and <tt>edge</tt> is the size of the plane. The start position is set to (0, 0). <br/>

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
<p/>)
