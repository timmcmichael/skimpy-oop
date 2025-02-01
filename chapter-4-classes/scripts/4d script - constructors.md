Over the past two videos, we've designed and implemented a class that represents a cell phone customer with a data usage plan. The class is fully functional--at least, as functional as beginners need it to be.

There's one topic that we kinda glossed over, and learning more about it can really simplify working with classes. That topic is constructors. 

I'm starting out with the code from the previous video, but I have changed the class name from CellCustomer to MobileCustomer, with a similar change to the demo class. Because I store all of these examples in a GitHub repository that I want beginners to easily access, I wanted to keep this version separate. If you haven't watched those previous two videos, you probably should do that before we dive in and add constructors to our class.

Let's start in our driver class, MobileCustomerDemo. 
When we create an object, the assignment statement includes the `new` keyword, then MobileCustomer with parentheses. It has to be a method call because of the parentheses, but it's odd that it has the same name as our class--and we didn't write that method, so where did it come from?

This is a special kind of method called a constructor, and it runs whenever an object is created. Its job is to initialize the object's data so that every field has a value. If the compiler doesn't find a constructor in a class at compile time, it adds a *default constructor* that initializes all fields to their default values. So, when we first instantiate our customer, the name and phone number are null--the default value for a String--and the two double fields are 0.0. Then we use the setters to assign the values we want.

Instead of letting the compiler create a constructor that initializes our fields to default values, we can write our own constructor that assigns the values we want. Let's go over to the MobileCustomer class and give that a shot.

A constructor goes right beneath the fields and above the methods, and its header is a little different than regular methods. A constructor is always public, otherwise it wouldn't do us much good. It has the same name as the class, and it doesn't have a return type. It can have parameters, but we won't add any right now.

The body of the constructor has one job: make sure each field gets assigned a value. So our pattern here is that we're going to have an assignment statement for each of our fields. We can assign whatever values we want, but whatever we put here is what every instance is going to get for initial values.

[type that code]

To test this, we can move back over to our driver class and comment out all of our calls to the setters. Now we can run this and see how it looks.

That looks pretty good, but now both of our customer objects have the same data. So what we really want is to add parameters to our constructor so we can initialize each object with different values.

Let's go back to our object class and make that change. Now, we can have as many parameters as we want. We have four fields, so that's a pretty safe bet--but remember that the data remaining can be initialized to the same value as the monthly data field.

We can name the parameters however we want, but a common convention is to just give them the same name as the fields, so let's do that.

As you watched me type that, hopefully there was as little alarm going off in the back of your head. When we learned about variable scope, I talked about how having two variables with the same name results in a conflict we call "shadowing." 

But we do have a solution. I've been encouraging you to use the `this` keyword to refer to fields. When we do that, the compiler can distinguish between the field and the parameter. So, this.name = name assigns the value of the parameter to the field. Just be aware that name = name compiles but does not work--it assigns the value of the parameter back to itself.

Let's go ahead and update the rest of these assignments, remembering that to assign the monthly data value to the remaining data field as well.

When we switch back over to our driver class, we see that we've suddenly got a problem--our object creation statements won't compile any more. Remember that the compiler will create a default constructor if we don't define a constructor ourselves. But if we DO define a constructor, the compiler doesn't add the default. So now the only way we can create an object is by using the constructor we wrote.

So let's add some arguments to these two constructor calls.

And now that we're providing the arguments needed for our constructor, this will compile and run again.

Let's see how our class is looking now.

Before we added a constructor, we had to set field values using our setters. There are a couple of advantages to using a constructor instead. First, it's a lot easier to create an object--we can do it all with one line of code instead of calling each setter separately. 
Another advantage is that we can now think about our set methods a little differently. Instead of just making a setter for each field, we can evaluate whether we really need to change the value of a field after the object is created--if there's no need to change it, we don't need a setter. 

Consider a class that keeps track of student information here at the college. One of the fields is a student ID number, and it's used to tie all of your records together. If it gets changed, it's likely to cause a lot of problems--so we probably shouldn't provide a setter for a field like that.

Remember that encapsulation is all about minimizing how we expose data, so you can think of constructors as another tool to help you do that.

There is another really nice advantage to adding constructors to our classes, and that's the ability to overload them. Remember that overloading is when we have two methods with the same name but different parameters. We can do the same thing with constructors, and it's a great way to provide flexibility when creating objects.

Let's go back to our MobileCustomer class and add a second constructor. This one will have parameters for the name and phone number only.

[implement that]

Name and phone number will be assigned from the parameters, but the data fields will be initialized to 8.0, since 8 gigabytes is the standard plan our company will offer.

With that second constructor in place, we now have two options when we instantiate a MobileCustomer object. We always have to provide the name and phone number, but we can choose to specify the monthly data quota or leave that argument out, which means the object will just get the default. With overloading, we can provide as many different constructors as we want, which gives us a lot of flexibility in how we create objects. 

That really covers the basics of constructors. They simplify object creation and give us more control over encapsulation, and going forward you can decide how best to design your constructors and setters.