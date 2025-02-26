Ever since ChatGPT captured the imagination of the general public around 2022, generative AI has been a hot topic. The idea of a chatbot that can generate human-like responses to regular text prompts has exposed a large audience to the idea of artificial intelligence. 

This technology works by training software to find patterns in data, and then using those patterns to generate new data. A chatbot like ChatGPT is trained on an enormous dataset of text, then based on what it learns from that data, it can generate new text.

Similar technology can be trained on images, which would allow it to generate new images based on a prompt. This is the idea behind DALL-E.

So it shouldn't be surprising that generative AI can be trained on source code as well. GitHub, which is a platform for hosting and sharing code, used this idea to create a tool called GitHub Copilot. 

GitHub Copilot is available as a plugin for several different IDEs, and we're going to look at how it works in Visual Studio Code. It acts as an assistant as your write code, suggesting completions for your code--right in the editor as you work, or through an integrated chatbot interface.

This is still a pretty new addition to VS Code, and it's in active development, so hopefully this video continues to be helpful as the tool evolves. For example, as I'm recording this, I saw a message this morning that they've added a new feature called Copilot Agent to the preview version of the extension. So, it's going to be a challenge to keep up with the rapid pace of development right now.

First, we'll need to make sure we have the GitHub Copilot extension installed. If you installed VS Code recently, you might have been prompted to install it already; if so, you'll see a Copilot icon up at the top of the window. If not, you can find it in the Extensions view by searching for "GitHub Copilot". Once it's  It installs like any other extension, and you might need to restart VS Code to get it working.

If we click on that icon, we'll open the Copilot sidebar. You'll need to sign in with your GitHub account to use it, so if you don't have one, you'll need to create one. As part of this  process, it will kick you over to your web browser to log in and authorize access from VS Code. Once you're logged in, you'll get bounced back over to Code, and you be all set. Copilot does work on a subscription model, but you can use it for free for a limited number of completions per day--and you don't need to enter any payment information to get started. You'll get a limited number of code completions per day on this free tier. If you go through GitHub's process to join their student developer pack, I believe you'll get a higher limit.

So, how does it work? Let's go ahead and create a new file, and we'll call it CopilotFun.java. I'll create my class header and main() method.

As i start to type System.out.println(), what what happens. Copilot is predicting what I might want to type next, and it offering that as a completion--just like the autocomplete feature that's built into VS Code. But instead of just predicting based on language syntax and keywords, Copilot is predicting based on the context of the code I've already written. It's suggesting that I might want to print out "Hello, Copilot!"--which I guess is because I named the file CopilotFun.java.

To accept the suggestion, I can hit Tab. To ignore the suggestion, I just keep typing. I can actually hit Escape to dismiss it, but it's pretty pushy and will keep suggesting completions as I type. That does take a little getting used to, and I sometimes find that it slows me down because I get distracted looking through the suggestion and trying to decide if it's helpful or not.

As another quick example, let's just move outside of the main method and start typing a method. Again, it's constantly suggesting code it thinks I might want, and it gets refined as a keep typing. Once I put `sum` as the method name, it figures I want a method that takes two integers and returns an integer--so it suggests that code. And I'll just accept that suggestion.

That's the basic idea of how the code complete part of the tool works. And it works on comments, too. If I put my cursor right above this sum() method and start a multiline comment, it'll suggest some text for me that explains the method.

And if I move down to the end of a line of code and start a comment, it'll try to explain that line of code.

Now, what happens if I move to the top of the file and start my usual comment block? The initial suggestion isn't really that great, but it is a nice start--I'll just add on that it calculates the sum of two integers. But here's something I think is pretty cool. My annoying coding teacher is always bugging me to add test cases in my comment block, and I never want to do it. But when I start type type out Test Cases, copilot jumps in and offers to help. And I can just keep hitting tab and enter to go to the next line, and it'll keep suggesting test cases for me.

Part of why I think this is so interesting is that the format I use for my test cases really isn't a standard format. It's not something I made up, but it's not something I ever really see out in the while. But Copilot recognizes that I'm starting a list of test cases, and it understands my format right away.

