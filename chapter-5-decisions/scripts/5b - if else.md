In this video, we' wi'll take a look at if and if-else statements. These conditional statements give us the ability to run different blocks of code based on a Boolean espression.Iif you're not familiar with those, be sure to watch the previous video. 

In order to jump right in to these examples, we're stepping away from our OOP perspective for a moment and just working within a main() method. But don't worry, we'll be back to OOP in one of the next videos on this topic.

If you know me, you know that I really do love my teaching job. But I also love money, and the rest of my family loves fancy name brand clothes--and that's a problem. To solve that problem, I think I'll start selling some of my hilarious jokes. I'm going to write a program that calculates a total purchase price based on the number of jokes the customer wants to buy. I'll also give a discount if the customer buys more than 10 jokes. Let's get started.

Jokes sell for $30 each, which sounds expensive--but I know my worth. If a customer buys more than 10 jokes, they get a 10% discount. Through the magic of video editing, I'll add a header with test cases and I'll get the Scanner stuff ready to go.

It's easy to forget those test cases, so keep building the habit of adding them right at the start. They are worth points, and if you consistently leave them out--our magician friend can predict your future. 

[You shall not pass]

Test cases help us understand the code we need to write, starting with the variables we'll need. In this program I have one input and one output--so I need at least two variables. That might not be the only variables I need, but I can create those two start.

I like to initialize local variables when I declare them. With numeric types, I tend to initialize them to negative one. This is really just a reminder--if I see a negative number when I run my program, I know I forgot to assign a value. A lot of people use zero, and that's fine, too.

I'll prompt the user for the number of jokes they want to buy, and I'll store that in the numJokes variable I just declared. This is a good place to stop and test the program so far.

Obviously it doesn't do a lot yet, but at least I know it's working so far.

With that working, I'll calculate a total price by multplying the number of jokes by the price per joke. 

And I'll go ahead and output that total price.

And I'll run the program and try my first test case.

It looks good. Notice that the price only "kinda" looks like a currency value. As beginners, we don't worry about making the output look pretty--we just want the program to work correctly. 

To make sure it is working correctly, I'll run this a few more times with my other test cases.

They all work until I get to 10 or more jokes, because obviously I haven't written the code to a discount yet. But because I did those test cases, I already know how the math works. If they buy enough for the 10% discount, it means they're really just paying 90% of the total. 90% as a decimal is 0.9, so I'll multiply the total price by 0.9 to get the discounted price.

And for now I'll just add that code and try it out.

The program works with those higher numbers, but now it doesn't work if they're buying just a few jokes.

We need the program to make a decision about whether to not to apply the discount, and we'll do that with an if statement.

Start with the keyword `if`, followed by a set of parentheses. Inside the parentheses, we'll put a boolean expression that determines whether the discount should be applied. They have to buy 10 or more, so I'll start with this boolean express:

if (numJokes > 10)

and a code block. I'll move my discount calculation into that code block so that it only runs if the boolean expression is true. And let's test that.

We're really close, but when they buy exactly 10 jokes, they don't get the discount. This is where it's good to have thoughtful test cases. Calculation changes when they buy ten jokes, so we call that an edge case. It's important to test edge cases to make sure our decision locations are correct.

I've made a really common mistake. My boolean expression is `numJokes > 10`, but I need to use `numJokes >= 10` to include the edge case. I could also write it `numJokes > 9`, but I think the greater-than-or-equal-to syntax is more clear.

Let's test that again.

Our if statement is good now.

Okay, if I'm going to sell enough jokes to pay for all that lululumon, I need to entice my cheap customers to buy a little more and get that discount. So I think we'll add a message for customers who don't buy enough jokes to get the discount. 

This means we're going to have two different blocks of code, and we only want one or the other to run. We can do that by adding an `else` block to our `if` statement.

The `else` keyword immediately follows the `if` code block, and then we add another code block. 

Now we have these two code blocks. If the boolean expression is true, the first block runs. If it's false, the second block runs. I'll add my enticing message to the else block so people who don't get the discount know what they're missing.

Let's take a look and try a couple different values.

Well, it looks like my money problems are solved, so I'm going to wrap up this program and start shopping for vacation homes. We'll look at some other things we can do with if-else statements in the the next video.