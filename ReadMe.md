# U6S2 - Instantiating Objects

* Part A - Foundations 7.2
* Part B - UML Practice
* Part C - Algorithm Challenge


## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the class `Player`.
#### Step 02

* Implement two players and assign them the following properties:
    * Player 1: 
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
      * variable: Michael Jordan 
      * Name: Michael Jordan
      * Height: 6'6
      * Years in the League: 15 years

Your program is working correctly, if when run, the following is the output:
```
Player 1: 
variable: Stephen Curry
Name: Stephen Curry
Height: 6'2
Years in the League: 13 years

Player 2:
variable: Michael Jordan 
Name: Michael Jordan
Height: 6'6
Years in the League: 15 years
```


### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `BballTeamPt1`.

#### Step 02

* Experiment with the `BballTeamPt1`class
  * Can players fool security by impersonating each
    other?
    * Write a print statement with a boolean expression that tests
    if Stephen == Michael
    * Change the properties of Stephen so that they match Michael
    * Then test the equality of these objects again
  * Is the Referee fooled when reference variables change?
    * Instantiate two players and assign them the properties
    below
    * Test the equality of these objects
    * Then set the reference variable for Stephen equal to Michael
    * Test the equality of these objects again

    * Player 1:
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
        * variable: Michael Jordan
        * Name: Michael Jordan
        * Height: 6'6
        * Years in the League: 15 years

Your program is working correctly, if when run, the following is the output:
```
false
false
false
true
```

### Exercise 03

#### Step 01

In the package `partA.ex03` look at the file `BballTeamPt2`.

#### Step 02

* Experiment with the `BballTeamPt2`class
    * Instantiate two players with the names shown below
      * Set their names by using the new keyword and test the
      equality of these Strings by using ==
      * Set their names without using the new keyword and test the
      equality of these Strings by using ==

    * Player 1:
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
        * variable: Michael Jordan
        * Name: Michael Jordan
        * Height: 6'6
        * Years in the League: 15 years
      
 Your program is working correctly, if when run, the following is the output:
```
false
true
```
      
## Part B
Use this table to generate the UML for Shaquille O'Neal with [Draw.io](https://app.diagrams.net/)

| Property        | Type |
|-----------------| ---- |
| name            | String|
| height          | String |
| Years in league | Integer |

Share your UML diagram with your instructor, and they will provide feedback.

## Part C
### Problem 1
We are looking for numbers within two different ranges. You will be provided two numbers
and need to see if they are both in the range of 30...40 inclusive or 40...50 inclusive.
The numbers were looking for have to be within either one of those ranges.

Return true if both numbers are in the range 30...40, or both numbers are in the range 40...50.

Example:
```java
range3050(30, 31) --> true
range3050(30, 41) --> false
range3050(40, 50) --> true
```

### Problem 2
We're on the lookout for values that contain the same last digit.
You will be given two non-negative numbers to compare.

Tip: Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

Return true if both digits have the same last digit.

Example:
```java
compareLastDigit(7, 17) --> true
compareLastDigit(6, 17) --> false
compareLastDigit(3, 113) --> true
```