import random

# The Tic-Tac-Toe board
board = [[' ' for _ in range(3)] for _ in range(3)]

# Function to display the Tic-Tac-Toe board
def display_board(board):
    for row in board:
        print('|'.join(row))
        print('-' * 5)

# Function to check if the board is full
def is_board_full(board):
    return all(cell != ' ' for row in board for cell in row)

# Function to check if a player has won
def check_win(board, player):
    # Check rows, columns, and diagonals
    for i in range(3):
        if all(board[i][j] == player for j in range(3)) or all(board[j][i] == player for j in range(3)):
            return True
    if all(board[i][i] == player for i in range(3)) or all(board[i][2 - i] == player for i in range(3)):
        return True
    return False

# Minimax function with alpha-beta pruning
def minimax(board, depth, is_maximizing):
    if check_win(board, 'X'):
        return -1
    if check_win(board, 'O'):
        return 1
    if is_board_full(board):
        return 0

    if is_maximizing:
        best_score = -float('inf')
        for i in range(3):
            for j in range(3):
                if board[i][j] == ' ':
                    board[i][j] = 'O'
                    score = minimax(board, depth + 1, False)
                    board[i][j] = ' '
                    best_score = max(score, best_score)
        return best_score
    else:
        best_score = float('inf')
        for i in range(3):
            for j in range(3):
                if board[i][j] == ' ':
                    board[i][j] = 'X'
                    score = minimax(board, depth + 1, True)
                    board[i][j] = ' '
                    best_score = min(score, best_score)
        return best_score

# Function to find the best move for the AI
def find_best_move(board):
    best_move = None
    best_score = -float('inf')
    for i in range(3):
        for j in range(3):
            if board[i][j] == ' ':
                board[i][j] = 'O'
                score = minimax(board, 0, False)
                board[i][j] = ' '
                if score > best_score:
                    best_score = score
                    best_move = (i, j)
    return best_move

# Main game loop
while True:
    display_board(board)

    # Player's move
    row, col = map(int, input("Enter your move (row and column): ").split())
    if board[row][col] == ' ':
        board[row][col] = 'X'
    else:
        print("Invalid move. Try again.")
        continue

    if check_win(board, 'X'):
        display_board(board)
        print("You win!")
        break

    if is_board_full(board):
        display_board(board)
        print("It's a draw!")
        break

    # AI's move
    ai_move = find_best_move(board)
    board[ai_move[0]][ai_move[1]] = 'O'

    if check_win(board, 'O'):
        display_board(board)
        print("AI wins!")
        break

    if is_board_full(board):
        display_board(board)
        print("It's a draw!")
        break
