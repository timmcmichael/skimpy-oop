<span style="background-color: #FFFFE0;">[CLICK PAST INTRO SLIDE]</span> As we learn about OOP, we're going to shift our thinking about programs. Prior to this, we've talked about a program as a collection of methods or tasks to be executed. <span style="background-color: #FFFFE0;">[CLICK to woman thinking]</span>Now, we want to think about them as a collection of objects that interact with one another <span style="background-color: #FFFFE0;">[CLICK plus fireworks]</span>. I'm going to break this up into two videos to make it a little easier to digest. Right now, we're going to design a class that's very similar to the kinds of classes I ask students to create on assignments. In the next video, we'll take that design and implement it in Java.

Ok, so I'm really jealous of that Deadpool guy <span style="background-color: #FFFFE0;">[CLICK plus boom effect]</span> because he gets to own a mobile phone company, so let's work on a program for managing information for a cell phone service provider.

We'll start by thinking about the objects involved in that kind of service. There are phones, phone calls, customers, cell towers, and all kinds of other objects, depending on how detailed we want to get. To keep this video from turning into a Peter Jackson film <span style="background-color: #FFFFE0;">[CLICK to LOTR image]</span>we'll just look at a single class: Some basic customer data.

<span style="background-color: #FFFFE0;">[CLICK]</span>

To plan out our class, we'll create a class diagram.<span style="background-color: #FFFFE0;">[CLICK to show empty]</span>. At the very top of the diagram, we indicate the class's name. We'll call this one CellCustomer.<span style="background-color: #FFFFE0;">[CLICK show class name]</span>. The class name starts with an uppercase letter, unlike variables and methods, but like those other identifiers, we use capitals to indicate additional words. And the class is a blueprint for creating a single object, so we don't put an "s" on the end of the name.

Class names are also nouns. We're indicating what object we're going to make with the class--this class will represent one customer in our program.

Once we've named our class, we should think about the information this class needs to hold--the class attributes. Those attributes will be listed in the next section <span style="background-color: #FFFFE0;">[CLICK arrows]</span>. These attributes with be the fields in our class, so we need to decide what information we need to keep track of for a customer. We'll start with some basic identifying information <span style="background-color: #FFFFE0;">[CLICK]</span> like the customer's name and phone number. The name is obviously a String, but you might wonder about the phone number--shouldn't that be an int? An int could probably hold a phone number, but if we start adding country codes we might run out of space. A String is a better choice, since we won't have to worry about the number being too many digits, and we can also include symbols, like dashes and parentheses.

Now, service providers probably keep track of a ton of data about each customer, but again, we're beginners and we're trying to keep this project simple, so we'll just focus on cell phone data usage. <span style="background-color: #FFFFE0;">[CLICK]</span> So I have a field for how much data the customer gets each month, and one for how much the customer has remaining in the current month. We'll store these as doubles.

I'm using descriptive names in camelCase format, and I've put a minus symbol next to each one to indicate that they're private, because we are good object-oriented programmers who encapsulate our data.

The bottom section in the diagram is for our class's behaviors, which we will implement as methods.<span style="background-color: #FFFFE0;">[CLICK]</span>. Since we've encapsulated our fields and other classes can't access them, it's a good idea to provide read-only access in the form of accessor methods, or "getters".<span style="background-color: #FFFFE0;">[CLICK]</span>. As beginners, it's okay to just create get methods for each of our fields, but if you're 100% certain that a field won't need to be accessed, you could skip a getter for that one.

The purpose of a get method is to return the value in a field, so the name is "get" plus the field. Since I have four fields, I have four getters. 

And in order to return the value, the return type of the get method will need to match the data type of the field. phoneNumber is a String, so getPhoneNumber returns a String. monthlyData is a double, so getMonthlyData returns a double.

So, adding getters is pretty much automatic and not something we need to think much about. A set method gives "write" access to a field--it allows a new value to be assigned to that field. Soon we'll learn another option for getting data into our objects, but for now we need setters--so again we'll have a set method for each field.<span style="background-color: #FFFFE0;">[CLICK]</span>

And finally we can think about methods that do more than just get or set a field value. These "mutator" methods will perform tasks that result in changes to the object's data. <span style="background-color: #FFFFE0;">[CLICK]</span>. 

When a customer uses data, we'll need to reduce the amount they have remaining--that's the useData() method. If they choose to pay for more data to get them through the month, we can call addData(). And on the first day of the month, we can reset their remaining amount to whatever their plan gives them.<span style="background-color: #FFFFE0;">[CLICK to get rid of arrows]</span>

This diagram now gives us a nice visual representation of our CellCustomer class and can be a nice guide as we switch over to our IDE to begin implementing the code. We'll do that in the next video.