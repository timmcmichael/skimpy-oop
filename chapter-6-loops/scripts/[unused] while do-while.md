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

That's looking pretty good. The only thing I don't really like about this is the repetition of the code to get the user's input. Since we're checking the condition before the loop runs, I have to set up that condition ahead of time, and that's why I ask for the user's input before the loop.

In this situation, it's probably better to check the condition at the bottom of the loop, then jump back to the top if necessary. We can do that with a `do-while` loop. I'm going to rewrite this code with a `do-while` loop, but I'll first comment out this version so we can compare them side by side--and in case we want to look back at it later, like when we're doing our assignments. So I'll make a copy first, then comment out the original code.

The difference with this do-while structure is that our check is at the bottom, so I'll move that while statement right after the end of the block.

Now, the compiler needs to know why we've suddenly got a code block stuck here in the middle of our method, so we need the `do` keyword to indicate what's going on.

And now the last detail is to add a semicolon at the end of the while statement. This is because the `do-while` loop is a single statement, and in Java, every statement ends with a semicolon.

Let's try it out. I'll enter an incorrect answer a couple of times to see what happens, and then I'll get it right.

The loop works great. Our user interface is a little awkward, since it starts by telling us we're wrong. So I'll just delete that part of the prompt. If we really want that message, we could put it in an if statement after the user input.

It's up to you if that's important enough to worry about., but let's run it and test it out again.

One last detail we can add to this program is to count the number of tries it takes for the user to get the right answer. `while` and `do-while` loops don't keep track of how many times they've run, so we have to do that ourselves.

 For that, we'll need a variable to keep track of the count. Not, surprisingly, we call this a _counter_. It'll be an `int`, and we should declare it at the top of the method with our other variables. `count` is a good name for this variable, and I'll initialize to zero since, at the start of the program, the user has made zero attempts.

And the appropriate place to increment the counter is right after the user input. So I'll add `count++` right after the `nextLine()` call.

This counter variable is tracking the number of times the loop runs, or what we call the number of _iterations_. No matter what kind of loop we're creating, uteration is the nerdy word for one trip through a loop's code block. 

And I'll edit my final message to show the number of iterations.

The last thing we'll point out here is that, with this idea of a counter, we can also write a pretty simple definite loop--a loop that runs a specific number of times.

We'll make a loop that counts to ten. In order to keep it separate from the first loop, I'll use a new counter variable. Even though I hate one-character variable names, in this case I'll call it `i` and initialize it to zero. The 

 I'll declare it at the top of the method, and I'll initialize it to zero. The reason I'm okay with this is because `i` is the standard variable name that programmers use for a counter in a loop. It stands for "iteration" for now, though later on we'll see it used for "index".

This will work with either a `while` or a `do-while` loop, but I'll use a `while` loop for this example. I'll set up condition so the loop runs as long as `i` is less than 10. And I'll output the value of `i` in each iteration.

Let's run the program and see what happens.

We've got a problem, and it's one that beginning programmers often run into. I print out the value of `i`, but I never do anything to change it. That means `i` will always be zero, and the loop will run forever. This is called an _infinite loop_, and it's really easier to do. I can stop execution by typing Ctrl-C, or using the trash can to kill the terminal, or by clicking the Stop button up at the top.

So, inside my loop, I need to increment `i` by one. I'll add `i++` at the end of the block. and try it again.

The loop stops, and we're close--but this isn't quite right. The loop counts from 0 to 9, but we want it to count from 1 to 10. Notice that the loop is iterating ten times, which is what we want, it's just our output that's off.

There are a couple of ways to address this. For example, I could initialize the counter to 1 instead of 0. Or, I could output `i + 1` instead of `i`. Another option is to just move the increment statement to the top of the block, so it runs before the output.

All of those options are fine depending on the situation, but to mean it makes most sense to just more the increment statement up to the top.

There is a clever trick we can use with that increment operator. What I mean by that is that we can put that inside a statement. In my output, instead of printing `i`, I can print `i++`. This will print the value of `i`, and  increment it by one.

When we run this, we're back to our output issue, printing 0 to 9. Putting the `++` on the end of `i` is called a postfix increment. Java retrieves the value of i, plugs that into the println() statement, and then increments it.

But if I move the `++` to the front of `i`, it's called a prefix increment. When I do that, Java retrieves the value of `i`, increments it, and *then* plugs it into the println() statement.

Again, any of these solutions for handling the increment and output statements are fine, and ultimately they are just a matter of style. But I want you to know the different options so that you can read other people's code and understand what they're doing.

That's it for `while` and `do-while` loops. We've seen how to use them for input, how to use a counter to track the number of iterations, and how to create a definite loop that runs a specific number of times. We've also learned about infinite loops. Any loop you'll ever need to create can be done with a `while` or `do-while` loop, but we will go on and learn at least one more type of loop.