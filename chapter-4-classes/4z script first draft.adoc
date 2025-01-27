4b - Encapsulation


''''

I've been talking about OOP as a way to bundle data and code into objects, and I've been using the idea of a classroom to help us visualize how classes and objects work. But there's a lot more to OOP than just bundling things together. One of the key concepts in OOP is encapsulation.

[CLICK]

Abstraction is when we take something that is potentially complex and reduce it down to somethings simpler so that we can work with it and talk about it without bogging down on the details. We do this all the time in our lives.

 If you ask me what I did this morning, I might answer, "Oh, I drove to campus." [CLICK] Whether I got there in a police car or my own personal vehicle, the idea is that it sounds really simple. I do it every day. But in actuality, there was a lot more to it. First, I opened my car door and sat down. Then I started my car, backed out, turned west, drove down the street, and turned left at the stop sign. 
 
 All of those things had to happen, but when you ask me what I did this morning, it would be crazy if I just started listing all those things. Instead, I give you an abstraction of what I did. I say, "I drove to campus." The details don't matter in terms of our conversation. If you're saying hi to me in the hall, you just want the general idea. That's abstraction.

[CLICK]

In object-oriented programming, if we want to work with something complex--like, for example, cars in a racing game--we can use classes and objects to represent those complicated things. It doesn't save us from doing the work--we still have to create those classes. We still have to write the code that makes all of this functional. But once we've done that one time [CLICK], now we have this nice abstract idea of cars in our game and we don't have to get into the details of how they work anymore. In fact, if I'm working on a programming team, maybe I might not have anything to do with how the car class works. There could be a completely separate group of programmers developing that, and then they'll give me the completed class--I don't even have to know how it works in order to use it. I've got a car class: I know what its attributes and its behaviors are in the forms of variables and methods, and now I can use those to instantiate objects in my game.

Hopefully, it's kind of obvious that methods are a big part of this abstraction. You can imagine a "drive to work" method if there were a ProfessorTim class. I abstracted all those details, all the step-by-step stuff, and I could just put them into a method called "drive to campus." That's a big part of our abstraction.

You've actually been benefiting from the idea of abstraction probably since the very first time you ever wrote anyThe first thing most new coders ever do when learning to program is you just make the computer output something simple onto the screen. When you did that, you didn't have to worry about all the endlessly complicated things that had to happen in order to make the correct pixels on your monitor light up to form those words. You probably just called the print  or println method. You used an abstracted method to take care of all of those details so that you could just focus on the big picture idea of, "Hey, I want to make it say 'Hello, World!' on my monitor."

[CLICK]

In fact, I'd go so far as to say that if you have any programming experience at all, you've probably kind of internalized this idea of abstraction and you just do it naturally. We don't really even have to think about it. It's a big reason why we want programmers to write functions and methods right away when they're first learning to program--so that they can learn to bundle up this kind of related set of steps into one abstracted idea.

If you stick with object-oriented programming long enough, you learn that abstraction 

[CLICK]

Very closely related to the idea of abstraction is encapsulation. Encapsulation is about taking all of those ugly details, those really complicated things that we abstracted away into a general idea, and we're going to put those all in a safe spot where nobody can come along and mess with them. Nobody can inadvertently break our code.





''''

hopefully it's kind of obvious that methods are a big part of this abstraction you can imagine kind of a a drive to work method if there were a um a professor Tim class right um I

abstracted all those details all the stepbystep stuff and I could just put them into a function or a method called drive to campus and and that's a big part of our abstraction you've actually been benefiting from the idea of abstraction probably since the very first time you ever wrote any kind of code uh for most people the first thing you ever do when when you're learning to program is you just make it output something simple onto the screen and when you did that you didn't have to worry about all the the

endlessly complicated things that had to happen um in order to make the correct pixels on your monitor light up to form those words and that message no you just probably called The Print method or the print function or or the right method or right line or something like that you used an abstracted method to take care of all of those details so that you could just focus on the big picture idea of hey I want to make it say Hello World on my monitor in fact I would go so far as to say that um if you have any programming

experience at all you've probably kind of internalized this idea of abstraction and you just do it naturally we don't really even have to think about it um it's a big reason why we want programmers to write functions in methods right away when they're first learning to program so that they can learn to bundle up this kind of related set of steps into one abstracted idea very closely related to the idea of abstraction is encapsulation encapsulation is about taking all of those ugly details those

those really complicated things that we abstracted away into a general idea and we're going to put those all in a safe spot where nobody can come along and mess with them nobody can inadvertently break our code let's get back to the idea of this car I drove my car into work I drive in pretty much every day I I drive my car on weekends to go to the store and and get my girls to the places that they need to go and maybe because I'm old and I've just been doing it a long time it starts to feel really simple okay and in

