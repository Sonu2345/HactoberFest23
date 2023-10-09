import random

def computer_guess_number():
    low = 1
    high = 100
    user_number = int(input(f"Think of a number between {low} and {high}, and I will try to guess it. Press Enter when you're ready."))
    
    attempts = 0
    while True:
        computer_guess = random.randint(low, high)
        print(f"My guess is: {computer_guess}")
        attempts += 1

        if computer_guess == user_number:
            print(f"I guessed it! The number is {computer_guess}. It took me {attempts} attempts.")
            break
        elif computer_guess < user_number:
            print("My guess is too low.")
            low = computer_guess + 1
        else:
            print("My guess is too high.")
            high = computer_guess - 1

if __name__ == "__main__":
    computer_guess_number()
