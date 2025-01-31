Over the past two videos, we've designed and implemented a class that represents a cell phone customer with a data usage plan. The class is fully funcitonal--at least, as functional as beginners need it to be.

There's one topic that we kinda glossed over, and learning more about it can really simplify working with classes. That topic is constructors. 

I'm starting out with the code from the previous video, but I have changed the class name from CellCustomer to MobileCustomer, with a similar change to the demo class. Because I store all of these examples in a GitHub repository that I want beginners to easily access, I wanted to keep this version separate. If you haven't watched those previous two videos, you probably should do that before we dive in and add constructors to our class.

Let's start in our driver class, MobileCustomerDemo. 
When we create an object, the assignment statement includes the `new` keyword, then MobileCustomer with parentheses. It has to be a method call because of the parentheses, but it's odd that it has the same name as our class--and we didn't write that method, so where did it come from?

This is a special kind of method called a constructor, and it runs whenever an object is created. Its job is to initialize the object's data so that every field has a value. If the compiler doesn't find a constructor in a class at compile time, it adds a *default constructor* that initializes all fields to their default values. So, when we first instantiate our customer, the name and phone number are null--the default value for a String--and the two double fields are 0.0. Then we use the setters to assign the values we want.

Instead of letting the compiler create a constructor that initializes our fields to default values, we can write our own constructor that assigns the values we want. Let's go over to the MobileCustomer class and give that a shot.

A constructor goes right beneath the fields and above the methods, and its header is a little different than regular methods. A constructor is always public, otherwise it wouldn't do us much good. It has the same name as the class, and it doesn't have a return type. It can have parameters, but we won't add any right now.

The body of the constructor has one job: make sure each field gets assigned a value.
