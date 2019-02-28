# JAVA-Guessing-Game-Program-and-Number-Range-Program

Guessing Game
For the first program (Guessing Game), the program chooses a random secret number that is stored within its code. The program will then ask the user to guess a number in the range of 1 to 100. If the users guessed number is different from the choses number then the program will output a message that corresponds with users guess. The message will either say the guess is too high or too low. These hints will allow the user to guess again and again until their guess matches the programs chose number. In the midst of all these guess, the program keeps a numerical count of each guess and tallies them up. Once the correct number is guessed, the program then outputs a message of congratulations to the user along with a message with a total number of guesses. 
The output of the following program is below: 

I'm thinking of a number between 1 and 100 ...
Please guess a number: 50
50 is too high.
Please guess a number: 25
25 is too low.
Please guess a number: 30
30 is too high.
Please guess a number: 27
Congratulations! You guessed the number in 4 guess(es)!



Number Range
For this second program (Number Range), the program will read a file named "range.txt". To import this file to be read, the program will use Java's scanner utility. This text file contains a list of scores from students within the range of 0 to 200. This file will be attached. The first number within this file represents the total number of scores and should not be read and should not be included in the range of numbers. After skipping over this number, the program will then read the remaining numbers. This ranges are as followed: 0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200. Once calculated, the program will then output the total scores within each range. 
The output of the following program is below: 

Within "range.txt":
26
76 89 150 135 200 76 12 100 150 28 178 189 167 200 175 150 87 99 129
149 176 200 87 35 157 189

[0 - 24]: 1
[25 - 49]: 2
[50 - 74]: 0
[75 - 99]: 6
[100 - 124]: 1
[125 - 149]: 3
[150 - 174]: 5
[175 - 200]: 8
