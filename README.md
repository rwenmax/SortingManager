# SortingManager

Welcome, this is my sorting manager that has three distinct sorting methods, which include: Bubblesort, Quicksort and Binary Treesort

The sorting method takes in an `Array` or an `ArrayList` of a `Generic` type and sorts it in Ascending order. 

As a default the program generates an `Array`/ `Arraylist` of type `Integer` between the number of 0-99. The size of the list is set by the user in the User Interface.
The User Interface is what the person running the program will first see, it will ask a set of questions from which it will decide how to move forward.

These questions are:
- `"What sorting method/s should this program use (Bubblesort/ Quicksort/ Treesort/ All Three)"`
- `"What array type/s should this program use (Array/ ArrayList/ Both)"`
- `"Should time taken to run each sort be taken and displayed"`
- `"What size of Array/Arraylist should the randomly generated list have"`

Following which the `SortLoop` will take these anwsers and run the respective lines of code to display the randomly generated list of numbers, and then the sorted variant of that list respective to each different sort type.
There is also an option to Quit the program at anytime during the User Interface method by typing in `"q"`.

Additionally a logfile exists inside the Root Directory of the program that logs particular events, such as a successful run of the method `UserInput` and the `Main` method.
