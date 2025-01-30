<span style="background-color: yellow;">[CLICK PAST INTRO SLIDE]</span> With OOP, we're going to shift our thinking about programs. Prior to this, we've talked about a program as a collection of methods or tasks to be executed. <span style="background-color: yellow;">[CLICK to woman thinking]</span>Now, we want to think about them as a collection of objects which interact with one another <span style="background-color: yellow;">[CLICK plus fireworks]</span>.

I'm really jealous of that Deadpool guy <span style="background-color: yellow;">[CLICK plus boom effect]</span> because he gets to own a mobile phone company, so let's work on a program for managing information for a cell phone service provider.

We'll start by thinking about the objects involved in that kind of service. There are phones, phone calls, customers, cell towers, and all kinds of other objects, depending on how detailed we want to get. To keep this video from turning into a Peter Jackson film <span style="background-color: yellow;">[CLICK to LOTR image]</span>we'll just look at a single class. Some basic customer data.

<span style="background-color: yellow;">[CLICK]</span>

To plan out our class, we'll create a class diagram.<span style="background-color: yellow;">[CLICK to show empty]</span>








<span style="background-color: yellow;">[CLICK]</span>


<span style="background-color: yellow;">[CLICK]</span>

<span style="background-color: yellow;">[CLICK]</span>

<span style="background-color: yellow;">[CLICK]</span>

<span style="background-color: yellow;">[CLICK]</span>

<span style="background-color: yellow;">[CLICK]</span>


<span style="background-color: yellow;">[CLICK]</span>


<span style="background-color: yellow;">[CLICK]</span>


<span style="background-color: yellow;">[CLICK]</span>


<span style="background-color: yellow;">[CLICK]</span>






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