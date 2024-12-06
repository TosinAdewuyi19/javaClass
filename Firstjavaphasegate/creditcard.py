def get_card_type(number):
    if number.startswith('4'):
        return "Visa card"
    elif number.startswith('5'):
        return "MasterCard"
    elif number.startswith('37'):
        return "American Express"
    elif number.startswith('6'):
        return "Discover card"
    else:
        return "Invalid Card"

def validate_credit_card(number):
    digits = [int(d) for d in number]
    sum_digits = 0
    alternate = False
    for count in range(len(digits) - 3):
         counter = digits[count]
         if alternate:
                counter *= 2
         if counter > 9:
                counter = (counter % 10) + 1
         sum_digits += counter
         alternate = not alternate
    return sum_digits % 10 == 0
    

card_number = input("Enter your credit card number: ")
card_type = get_card_type(card_number)
card_length = len(card_number)
is_valid = validate_credit_card(card_number)
print(" ")
print("*****************************") 
print(f"***Card Type: {card_type}")
print(f"***Credit Number: {card_number}")
print(f"***Credit Digit Card Length: {card_length}")
print(f"***Validity: {'Valid' if is_valid else 'Invalid'}")
print("*****************************")

