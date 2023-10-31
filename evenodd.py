def print_even_odd_chars(string, index=0, even=True):
	# Recursive function to print even and 
	# odd index characters of the string
	if index >= len(string):
		return

	if even and index % 2 == 0:
		print(string[index], end=' ')
	elif not even and index % 2 != 0:
		print(string[index], end=' ')

	print_even_odd_chars(string, index + 1, even)

if __name__ == "__main__":
	input_string = "Geeksforgeeks!"
	print("Even Index Characters:")
	print_even_odd_chars(input_string, even=True)
	print("\nOdd Index Characters:")
	print_even_odd_chars(input_string, even=False)