fact it's simple enough that if I were to find your keys and go out to the parking lot and jump in your car I'm pretty sure I'd be able to figure it out and and drive away without too much trouble but a car is actually really really complicated there's all kinds of stuff going on in there if I pop the hood and take a look at what's just in the engine compartment I'm I'm probably going to be fine I can look around and and see kind of what's going on but I don't understand any of it and if I start

poking around and touching things it's really only a matter of time before my car is going to stop working um Hyundai was smart enough in my case to encapsulate all of the complexity and and all the the detail that's involved in the operation of a car and they've given me access to just the things that I need to have in order to operate it so I've got a steering wheel I've got some pedals I've got a gear selector and things like that the rest of the car is all encapsulated so that I don't mess with

it let's apply this idea of encapsulation to a programming scenario uh we'll stick with this car that we've been talking about but now we'll imagine that we're working on maybe a self-driving car project autonomous vehicles and we're going to be writing the code that does the driving right that that controls the car so um we have our our car class and in particular I'm interested in those two attributes which um are very closely related to safety right the the speed that a car is going and the direction it's traveling in um are both

uh concerning if they they aren't managed appropriately and um this is potentially a big project it's hard for one person to write an autonomous car program right um so we probably have a lot of people working on this project what happens if somebody on another part of the code comes along and they're they're manipulating our object and they set the speed of the vehicle to um you know 200 mil an hour in the middle of a downtown busy street or um or maybe they just set it to some some invalid value

like they they accidentally flip it from um 40 miles an hour to negative 40 miles an hour um or they you know they turn the car into a Direction That's Not Safe um these are all problems and these are all things that um we can't really control as long as people have direct access to those attributes I mean we have to just rely on those people um to be careful uh or more importantly to to not make mistakes right I doubt they're going to do those things on purpose but they might have a bug in their code that um that puts the

car into an unsafe situation so encapsulation can help us address this issue because in encapsulation the idea is that we're not going to give our um other programmers or us in another context um we're not going to give access to those variables directly if someone or something needs to adjust the speed of the car we have perfectly good methods for that right we have an accelerate method we have a break method and in those methods whoever's implementing the car class can write code that ensures it behaves in a

safe manner it can make sure that it doesn't accelerate too fast in an area where there's a lot of traffic around it can make sure it doesn't um turn left if there is an obstacle over to the left and so um the idea of encapsulation is that we're uh we're going to kind of protect those variables and give access just to the methods that are used to manipulate them and that's a really big part of what we do with our our functions or our methods incidentally um if even if you've done some objectoriented

programming in the past you may have just made these sort of generic kind of set variables that that really just still set the variable to to whatever value is passed in um but what's important is that we can write code to make sure um that that that code is valid and and appr appropriate before we make any changes to our data now the the support for all objectoriented programming is different across different programming languages some languages have really strong object-oriented programming support and

some not as strong especially with encapsulation so if I'm working in what I would consider a strong oop language like Java or C uh those languages provide a keyword called private that allows me to um to set up encapsulation very easily I can say that the speed variable is private I can say that the direction variable is private and the the runtime environment will not allow outside access to those and when I'm teaching in in languages like that that have this private keyword what I tell my students

is that we always Mark our variables private and we never let anyone touch our privates right we never let anybody have access to our privates if somebody wants access to our privates then they can um they can get that access through the methods that we've created to control how that access happens right so I I guess this is probably a lesson for for Life Beyond just programming but mostly obviously it's it's meant as a tongue and cheek way to help you remember this U but in object-oriented programming our our default should be to

make all of our variables private when we're designing our classes and then we make public methods that give access to those uh to those pieces of data and only as much access as they need if they don't need um you know going back to our real life example Tim doesn't need access to all the parts of an engine so Tim probably shouldn't have that access you're just asking for trouble if you give me a wrench and uh uh and open up the hood um compare that to a language like python python doesn't have what I

consider super strong uh object-oriented programming support there's really not a like a private keyword in the same way when you set up variables in your python classes they are exposed kind of automatically so anybody can come along and they can change the speed variable um and the the truth is actually that even in Java or c sharp I could just not use those private um keywords I could leave those public and and I have the same problem um and often that seems like it's a much easier solution right then I don't have to go

to the trouble of creating those methods and I don't have to go to the trouble of using them when I just want to change the speed I know I'm not going to make a mistake right um but if you're going to work in an object-oriented programming environment then it's your responsibility to to handle that the appropriate way and essentially to to play by the rules right um that even if the language allows you to um to access things you're not supposed to have access to then you have to leave them alone you have to go through those

methods um the idea is those those rules seem like an inconvenience but they are there for a reason and um there's if you don't like them then I guess object-oriented programming is not for you right um there's no use kind of doing this if you're not going to do it right okay so that's really it for this overview and and now you can kind of move on to look at the details of how these things are implemented in whatever programming language you're using uh so with that I'll say good luck with your

programming and I will remind you never to let anyone touch your privates
