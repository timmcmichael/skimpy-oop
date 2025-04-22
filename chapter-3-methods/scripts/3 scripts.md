3A: Defining and calling methods in Java
Let’s create a program with a method definition. You can see I’ve already got the basics in place: I’ve defined a class using the same name as the filename and I’ve got this “public static void main string args” line we use. Depending on whether you’re putting this file in a root folder or subfolder, you might need a package statement–which would match that subfolder name.

A method is a block of code that performs an action or task. The println() method performs the task of displaying text, for example. All the code we’ve written until now has been in a method called main(). Main is a special method that runs when we start a program, but we can create other methods as well, and they are useful for breaking up our programs as they start to get bigger and more complex.

For now, let’s just put a simple output statement in our main() method and run it, just to make sure everything’s working [“I am at”]. When you’re first starting out, it’s good to run your program frequently to make sure there aren’t any errors.

And that looks fine for now.

When we define a new method, we have to be really careful about where we put it. Our method has to go inside the class, but we can’t put a method inside another method. So we have to put it either above main() or below it. Either one is fine because the compiler is going to process the entire file before it runs, but I think most Java programmers prefer to keep main() at the top so it’s the first thing you see when you start reading through the code. That’s different from a language like Python, where you have to define your methods first–so Python programmers are probably in the habit of putting main at the bottom.

I’m going to add a little space after the main method, making sure that I’m still inside the class. This shows why clean indenting and formatting are helpful–they make it easy to see how these blocks of code are organized.

For now, our method definitions are always going to start with the words “public” and “static”, and we’ll learn what those mean when we start talking about objects and classes. Next we have to identify what type of data the method is going to return when it’s finished running. We’ll learn about that as soon as we have the basics of methods down, but at this point I’m going to put “void” because this method will just run without returning anything. And at last, we get to something we’ve learned about before–an identifier. Since methods perform actions, method names usually have a verb in them. Remember the print() method, for example–it prints something out, so that’s a nice, descriptive identifier that is a verb. The rules are really the same as with variable identifiers. Start with a lowercase letter and use camelCase to indicate new words.

I’m going to call this method outputCollegeName(), because it’s going to print out the name of the college.

After the identifier, we’ll add a set of parentheses. Method names are always followed by parentheses in Java. In fact, any time you see parentheses in Java code, it’s referring to a method. In a little bit, we’ll start putting information inside the parentheses, but in this case they’ll be empty. But even when we don’t put anything in them, we still need the parentheses.

And finally, our method needs a code block, which is a pair of curly braces. This code block is the method “body”, meaning whatever we put inside these curly braces will run when the method executes. We know how this works, because main() is a method and we know that whatever we put in that code block will run when we execute the program. So we can think of a method as a mini program.

This method is just going to output the name of the college, which isn’t the most exciting thing in the world. It’s obviously just one line of code, but for the sake of the video here I’ll break it up into multiple lines using print() statements. [print “College” in a second print() statement]

Okay, so let’s go ahead and run this program. 

Well, it compiles and runs, but it’s not printing the name of the college. This is a really common mistake, and even though I did it on purpose here, I have to admit that I make this mistake on a pretty regular basis. I’ve defined the outputCollegeName() method, but I haven’t done anything to make it execute. I forgot to invoke the method–or call the method, which is how I usually say it.

So I’m going to go back to the main() method and call outputCollegeName. Since I’ve defined this method, it works just like other methods–like print(), for example. I just put outputCollegeName, and then I have to remember to put those parentheses after the name. Notice that VS Code recognizes that I’ve defined this method, so it even has that as an autocomplete option. And of course we need a semicolon to end the line. Now let’s try running it again.

Notice that we’re missing some spaces. Remember that if we want to output a space, we have to put that space in our print() call–Java won’t add it for us. So I’ll add a space at the end of the call up here.  And now in the method I’ve defined, I’ll put a space after “Mountain.” I could also put it on the next line before “College”--it’ll work the same either way. 

We’ll run this version.

That looks good. And because it’s so fun, let’s just call that method a few more times. If I want this to output on the next line, I can just call println() with no parameters and it’ll move the cursor down, just like if we hit enter.

[“I think “ + “is the best school in the world!”]
[() + “, will you marry me?”]

And I’ll run it again to see how that looks.

Pretty boring, of course, but I’m demonstrating a point. There are going to be a lot of reasons we use methods, but the most obvious is to let me reuse my code. Once I’ve made this method, then whenever I want to print out the name of the college I can just call it. You have to kind of imagine that we’re doing something really complicated instead of just printing something out. If it’s complicated, I don’t want to have to type it a bunch of times–I’d rather type it one time in a method and then use that method a bunch of times.

