# Collect number from user
decimal_number = int(input("Enter a number: "))

# Check if number is 0

is_negative = decimal_number < 0
if is_negative:
    decimal_number = abs(decimal_number)

# Check if number is zero
# Create variable to hold result

binary_number = ''
if decimal_number == 0:
    binary_number = '0'

# Convert number to binary
while decimal_number > 0:
    binary_number = str(decimal_number % 2) + binary_number
    decimal_number = decimal_number// 2
    

# If original number is negative, convert to negative
if is_negative:
    binary_number = "-" + binary_number

print(binary_number)
