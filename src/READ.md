##Write the generic RandomDrawing class. This class must implement the
##RandomDrawingInterface (provided).

The class should allow the user to specify whether or not the 
drawing should allow duplicate objects.
    Example: there might be a lottery where the same person can enter 
    more than once (duplicate entries).
    Example: there might be a contest that each player can 
    only enter once (duplicate entries not allowed). 
    
You can support this functionality by adding a boolean variable to the constructor.

You can decide on the internal data structure (e.g., an array, a list, set, etc.).
    Consider efficiency!
    
The interface contains descriptions of the methods. 
    Make sure your methods align with the descriptions in the interface.
    In particular, make sure the displayEntries() method has 
        the required output/return value.
        
You can add additional methods if you choose.


Requirements for the RandomDrawing class:

(10 points) complete class header using generics
(10 points) one or more constructor 
(10 points) boolean addEntry(T)
    Account for whether or not there are duplicates
    Return false if the entry is not added (for example, if the drawing does not 
    allow duplicates and a duplicate is sent in as a parameter)
(15 points) T selectWinner(boolean)
Randomly select a winner.
    The boolean parameter indicates whether the winner 
    should be removed from the drawing (true) or selected 
    but left in the drawing (false).
(10 points) void displayEntries() 
(5 points) int size()

(15 points) Code Design 
Follow naming conventions and other Java coding conventions and good programming practices.
Use constants when appropriate or useful.
Properly indent and format your code.
Reduce repeated or duplicated code.
Write helper methods when it will help clarify the code or reduce repeated code.
Account for special situations (e.g., an empty drawing) and take a logical action.

Part 2: Add a Generic Method to the Driver Program (25 points)

(20 points) Write a static generic method in the driver program to 
pick multiple unique winners from a RandomDrawingInterface that does allow duplicates. 
The winners should be removed from the drawing.

Method Specifications:
The method should declare a generic type.
The return type is a List that contains the generic type (List<T>)
The parameters are: a RandomDrawingInterface<T> object and the number of winners.
The method should not alter the RandomDrawingInterface passed in as a parameter other than by removing that number of winners.
The method should not use any methods other than those in the RandomDrawingInterface.
If you created additional methods in your class, you cannot use them for this method.
For full credit:
The method should take some logical action if there aren't enough entries in the drawing to select the specified number of unique winners. You can decide what that action is.
(5 points) This method should be efficient, meaning O(n).