Another reason to use methods is that they help make our code easy to maintain. My code has an error–it’s printing Estrella Mountain College, but the name is really Estrella Mountain COMMUNITY College. If I had been just manually typing all those print statements to make it output the name each time, I now have to find and correct in all those places. But since it’s in a method, I just need to fix it one time. I’ll go back to that method and correct my output, and now let’s run it again. 
That one correction fixes the code each time the method is used in my program. Again, you have to imagine our method does something complicated for that to seem like a big deal. We call this quality “maintainability”, and breaking code up into methods helps with maintainability.


We can define as many methods as we want. I’ll go ahead and make a method to print out another piece of information–the mascot of the college.

Remember that we have to be careful about where we put the method. It’s gotta be inside the class but not inside any other methods. I still want to keep main() at the top, but it really doesn’t matter if I put it before or after the method that prints the college name. I’ll just put it here.

It’s going to start with “public static void” again, until we learn what variations we can use, and next I’ll call this printMascot(). Remember to put parentheses at the end, even though they’re empty, and create a code block to hold the code for our method.

This time I’ll just do one print() method and have it say “Mountain Lion,” since that’s our mascot here. And this time I won’t forget to actually call the method, so I’m going to go back to main and I’ll just call this new method.
[() + “ for life!”]

And let’s run this one more time to make sure everything works the way we expect.

Okay, it looks good.

Just one last thing to point out. One method can call another–and I think that’s probably kind of obvious, but when we’re first learning to code sometimes we overthink things. I can go to my outputCollegeName() method, and I can add a line that calls my outputMascot() method. Let me run this and see what that does.

Hopefully that’s what you expect, right. When the outputCollegeName() method runs, it’s going to go line by line. It’s calling the print method, and since I’ve defined a method called displayMascot() it can also call that the same way. It kind of messes up what my program was saying, but it works just fine.

Most of the programs you write are going to use methods. This shows how to define and call methods, and from here we’ll be able to learn how to make our methods more flexible and useful.

3B: Passing Data to a Method in Java 

We’ve learned that a method is a collection of code that’s grouped together to perform a single task or action. Often, a method will need some information to complete that task. 

[NEXT PAGE]

For example, consider this method that prints the area of a circle, using the formula pi r squared. We’ll approximate pi as 3.14, and the radius is 14.5. To square that, I’ll just multiply it times itself. This evaluates to 660.185. Actually, because we’re dealing with floating point numbers we get a slightly imprecise result with a bunch of decimal places, but at this stage in our learning we don’t bother with rounding that off.

The problem is, every time we run this we’re going to get that same output because my arithmetic operations are using literal constants that won’t ever change.

Let’s look at how we might use this method in our main() method.

[NEXT PAGE]

This code uses a Scanner object to get a double from the user and store it in a variable called radius. So, we just need to use that variable in our calculation, right?

[NEXT PAGE]

As the Beatles once said, “You can’t do that.”

A variable only exists inside the code block in which it was declared–we call that the variable’s “scope”. So the radius variable can only be accessed inside the main() method, and if we write code in the printArea() method that tries to access it, our program won’t compile. [red squiggly] It’s out of scope.

One solution students often try is to move that declaration statement outside of main(), so that the variable’s scope is the whole program instead of just one method. [RED ARROW] The Beatles didn’t have a song called “You shouldn’t do that”, but…you shouldn’t do that. Maybe Tom Petty can help [DON’T DO ME LIKE THAT].  It will work, but that’s what we call a global variable, and we avoid them whenever we can. For now, you should avoid it because you won’t get any points on your assignments if you use global variables, and I guess if you get a job doing this you’ll just get yelled at by your boss.

[NEXT PAGE]
We want to get in the habit of keeping our data compartmentalized. If a different method needs that value, we can pass it–like a football.

To do that, we define a special kind of variable in our method called a parameter. A parameter catches a value that’s passed when the method is called, and we can use that parameter however we want. 

To create a parameter, you’ll declare the variable right inside the parentheses in the method header. [YELLOW ARROW]

[NEXT PAGE]

A few things about this identifier. First is that we can name it however we want, as long as we follow Java’s rules for identifiers, like not starting with a number. But since our parameter has a different scope than main(), we could even use the same name and call it “radius”. What was that Tom Petty said? [DON’T DO ME LIKE THAT] Again, just because you can do something doesn’t mean you should. Naming it radius would be less offensive than making radius global, but using the same identifier twice just leads to unnecessary confusion–so just don’t do it.

