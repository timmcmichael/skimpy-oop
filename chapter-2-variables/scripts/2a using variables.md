# Using Variables in Java

The memory locations where we store data while our programs run are called variables. Keep in mind that we’re not talking about saving something on your computer so that it’s there the next time you turn it on–this is just information our program needs and uses while it’s executing, and it’s gone once the program stops running. 
[Maybe a disk with a red X or something like that?]

When I’m teaching in person, I tend to use a cup as my visual aid for a variable.
[Mug]

A variable can hold one piece of information. So if I want to store someone’s name, that’s one variable. Storing their height would mean a second variable, and storing their age would be a third. Eventually we’ll learn how to store groups of data, but for now it’s one variable for each thing we need to keep track of.

To create a variable in a program we use a variable declaration statement, which has two parts: a data type and an identifier. We’ll take the second part first, and talk about identifiers. An identifier is the name we use to refer to a variable. “Identifier” is the proper term, but programmers tend to just call it the variable’s name.

Java doesn’t really care what name or identifier we give to a variable, as long as it follows a few rules. It has to start with a letter, underscore, or dollar sign. It can have numbers, but not at the start, and it can’t have any other symbols–including spaces. Oh, and for now you can’t use the same name twice–but there are some exceptions, so we won’t count that as a rule for now.

Those three rules are all that Java cares about, but the humans who look at your code have some expectations about identifiers. Different programming languages have different conventions. A convention is not really a rule; it’s something people agree to do, like hitting skip if a Justin Bieber song comes on. One Java convention is to name variables a using a style called camelCase because we’re not allowed to use spaces. 
[Show a two word variable with spaces, then animate that to camelCase]
A variable name should start with a lowercase letter and then capitalize the start of each new word. Those capital letters make names with multiple words easier to read.

You might have experience with a programming language that uses a different convention. For example Python variable names are written in snake_case, where all the letters are lowercase and words are separated by underscores. 

[break the name up and put it in snake_case]

Those naming conventions become a habit, and whatever you’re used to will always look better, but you’ll need to force yourself to use camelCase in Java, otherwise all the other Java reindeer will laugh and call you names. Aaaand you’ll also lose points on your assignments if you don’t use camelCase. Naming conventions exist for a reason, and those conventions are expected in industry–so you’ll need to follow them here, too.

In addition to using camelCase, the other naming convention you need to follow is using descriptive identifiers. The name of a variable should describe what it contains or what purpose it serves in your code. Like labeling a box with all the junk you’re going to put in it before you take it out to the garage and stick it on a shelf–other people who come along need to be able to tell what’s in there. Naming a variable emailAddress is descriptive; naming the variable “e” is not descriptive. When we look at code, we value the quality of “readability”-- is it easy for us to understand what the code does? Most coding conventions are ultimately about improving readability. Using single-letter identifiers, for example, or abbreviating words too much, can make code confusing to understand.

In addition to an identifier, the other piece we need in order to declare a variable is a data type. As the name suggests, the data type establishes what type of information the variable will store. For example, if we want to store a whole number we can use the int data type, which gets its name from the math term “integer.” For numbers with decimals, we can use double, which is what we call a “floating point” data type. And when we need to store letters and words, we can use String. There are other data types you need to be aware of, but most of the variables we’ll create as beginners will be one of these three–so we’ll leave the others for you to read about.

The format of our variable declaration is the data type first and then the identifier. And like other Java statements, we have to remember to end with a semicolon. Java uses this declaration to reserve or allocate a chunk of memory based on the data type and then connects that location to our identifier so we can easily refer to it. Basically, it gives us a cup.


Here’s an example of a program that declares three variables. Since a person’s age is generally a whole number, we’ll use an int for that. For height, we’re going to use a double. In this program, we’re thinking of height as being in inches. And finally, we have a variable for a name–and that’s a String, since it’s a collection of characters.

[Code example]
Here’s an example of a program that declares some variables. Once they’re declared, we can refer to them with their identifiers. Whenever our program sees a variable identifier, it’s going to jump over to that location in memory, retrieve the value or data it finds, and put that data in place of the identifier in your code.

This program just declares some variables and then prints them out, and since that’s literally all we’ve done, it just prints out the default values that Java puts in a new variable. For numeric data types, it’s pretty straightforward–the default is zero in either integer or floating point format.

String is a little different, and we can see that it’s capitalized, unlike the others. That’s because a String is an object–as in, the first O in OOP. 
[Textfield of Object Oriented Programming]

We might also call it a reference data type, whereas the lowercase ones are called “primitive data types.” A primitive type stores a value, but a reference type actually stores a reference to another location in memory. Actually, in a different part of your computer’s memory. We’re not quite ready for all of that, but we need to know that these memory locations have to have something in them. As an analogy, an “empty” cup isn’t really empty–there’s air in there, right? So Java puts a zero in primitive variables, and in reference variables it puts something called a null reference. Null means something has no value.

When I try to refer to these variables in println() statements, I get a compiler error. Remember that declaring variables only reserves space in memory–we still need to put values into these cups. 

But before we do that, I want to point out that String is a little different from int and double. Notice that I’ve capitalized String, but not the others. 

That’s because a String is an object–as in, the first O in OOP. 
[Textfield of Object Oriented Programming]

We might also call it a reference data type, whereas the lowercase ones are called “primitive data types.” A primitive type stores a value, but a reference type actually stores a reference to another location in memory. In fact, it’s a location in a different part of your computer’s memory. We’re not quite ready for all of that, but we need to know that these memory locations have to have something in them.




 To do that, we’ll use an “assignment statement.” An assignment statement uses a single = sign–and I’m saying that deliberately, because we can use = signs in combination with other things for something else eventually. But forever and ever, when you see a single = sign in java, that’s an assignment statement. And the job of an assignment statement is to put a value into a variable.

So we put the identifier on the left side of = and the value we want to store on the right. If we add assignment statements to our code, we can see that these assigned values are what get output, because the computer goes out to that memory location and retrieves what’s there. [show code]

And notice that once again the String variable is a little different. String values have quotation marks–that’s how Java knows where the string starts and ends, since it might include symbols and words that are similar to Java statements and syntax.

Order counts here! If I put the assignment statements after the println() statements, I still get the default values in my output–the program executes one line at a time, and it goes to get whatever value the variable has at that exact moment in time.

Most of the variables we declare are going to need a value assigned to them right away, so Java lets us combine the declaration and assignment statements into one line of code. We’re going to declare our variable the same way, but then stick the assignment on before the semicolon. This is really useful and is probably how you’ll do a lot of your declarations.
[Show revised code with combined statements]

Okay, we’ve got our cup and we’ve put something in it. What happens if we want to change what’s in the cup? After all, it’s called a variable because the contents can change. We can assign a new value to a variable even if it already has an existing value.
[Print with first value, then assign a different value and print again]

Being able to change a value does lead to one common mistake. When beginners try to assign a new value to a variable they’ve already declared, they often put the data type first 
[show example, then add the new erroneous line]
But putting the data type first is telling Java that you want to make a new variable of that data type, and since you can’t make a second variable with the same name, this code won’t compile. Once you’ve made a variable, you only need an assignment statement–not a combined declaration and assignment.

Variables are going to bring our programs to life so they can do more than simple output. We’re only beginning to see what we can do with them, but declaration and assignment statements really are going to be the foundation for pretty much everything you learn going forward.
