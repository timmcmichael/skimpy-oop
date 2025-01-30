<span style="background-color: #FFFFE0;">[CLICK PAST INTRO SLIDE]</span> With OOP, we're going to shift our thinking about programs. Prior to this, we've talked about a program as a collection of methods or tasks to be executed. <span style="background-color: #FFFFE0;">[CLICK to woman thinking]</span>Now, we want to think about them as a collection of objects which interact with one another <span style="background-color: #FFFFE0;">[CLICK plus fireworks]</span>.

I'm really jealous of that Deadpool guy <span style="background-color: #FFFFE0;">[CLICK plus boom effect]</span> because he gets to own a mobile phone company, so let's work on a program for managing information for a cell phone service provider.

We'll start by thinking about the objects involved in that kind of service. There are phones, phone calls, customers, cell towers, and all kinds of other objects, depending on how detailed we want to get. To keep this video from turning into a Peter Jackson film <span style="background-color: #FFFFE0;">[CLICK to LOTR image]</span>we'll just look at a single class. Some basic customer data.

<span style="background-color: #FFFFE0;">[CLICK]</span>

To plan out our class, we'll create a class diagram.<span style="background-color: #FFFFE0;">[CLICK to show empty]</span>. At the very top of the diagram, we indicate the class's name. We'll call this one CellCustomer.<span style="background-color: #FFFFE0;">[CLICK show class name]</span>. The class name starts with an uppercase letter, unlike variables and methods, but like those other identifiers, we use capitals to indicate additional words. And the class is a blueprint for creating a single object, so we don't put an "s" on the end of the name.

Class names are also nouns. We're indicating what object we're going to make with the class--this class will represent one customer in our program.

Once we've named our class, we should think about the information this class needs to hold--the class attributes. Those attributes will be listed in the next section <span style="background-color: #FFFFE0;">[CLICK arrows]</span>. These attributes with be the fields in our class, so we need to decide what information we need to keep track of for a customer. We'll start with some basic identifying information <span style="background-color: #FFFFE0;">[CLICK]</span> like the customer's name and phone number. The name is obviously a String, but you might wonder about the phone number--shouldn't that be an int? An int could probably hold a phone number, but if we start adding country codes we might run out of space. But a String is a better choice, since we won't have to worry about the number being too many digits, and we can also include symbols, like dashes and parentheses.

Now, service providers probably keep track of a ton of data about each customer, but we're beginners and we're trying to keep this project simple, so we'll just focus on cell phone data usage. <span style="background-color: #FFFFE0;">[CLICK]</span> So I have a field for how much data the customer gets each month, and one for how much the customer has remaining in the current month. We'll store these as doubles.

I'm using descriptive names in camelCase format, and I've put a minus symbol next to each one to indicate that they're private, because we are good object-oriented programmers who encapsulate their data.

The bottom section in the diagram is for our class's behaviors, which we will implement as methods.<span style="background-color: #FFFFE0;">[CLICK]</span>. Since we've encapsulated our fields and other classes can't access them, it's a good idea to provide read-only access in the form of accessor methods, or "getters".<span style="background-color: #FFFFE0;">[CLICK]</span>. As beginners, it's okay to just create get methods for each of our fields, but if you're 100% certain that a field won't need to be accessed, you could skip it.

The purpose of a get method is to return the value in a field, so the name is "get" plus the field. Since I have four fields, I have four getters. And in order to return the value, the return type of the get method will need to make the data type of the field. phoneNumber is a String, so getPhoneNumber returns a String. monthlyData is a double, so getMonthlyData returns a double.

So, adding getters is pretty much automatic and not something we need to think much about. A set method gives "write" access to a field--it allows a new value to be assigned to that field. Soon we'll learn another option for getting data into our objects, but for now we need setters--so gain we'll have a set method for each field.<span style="background-color: #FFFFE0;">[CLICK]</span>

And finally we can think about methods that do more than just get or set a field value. These "mutator" methods will perform tasks that result in changes to the object's data. <span style="background-color: #FFFFE0;">[CLICK]</span>. 