The second thing about this identifier is that I seem to be violating my own rule about being descriptive–after all, I did say we shouldn’t call them things like “x.” But this seems like a reasonable exception, since the formula everyone knows is “pi r squared”. So naming it “r” probably helps with clarity, and since I’ve already used radius I think this one is okay.

[SQUIGGLY LINE]

We still have an out-of-scope reference here because our formula refers to radius, so we need to change those to r.

[NEXT PAGE]

That fixes our method so that it compiles, and it should work now. But fixing that error has caused an error in a completely different part of the program! Welcome to the world of coding!

Defining a parameter for a method essentially establishes a rule. We’re saying that if we want to use the printArea() method, we have to provide a value for r. The method can’t execute without it. So any time we call the method, we have to provide that value.

[NEXT PAGE]

That value goes inside the parentheses when we call the method. When we put a value there, we refer to that as an argument. That can be a little confusing–when we’re calling a method, it’s an argument, but the variable inside the method is called a parameter. Some people use those words interchangeably, but we’ll try to be accurate and use the correct terms.

As soon as I provide that value, the error goes away because I’m now following the rules of the method–as long as the argument I provide is the correct data type. It turns out that we’ve been using arguments all along, like when we call print() or println(). The String we want to output is an argument.

In our example, I’ve provided the numeric literal 14.5. This works and our program will execute without problems. 

You can also use a variable instead of a numeric literal. Now whatever value the user has input will be passed to the printArea() method.


When an argument is of a primitive data type, basically all of the data types that start with lowercase letters, like int and double, the parameter gets a copy of the value. If the code inside the method changes the value of the parameter, the argument value doesn’t change. 
[NEXT PAGE]
This version of the method results in the same calculation, but in the process it squares the parameter r. But the radius variable isn’t changed.

But just so you know, this won’t be the case when we learn about objects.

If a method needs more than one piece of data, we can have additional parameters.

[NEXT PAGE]

To calculate the area of an oval, we’ll need two different radius numbers–the larger one and the smaller one. So this method has two parameters, smallRadius and bigRadius.
[NEXT TEXT BLOCK]
So now I’ve basically made a rule that says, in order to call the printAreaOfOval() method I’ll have to provide two numbers, so my method call has two arguments. I’ve just used numeric literals, but those can also be variables.

By using parameters, we can pass necessary data to methods, ensuring our code remains organized, reusable, and maintainable. 




3C: Returning Data from a Method in Java
One quality of a well-designed program is that its parts are very modular, meaning that the components are independent of each other and still work on their own. That means that we can’t have global variables that are used in various methods. Instead, we use local variables–variables that are declared within methods and then passed around as necessary.

As we’ve seen, method parameters let us pass data into a method. Return statements let us pass data back to the originating method. Let’s take a look at some of the code from our video on parameters and see how we can improve it.

[NEXT PAGE]

Our rule of thumb is that all of our input and output should be in the main method, and any other methods we write should return values instead of printing them.

In the rare case where we do want a method to output something, that should be clear in the name. That’s what we have with the name printAreaOfOval(), but there’s no real reason to output it there.

The correction is really simple. First, we’ll change the method return type from void to double, since that’s what our calculation produces. [Yellow arrows]

[NEXT PAGE]
When we do that, we immediately get an error. We’ve now said that this method is going to return a double, but the compiler can’t find a return statement.

We’ll fix that by changing the print() statement to a return statement. It’s still returning what we were printing out before, but we don’t want any output here anyway.
[YELLOW ARROWS]
And that clears up our error.

This code now compiles and executes, but we’ve got a couple of problems. The first is that our method name isn’t really correct any more. The method doesn’t print anything, it just returns the area. Since this type of method is just a calculation and doesn’t perform any other actions, we probably don’t need a verb in the name and can just name it after what it calculates
[NEXT PAGE]
areaOfOval()

The other problem is that our program never produces ANY output. Our programs still need output, we just want that happening in main() instead of our other methods.

This method now returns a value, but we aren’t doing anything with it, so it’s just getting thrown away.

But we can use that returned value as if it’s a variable of that type–in this case, a double. We can output a double just by putting it in a print() statement. In other words, all we have to do is put this method call inside a print() statement.

[NEXT PAGE]

I’ve put some extra spaces in this line of code just to make it a little more clear, visually. 

Running this code now outputs the result of that area calculation, and it does so while keeping all of the output within the main method.

As I mentioned, we can do anything with this method return that we would with any double. So I could put it in a variable to use later.
[NEXT PAGE]

[pause]