Now, I have to say that I the test cases that Copilot suggests are often not really that great. In a simple program like this, there's not much to it, but on more complex programs, the test cases can be pretty weak. I like to test edge cases and unusual inputs, and Copilot doesn't really pick up on that. But it's a good starting point.

There are a couple other ways to use Copilot in VS Code, especially if you're not a fan of the constant suggestions. If you click that Copilot icon at the top of the window, you can open the Chat panel. This is now more like a chatbot interface, where we can type in a prompt and get a suggestion back.

I'm going to ask it to write a method that takes a temperature in fahrenheit and outputs the equivalent in celsius and kelvin.

It shows me the code it's come up with, and now if I want to accept that, I can click the "Apply" button right here. It makes those changes to my file, and even highlights eveything so I know exactly what it's done. And it even commented the code so that annoying professor won't give me a hard time.

If I want that chatbot experience in a more inline way, I can press command I (or control I on Windows) to open the chat interface. I can type in my prompt, and it'll give me a suggestion right there in the editor. I still use natural language to describe what I want, but I don't have to have that big panel open on the side.

If we decide we don't want all the completion suggestions, we can toggle that off and on really easily. From that Copilot icon, select Configure code completions. The menu gives me two options for diabling this. I can disable it entirely, or just disable it for java files. I still have the chatbot interface, but I won't be bothered by the constant suggestions. And I can always use the same menu to enable completions again.

I do want to take a moment to point out that some web-based AI tools can also coming up with source code for you. I tend to use Microsoft's Copilot web interface, because I use Bing for searches--part of my effort to minimize how much I use Google products. So I'm going to go to copilot.microsoft.com, and I can type in a prompt here. If I use the same prompt as before, it doesn't have the same context--it can't look at the files I have open or the code I've been writing, so it won't necessarily know what kind of code I'm looking for. In this case, it's given me a Python program. So I have to refine my prompt by telling it I need one in Java. And now it's given me a Java program that does the same thing. One of the cool little applications of generative AI for beginners is that you could give it a chunk of code you wrote in one language and ask for a translation to a new language you're trying to learn.

Anyway, I could now copy and paste this code into my IDE. So that's a way I can still use generative AI even if I don't have something like the Copilot extension installed or integrated into my editor.

There might be a little evil voice in the back of your head pointing out that Copilot has just solved all of your difficulties in your programming class, since you can just ask it to write your assignments. I've had that same thought, and it's a challenge I don't really know how to handle right now. AI also happens to be pretty good at identifying code that's written by AI, and there are often some markers that make it pretty obvious, so I clearly have an obligation to penalize students who pass of generated code as their own--itreally is the exact same thing as turning in your friend's code, or going to Chegg and getting a solution there. And maybe I've made a big mistake by trying to integrate some of this into my class, but I just think the technology is too important to ignore. 

I can give you the usual teacher lecture about how you won't learn anything from cheating, and that you're only hurting yourself in the long run. But in this case, it's actually true. Most of my students are people who want to work in software development, or in some other IT field that will require them to do some programming at some point. So the problem isn't whether or not your teacher will catch you using generative AI to cheat--it's whether you can actually do the work you're being asked to do. Or maybe more to the point, can you get through a job interview where you're asked to write some code on a piece of paper, or on a plain text editor in front of the hiring manager. And that's eventually going to be what employers will do, if they aren't already. So, I guess I'm saying that you should use Copilot to help you learn, not to help you cheat. 

The best advice I can give my students is this: when you're tempted to use generated code, consider an alternative. Ask me for some code instead. I won't just give you an answer, of course, but I sincerely want to help, and when you ask questions I'm often able figure out what's confusing you and get you on track. I know that asking me isn't as convenient as asking Copilot, but I really do want to help.

Even if you're not my student, or you're not my student any more, you'll probably find that I'm willing to help you out. 

That's really the note I want to end on. I hope you'll start exploring generative ai but will also think about the ethics related to these tools. And follow the Spider-man advice: with great power comes great responsibility.