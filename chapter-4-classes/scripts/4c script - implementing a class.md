<span style="background-color: #FFFFE0;">Switch to VS Code clips</span>

To begin, we'll right-click and create a new file. The file name is exactly the same as the class name, with .java added onto the end.

We'll start with a quick header block to identify the purpose of the class.

And the first line of code is a class header. Our class should be public, and again the class name and file name have to be identical. Add a code block with a little space to work.

We'll organize our code in the same way as our class diagram, so we'll declare our fields right up at the top. Each one should be private, and I'm just looking at the class diagram to see what I have designed. <span style="background-color: #FFFFE0;">[inset image of diagram, fields highlighted]</span>

Next up is our accessors, or getters. As a new programmer you should just get in the habit of making a getter for each field. And these just follow a basic pattern: It has to be public, because the point is to give access. The method's return type will be the same as the field's data type--so this is for the name field, which is a String. And the name is the word get plus the field name, so getName. And the parentheses will be empty, there are no parameters for getters.

A basic getter has one line of code--return and the field. Now, I encourage the habit of using dot notation with all field references. I'm going to put this-dot-name. The `this` keyword refers to the current object. We don't have to put this-dot, it'll still work if we just put `name`. The idea here is to get us used to dot notation, which we'll need elsewhere. It's a good habit because we're going to see some situations where `this` is actually necessary. And also, it's just a good reminder that we're looking at a field rather than a regular local variable.

All that said, there are plenty of coders who only use this-dot when it's necessary, so this isn't a convention that's universal.

Okay, so that's it for a getter. Since I have four fields I'm going to have four getters, so I'll just use the same pattern to create the other three.

The next group of methods on our class diagram is the set methods. Our set methods will get much more interesting as we learn more, but for now they are also going to follow a pattern. A set method has to be public. You should be making all of your fields private and your methods public. As usual, we'll eventually see some exceptions, but this is how we implement encapsulation--we're hiding the fields and giving access to them through public methods.

So, public and then void. Setters do not return anything, their job is to set a value. The name is set plus the field, so in this case setName. And in order to set a value for the field, we need to know what value to set--and we need a parameter for that. The data type of the parameter matches the field, so for the name field it's a String. and the parameter name can be anything, but I'm going to use cName, which is short for customer name. I'm intentionally not calling it just name because I don't want to confuse it with my field--we we're going to come back to parameter names soon.

Like a getter, a setter has one line of code. It's going to be an assignment statement. I'm just setting the value of this.name to the parameter value--so, cName.

So again, this is just a pattern and we'll repeat it for phoneNumber and monthlyData.

[other two setters]

Now, I'm going to go ahead and create setMonthlyData. [type that]. But before I move on, I'm going to stop and think. Next up with be the data that's remaining, but I'm not sure I really need a setter for that. When we set the monthly data amount, that can also just set the remaining data to the same value, right. I'm assuming we're using this method to initialize the data plan when the account is first created, so they won't have used any data yet. So instead of writing a whole other set method, I'm just going to have this method set both of those values.

It's not really a problem if we were to make a separate setter for the remaining data, but I wanted to point out that we don't *always* need a setter for each field.

Okay, we are not really finished with this class just yet, but as a rule I don't like to go a long time without testing my code. So we're going to pause here and turn our attention to a driver class.

And we're once again touching on one of those topics that frustrates some students. This CellCustomer class is what I would call an _object class_, meaning its purpose is to create objects--it's not a program in and of itself.  We're going to have a completely separate file with the program that uses our class, and we're *not* just going to stick a main() method in this file. The bigger frustration is that and object class like this should *not* have any user interface elements--no print statements, no Scanner objects, no dialog boxes, nothing like that. That stuff is all part of the program itself, which goes in what we call a _driver class_. 

The analogy I like for this is the employees at a restaurant, where roles are very strictly defined and separated. In fact, they're separated so much that the food service industry has a pair of expressions for this: front of house and back of house. The front of house staff are the ones who interact with the customers, and the back of house staff are the ones who prepare the food. The front of house staff don't cook, and the back of house staff don't serve. And that's how we're going to treat our object classes and driver classes. The object class is the back of house and it never interacts with a user, and the driver class is the front of house that deals with the user and uses the object class as necessary.

Despite how frustrating this can be for some people, it's a good habit to get into. It's going to make our code more modular and easier to maintain, and it's also going to make it easier to test our code. It's another case of a best practice that I enforce in my classes.

So the bottom line is that we're going to create a separate class that will have a main() method, and that's where we'll test our object class. That driver class will have any input and output we need.

Incidentally, we're not really making a program out of this, we're just focusing on the design of an object class. So my driver class isn't much of a program, it's job is just to test or demonstrate the object class. For that reason, you'll often hear me refer to the driver as a _demo class_ or _test class_, and I name those programs with that in mind. This is pretty common in my course, since we're focusing on the object-oriented design and not on creating full programs.

