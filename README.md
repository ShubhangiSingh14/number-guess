# Number Guess

A simple Java console-based number guessing game where the computer randomly picks a number between **1 and 100**, and the player has **10 attempts** to guess it correctly.

## How It Works

1. The program randomly generates a number between **1 and 100**.  
2. You get **10 attempts** to guess the number.  
3. After each guess:
   - If your guess is **too low**, the program tells you.
   - If your guess is **too high**, the program tells you.
   - If you guess correctly, it congratulates you and shows how many tries it took.
4. If you run out of tries, the program reveals the correct number.

## 🧩 Example Output

I'm thinking of a number between 1 and 100.
Enter your guess (10 tries left): 50
Too low!
Enter your guess (9 tries left): 75
Too high!
Enter your guess (8 tries left): 62
🎉 Correct in 3 tries!

## ⚙️ How to Run

# Option 1 —  From Command Line
1. Make sure you have **Java 8 or higher** installed.
2. Clone the repository:
    git clone https://github.com/<your-username>/number-guess.git
3. Navigate to the project directory:
     cd number-guess
4. Compile the Java file:
     javac NumberGuess.java
5. Run the program:
     java NumberGuess

# Option 2 - In Eclipse (Recommended)
1. Download or clone this repository.
2. Open Eclipse → File → Import → Existing Projects into Workspace.
3. Run 'NumberGuess.java'.

##💡 Features

Random number generation between 1 and 100
Limited attempts (10 tries)
Hints for each guess (too high / too low)
Simple, clean Java code

##🚀 Future Improvements

Add difficulty levels (easy, medium, hard)
Track and display player scores
Create a GUI version with Swing or JavaFX

##📜 License

This project is for learning purposes.


##👨‍💻 Author: Shubhangi Singh


