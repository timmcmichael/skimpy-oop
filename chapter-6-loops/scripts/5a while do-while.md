When we learned about `if` statements, we added the ability to run different blocks of code based on a Boolean expression. We can also use a Boolean expression to run a block of code multiple times. This is called a loop.

There are a ton of reasons we use loops in programming. But as with many topics, we start out with some simple examples. As we learn more about programming, we'll see more and more situations where loops are useful.

Every loop can be categorized as either _definite_ or _indefinite_. A definite loop is one that runs a specific number of times. An indefinite loop is one that runs until a condition is met. Both types rely on a Boolean expression to determine when to stop.

There are different ways to write loops in Java, and we're going to start with the two that have the easiest syntax: `while` and `do-while`.

To get us started quickly, I've set up a basic program called BestCollege.java, which you can download from the GitHub link in the description and eBook. This isn't an object-oriented program, we're just trying to quickly demonstrate the concept.

Run the program and try it out. It prompts the user to input the name of the best college. If they get it correct, it tells them so. If they don't, it tells them, and asks them to try again.

It needs some work, though. First of all, the logic is the opposite of what we want. If the user gets it right, it runs the code block. The condition says "if userResponse equals the correct answer", but we want if it's NOT the correct answer. To invert that statement, we put the "not" operator in front of it. It's an exclamation mark, which programmers call "bang". So now it's "bang userResponse equals" or "not userResponse equals".

Let's try that.

Much better. One smaller thing we can correct is that the answer is case-sensitive. Since that's an easy fix, we'll go ahead and do that. The .equals() method is case-sensitive, so it's useful in case matters. But the String class also have .equalsIgnoreCase(), and that seems more appropriate here. 

Let's try that.

Okay, that's nice, but not really the problem. The program only gives the user one more try, and then it tells them it's correct, even if it's not. 

Remember that an if statement checks a Boolean expression and, if it's true, runs a block of code. Once that code executes, the program keeps on going. What we want here is for the if statement to repeat. We want it to check the condition again, and again run the block if it comes back true. But if it comes back false, then we want to skip the block and proceed with the rest of the program. In other words, we want to keep running this if-statement until the user gets it right.

This is a great example of an _indefinite loop_, which is when the number of times it runs is not predetermined--it might take them 2 tries, it might take them 200. A _definite loop_ would be when the number of repetitions is predetermined, like counting to 10.

To make this if-statement into a loop, all we have to do is change that if keyword to the `while` keyword. `while` evaluates the expression and, if it's true, runs the block of code. But at the end of the block of code it doesn't keep going; it jumps back up to the condition and checks again.

Let's try it out. I'll enter an incorrect answer a couple of times to see what happens, and then I'll get it right.