Okay, I'll get off my soapbox now and create a new file for our driver class. I'm going to call it CellCustomerDemo.java. 
And I'll start with a comment block to identify the purpose of the class, and add a class header. This class will be public, and the name will be CellCustomerDemo. And I'll add a code block to work in.

When I'm working in this driver class, I'm back in the procedural programming mindset we were using before we started talking about objects. I'm going to create a main() method, and if I want to make any other static methods, I can do that. This demo is going to be pretty simple, so I'm just going to create a main() method.

I'll need to declare a variable of type CellCustomer, and I'll call it customer1. Now, this is no different than declaring any other variable, but now my object class is the data type. And just like with our other variables, I need an assignment statement to make it useful. But the assignment statement will be different when I'm instantiating an object. I'm going to use the new keyword, followed by the class name, and then parentheses. This is a constructor call, and it's going to create a new object of the class type--we'll look at constructors in an upcoming video.

That gives me an instance of the CellCustomer class. <span style="background-color: #FFFFE0;">[TRUMPET SOUND]</span>. I can run this program and make sure it's working...but it doesn't produce any output. I'll need a print statement to show that it's working.

I'll start with a println statement that just outputs the object variable, and run that.

I did get some output, but it's not very useful. The output is the name of the class, followed by an @ symbol and a hexadecimal number. We've asked it to output the whole object, and this is what Java does by default. That number is the memory address of the object, which is interesting but not really very helpful.

What I really want to do is output some of the fields in the class. So let's start with the remaining data. To do that, I'll just add a call to getRemainingData using dot notation. I'll run that and see what I get.

Okay, I got a zero, which is what I expected. I haven't set any values for the fields, so they're all at their default values--which is zero for a numeric field. Let's do the same thing for the customer's name on the line above using the getName() method.

It says "null". Remember that the data type String is capitalized because it's a class. It turns out that whenever we're using a String, we're instantiating an object. Since we use Strings so much, the Java designers made it so we can use Strings pretty much the same way as numbers, but it really is an object. And the default value of an object is "null," so that's why we're seeing it here.

To get values into those fields, we need to use our setters. Make sure we're doing this above the println statements, and now we'll use that dot notation to call customer1.setName(); As an argument, I'll pass in a name.

<span style="background-color: #FFFFE0;">["Deadpool",and maybe make deadpool pop up?]</span>

Running it now should get rid of that null. Okay, it looks like my setName and getName methods both work. The last confirmation I'll need is that the fields are actually scoped to the object. So I'll need to come back up here and make another CellCustomer object, which I'll call customer2. This time, I'll combine the declaration and assignment into one line, just like we often do with other variables. 

I'll call the setName method on customer2, and I'll pass in a different name. And now I'll add a println to show that name as well.

Okay, now I've really confirmed that the name field and the methods that go with it are working. So I'll need to do the same with the other fields. I'll set values for phone number and monthly data. Remember that the setMonthlyValue() method also sets the remaining data field, so I don't need to set that separately.

And now I'll just output all three of those.

I'll run that and make sure it's working. And it is. I've got all of my fields set and I'm able to get them back out. So I'm confident that my object class is working as designed.

Now we can go back over to our object class and finish up the remaining

These last couple methods are what I would call "mutators". They don't just directly set a value like our setters do, but they do end up changing the object's data--and "mutate" means "change".

First up is a method for when the customer uses some of their data. It's public, so we can actually use it, and it's void because I'm not asking for any information back--we're just going to reduce the amount of data the customer has left. We could do both. Our method could reduce the data and then return how much is left, for example--and that might be a good way to write this. But I'm trying to keep things clear for our beginners by just having a void return type. Our parameter is just the amount of data that's been used.

The body of this one is pretty straightforward; I'm just going to subtract amount from the remaining data. And that's it.

Let's jump over to our driver class and test this method. I'm going to add a call to useData() for customer1, and I'll pass in a number. Then I'll need to output the remaining data again to see if it's changed. I'll run that and see if it's working.

Okay, we're almost finished. The last two methods are really similar to each other. The idea is that there are two ways for the customer to increase their data. They can buy more, which is the addData() method, or they can have their plan reset at the beginning of the month, which is the topUpData() method. And of course I'm just now realizing that I should have called the method resetData(), but I'll have to live with it!

Okay, addData(). This is the same as useData(), but it adds instead of subtracts. So that'll just be += here.

And since that's pretty simple I'll go ahead and do the other method before we test.

topUpData() doesn't really add onto the remaining data, it just sets it to the monthly data amount. So this one is public void. And no parameters, since the amount it gets topped up to is the monthly data they get with their plan. So the body just sets remainingData to monthlyData.

Okay, let's go test both of those.

[add and test those]

Okay, that's it for our class. We've got all of our fields, getters, setters, and mutators. We've tested all of our methods in our driver class, and we're confident that our class is working as designed, so that really wraps up with project. We still have a few important topics to look at with basic classes and objects, but this gets us started with the basics of object-oriented programming.