The a customer uses data, we'll need to reduce the amount they have remaining--that's the useData() method. If they choose to pay for more data to get them through the month, we can call addData(). And on the first day of the month, we can replenish their remaining amount to whatever their plan gives them.<span style="background-color: #FFFFE0;">[CLICK to get rid of arrows]</span>

This diagram now gives us a nice visual representation of our CellCustomer class and can be a nice guide as we switch over to our IDE to begin implementing the code.

<span style="background-color: #FFFFE0;">Switch to VS Code clips</span>

To begin, we'll right-click and create a new file. The file name is exactly the same as the class name, with .java added onto the end.

We'll start with a quick header block to identify the purpose of the class..

And the first line of code is a class header. Our class should be public, and again the class name and file name have to be identical. Add a code block with a little space to work.

We'll organize our code in same way as our class diagram, so we'll declare our fields right up at the top. Each one should be private, and I'm just looking at the class diagram to see what I have designed. <span style="background-color: #FFFFE0;">[inset image of diagram, fields highlighted]</span>

Next up is our accessors, or getters. As a new programmer you should just get in the habit of making a getter for each field. And these just follow a basic pattern: It has to be public, because the point is to give access. The method's return type will be the same as the field's data type--so this is for the name field, which is a String. And the name is the work get plus the field name, so getName. And the parentheses will be empty, there are no parameters for getters.

A basic getter has one line of code--return and the field. Now, I encourage the habit of using dot notation with all field references. I'm going to put this-dot-name. The `this` keyword referces to the current object. We don't have to put this-dot, it'll still work if we just put `name`. The idea here is to get us used to dot notation, which we'll need elsewhere. It's a good habit because we're going to see some situations where `this` is actually necessary. And also, it's just a good reminder that we're looking at an field rather than a regular local variable.

All that said, there are plenty of coders who only use this-dot when it's necessary, so this isn't a convention that's universal.

Okay, so that's it for a getter. Since I have four fields I'm going to have four getters, so I'll just use the same pattern to create the other three.

The next group of methods on our class diagram is the set methods. Our set methods will get much more interesting as we learn more, but for now they are also going to follow a pattern. A set method has to be public. You should be making all of your fields private and your methods public. As usual, we'll eventually see some exceptions, but this is how we implement encapsulation--we're hiding the fields and giving access to them through public methods.

So, public and then void. Setters do not return anything, their job is to set a value. The name is set plus the field, so in this case setName. And in order to set a value for the field, we need to know what value to set--and we need a parameter for that. The data type of the parameter matches the field, so for the name field it's a String. and the parameter name can be anything, but I'm going to use cName, which is short for customer name. I'm intentionally not calling it just name because I don't want to confuse it with my field--we we're going to come back to parameter names pretty soon.

Like a getter, a setter has one line of code. It's going to be an assignment statement. I'm just setting the value of this.name to the parameter value--so, cName.

So again, this is just a pattern and we'll repeat it for phoneNumber and monthlyData.

[other two setters]

Now, I'm going to go ahead and create setMonthlyData. [type that]. But before I move on, I'm going to stop and think. Next up with be the data that's remaining, but I'm not sure I really need a setter for that. When we set the monthly data amount, that can also just set the remaining data to the same value, right. I'm assuming we're using this method to initialize the data plan when the account is first created, so they won't have used any data yet. So instead of writing a whole other set method, I'm just going to have this method set both of those values.

It's not really a problem if we were to make a separate setter for the remaining data, but I want to point out that we don't *always* need a setter for each field.














<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>





<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>



<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>

<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>


<span style="background-color: #FFFFE0;">[CLICK]</span>




<!-- Here is an example of a PlantUML class diagram for a cell phone provider customer:


```plantuml
@startuml
class Customer {
    - name: String
    - phoneNumber: String
    - planPrice: double
    - dataPerMonth: double
    - dataRemaining: double
    + Customer(name: String, phoneNumber: String, planPrice: double, dataPerMonth: double)
    + useData(amount: double): void
    + addData(amount: double): void
    + getRemainingData(): double
}
@enduml
``` -->