And I can use it as an operand for one of my arithmetic operations.

[NEXT PAGE]

Designing our methods to return values rather than printing them increases the modularity and maintainability of your code, making those methods usable in a wide variety of situations.


eBook section: Returning Values

// TODO: FIX:  ParameterExample code in book includes comment marks

The methods we’ve seen to this point are basically commands–they simply perform a task, and then when they’re done, program execution just goes back to the method that called it and resumes there.
But we can also create methods that are like questions–they perform a chunk of code, but when they are finished they give back an answer.

Consider this method:
[source,java]
public static void printFavNum() { <.>
   int favNum = 10 - 3;
   System.out.print(favNum);
}

public static int getFavNum() { <.>
   int favNum = 10 - 3;
   return favNum;
}

<.> This specifies a return type of `void`
<.> This specifies a return type of `int`

The first method is a command to print out a favorite number, so it does not return anything. 
The `void` in the method header is the return type, and _void_ basically means nothing; this method returns nothing.
The second method is asking to get a favorite number, so it is going to give back an `int`. The return type is specified as `int`.
The `return` statement sends the `favNum` value back to the method that called `getFavNum()`.

IMPORTANT: If a method has a return type of anything other than `void`, it will only compile if it has a `return` statement followed by a value (literal or variable) of the specified type.

This means that methods themselves essentially have data types.
`printFavNum()` has a data type of `void`. 
`getFavNum()` has a data type of `int`.
Since methods have types, you can use them in statements just as you’d use a literal or variable of that type. 
For example, the following line of code is valid:

`int answer = 18 + getFavNum();`

This evaluated the same way as any other assignment statement. It starts on the right and finds that method call, so it will execute `getFavNum()` and plug the returned value into the operation, resulting in `18 + 7` and ultimately evaluating to `25`, which is then assigned to `answer`.

A `return` statement in a `void` method stops execution of the method and returns to the calling method.

[source,java]
public static void shortCircuit() {
   System.out.print(“This runs”);
   return;
   System.out.print(“This can never run!”);
} 

The second print() statement won’t execute because the return statement ends the method. The compiler doesn’t like these kinds of _unreachable statements_, though, so it will not compile.

`return` statements in `void` methods will have some uses for us later on.

NOTE: A Java method can only return one piece of data, so it can only have one return type.  
	
====Returning vs. Outputting

Generally speaking, it’s better to return values from a method rather than outputting values.
There are a few reasons for this, but consider an obvious one. 
If you use a `print()` method, your code is limited to only working in a console application. 
That’s fine for now, because it’s the only kind of application we know how to make!
But what if we want to use that same code in a web application, or a mobile app? 
That `print()` statement won’t work–rather, the user will never see the result, because they won’t have a console window.

Consider this code:

[source,java]
// BadOutput.java

If the `kingOfSoul()` method knows who the King of Soul is, how do we print that out if we can’t perform the output in that method?
The solution is to return the String and perform the output in main().

[source,java]
// GoodOutput.java

This is another example of something that seems annoying and is just extra work.
When we’re learning new things, we sometimes have to accept the wisdom of people who are experienced and recognize that eventually we’ll see the point. We’re all about learning good habits and best practices around here, so we’ll almost always return values rather than printing them.

There are times when we want a method whose sole purpose is to produce some output. 
In that case, be sure to give it an appropriate identifier.
Notice that those kinds of methods in my examples have _print_ or _output_ in the name.

I rarely want students to create methods that produce output, and when I do I always make that explicit in my directions. 
When I refer to _returning_ something, I mean just that. 
The rule of thumb is, *all input and output statements should be in the `main()` method* and data should be passed around as necessary.

TIP: I strongly penalize input and output statements outside of the `main()` method because I’m trying to build habits that will serve you well as you learn more about programming.

TIME TO WATCH:

eBook section: Overloading
Sometimes the task, action, or calculation that a method produces has different ways of operating depending on the circumstances.

Consider a method that calculates the average age of two people:

[source,java]
// AverageAge.java
public static double averageAge(int age1, int age2) {
       return (double) (age1 + age2) / 2;
   }

This is a pretty straightforward method. Notice that the return statement uses casting with `(double)` to ensure that the result is not truncated.

If we want to calculate an average age of 3 people, we could almost use the same method. We want a method that still calculates the average age, but takes three arguments and divides by 3, instead of 2.

To create another version of a method that operates a little differently, we can use _method overloading_. To overload a method, we write a new method with the same identifier, but with a different set of parameters. An overload for our `averageAge()` method could look like this:

//


(And then show a main method with calls to each.)
