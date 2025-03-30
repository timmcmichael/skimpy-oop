2b - Java Arithmetic Operations

Once we can store values in variables, we might want to perform some calculations with those values. Arithmetic is completed using operators, which are basically symbols that get executed as commands–or “operations”--when your program runs. Java has five different arithmetic operations: addition, subtraction, multiplication, division, and one called modulus.

[Next page]

Let’s look at addition and learn a few nerdy words.. The operator we’ll use is, predictably, the plus symbol. The values an operator needs are called operands, and the arithmetic operators we’ll look at all take two operands. By that I mean, to do addition, we have to provide two numbers. Because it requires two numbers–or operands–we call it a binary operator. We won’t look at them in this video, but there are operators that only take one operand, and those are called unary operators. And an operator that takes three operands is a ternary operator.

And you thought you weren’t going to learn anything interesting today!

So the addition operation consists of a number, the + symbol, and another number. 
[2 + 3, label them as operands] [add semicolon]
An operation by itself isn’t a complete statement in Java–it’s what we might call an expression, and that expression evaluates to a result. This one evaluates to the value 5, of course–but this code isn’t doing anything with that result. In fact, this doesn’t even compile.

We really need to put this expression or operation into some kind of statement. I could put it in a println() statement, and the code would work like we expect: it would print out the number “5.” Even though the code works fine, I don’t really like putting arithmetic inside a println() statement. My preference is to keep operations separate from output, so what I’ll do is use an assignment statement to put the result into a variable. Then I’ll print out the variable.

That might seem pointless right now–why bother with the extra steps? I do have my reasons, and we’ll get to them down the road a little. For now, the point is that we’re learning about variables and assignment statements–so code that doesn’t use variables and assignment statements won’t really get any credit on assignments. Hopefully that’s reason enough for you to do it this way, at least for now.

Remember that an assignment statement centers on that equals symbol. At runtime, it’s going to evaluate the expression on the right on the symbol, and put the result into the variable on the left.
[Arrow points to variable]

In this example, both of my operands are just numbers I’ve typed into my source code–we call these numeric literals. We also use the phrase “hard coded”, as in, the values are hard-coded in my program. These are constant values that can’t change once the program starts running.

But operands can also be variables.
[int seventhGraders = 85; int eighthGraders = 76; int totalMiddleSchool = seventhGraders + eighthGraders;]

When the program gets to this assignment statement, it starts on the right and retrieves the values stored in those to variables, evaluates the addition operation, and assigns the result to the totalMiddleSchool variable.

The subtraction operator works the same way, using the minus symbol.
[int difference = 10 - 3; S.o.p(difference);]

Since that’s pretty boring, let’s at least add something. I’d like for it to tell the user what the output means.
[S.o.println(“Difference = ”); S.o.print(difference);] [show sample output]

That code puts the result on the next line. We can fix that by changing the first println() to a print().
[do that]

But we can also put that in one println() statement, using the + symbol:
[S.o.p(“Difference = “ + difference);]

If you’re nerdy like me, this is actually kind of interesting. We just said that the + symbol does addition, which implies that the operands are both numeric. But in this case, one operand is a String–so it can’t really do addition, at least not in the sense of calculating a sum. When one or both of the operands are a String, the + symbol is actually a different operator–the concatenation operator, which jams Strings together. It is actually a different operation, and some programming languages use different symbols for addition and concatenation. Java uses the same symbol for both, and the compiler figures out which operation to do based on those operand data types.

Multiplication isn’t going to be anything new, but we’ll at least use a floating point value this time. The operator is just going to be the star symbol, which is really called “asterisk.”

[75% of 334]

[double threeFourths = .75 * 334];

If either of the operands is a double, the result of the operation will also be a double.

Next up is division, which uses the / symbol. Pay attention, because there’s slash and backslash. 
[ 20 / 3]
This is the one on the same key as the question mark on your keyboard. 

Now, if both operands are integers, Java will do integer division–which can’t have any decimal data. So the result can’t be 6.67. The tricky thing here is that Java doesn’t round this up to 7, which is what a lot of us might expect. Java just chops off the decimal data and makes the answer 6. That chopping behavior is called “truncating.” You’re learning all kinds of great words today!

There are situations where integer division–or “truncated” division–is useful, but most of the time we probably want that exact number. So we’ll want to put the result into a double.

[double quotient = 20/3]

I’m storing the result in a double variable, but it’s the operands that determine if the answer gets truncated. Remember, if both operands are integers, the result is an integer. So we’ll need to make one of those a double.

[change variable to a double] It actually doesn’t matter which one we change, just as long as one is a double.


[Following is a slide/page, not in VS code]
[int ann = 15; int deidre = 17; int vanessa = 17; int numFriends = 3;]
[int totalAges = ann + deidre + vanessa;]
[double averageAge = totalAges / numFriends;]
In general, we should try to use the most appropriate data type for the values we’re storing. In this example, I have the ages of three people, which are all integers, as well as the number of people in the group–again, an integer. But I want to calculate the average age in the group–how can I do that without making one of those into a double? 

We can use something called “type casting”, or just “casting”. Casting is when we convert a variable from one data type into another. I could just make a double variable and assign the integer value to it–Java will make that conversion automatically by adding a .0 to it. This is called implicit casting, because I didn’t actually tell Java to do that.

But I can also do explicit casting, and do it in a manner that doesn’t permanently change any values or variables. I just put the desired data type in parentheses immediately before the variable or literal value.

When the program executes, java will convert this 3 into a 3.0 “on the fly” when it does the division, which gives us the floating point division we’re looking for.

One last word about division. Don’t divide by zero. I’m not a mathematician, but I guess dividing by zero causes the universe to explode or something. In our code, it causes our program to crash:
[run and example]
Sometimes we can’t prevent that from happening. Maybe we make some other calculation and then use that result in a division operation–and when the program runs, that value turns out to be a zero. Later in our programming life we’ll learn a graceful way to handle that kind of error, which we call an exception. But for now, it just makes our program crash and there’s not much we can do about it.

Speaking of mathematicians, there’s another thing from your old math classes that comes into play here: order of operations. I’ll leave the details for you to read about, but know that you can use parentheses to force the order of operations you need:

[
result = 2 * 5 + 6; // 16
result = 2 * (5 + 6); // 22
]


Now, I know what you’re thinking. I’ve already learned so many interesting things in this video–there can’t possibly be anything else. You’re wrong! I mentioned one more operation, called the modulus operation. It uses the modulo operator, which is the % symbol. Modulus finds the remainder after an integer division operation. This goes back to when you learned long division as a kid: when you divide 10 by 6, you get 1 with a remainder of 4. So 10 modulo 6 returns that remainder of 4. When you divide 25 by 4, you get 6 with a remainder of 1. So the division operation returns 6 and the modulus operation returns 1.

This seems like a weird operation to care about, but it does have some interesting applications in coding. We can use it to find our way around a two-dimensional array, for example, or to handle “screen-wrapping” in a video game. Stuff that we probably aren’t worried about right now, but file modulus away for future reference. Or use it this weekend to impress someone at a party.


And with that, I’m pretty much out of interesting things to say about math operations in Java. Just like in your math class, these four or five basic operations makes a bunch of more advanced stuff possible, so be sure to take a few minutes to try them out on your own.
