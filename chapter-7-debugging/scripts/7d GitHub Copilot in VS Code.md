Ever since ChatGPT captured the imagination of the general public around 2022, generative AI has been a hot topic. The idea of a chatbot that can generate human-like responses to regular text prompts has exposed a large audience to the idea of artificial intelligence. 

This technology works by training software to find patterns in data, and then using those patterns to generate new data. A chatbot like ChatGPT is trained on an enormous dataset of text, then based on what it learns from that data, it can generate new text.

Similar technology can be trained on images, which would allow it to generate new images based on a prompt. This is the idea behind DALL-E.

So it shouldn't be surprising that generative AI can be trained on source code as well. GitHub, which is a platform for hosting and sharing code, used this idea to create a tool called GitHub Copilot. 

GitHub Copilot is available as a plugin for several different IDEs, and we're going to look at how it works in Visual Studio Code. It acts as an assistant as your write code, suggesting completions for your code--right in the editor as you work, or through an integrated chatbot interface.

This is still a pretty new addition to VS Code, and it's in active development, so hopefully this video continues to be helpful as the tool evolves.

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

I'm going to ask it to write a method that takes a temperature in fahrenheit and outputs the equivalent in celsius and kelvin

It shows me the code it's come up with, and now if I want to accept that, I can click the "Apply" button right here. It makes those changes to my file, and even highlights eveything so I know exactly what it's done. And it even commented the code so that annoying professor won't give me a hard time.

If I want that chatbot experience in a more inline way, I can press command I (or control I on Windows) to open the chat interface. I can type in my prompt, and it'll give me a suggestion right there in the editor. I still use natural language to describe what I want, but I don't have to have that big panel open on the side.

If we decide we don't want all the completion suggestions, we can toggle that off and on really easily. From that Copilot icon, select Configure code completions. The menu gives me two options for diabling this. I can disable it entirely, or just disable it for java files. I still have the chatbot interface, but I won't be bothered by the constant suggestions. And I can always use the same menu to enable completions again.










