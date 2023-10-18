items = {
    "Toothpaste": 10.0,
    "Wheat": 15.0,
    "Rice": 20.0,
    "Cola": 25.0,
    "Milk": 30.0,
    "Bread": 35.0,
    "Butter": 40.0,
    "Eggs": 45.0,
    "Chicken": 50.0,
    "Apples": 55.0,
    "Oranges": 60.0,
    "Bananas": 65.0,
    "Tomatoes": 70.0,
    "Potatoes": 75.0,
    "Carrots": 80.0,
    "Cucumbers": 85.0,
    "Onions": 90.0,
    "Cheese": 95.0,
    "Ham": 100.0,
    "Bacon": 105.0,
    "Shampoo": 110.0,
    "Soap": 115.0,
    "Toilet Paper": 120.0,
    "Towels": 125.0,
    "Napkins": 130.0,
    "Laptop": 135.0,
    "Printer": 140.0,
    "Smartphone": 145.0,
    "Headphones": 150.0,
    "Charger": 155.0,
}
bill_items = []
bill_prices = []
print("Welcome to the General Store")
print("Available Items:")
for item, price in items.items():
    print(f"{item}: Rs. {price:.2f}")
while True:
    user_choice = input("Enter the name of the item you want to purchase (or 'done' to finish): ")
    if user_choice == "done":
        break
    elif user_choice in items:
        try:
            quantity = int(input(f"How many units of '{user_choice}' would you like to purchase: "))
            if quantity <= 0:
                print("Please enter a valid quantity.")
                continue
        except ValueError:
            print("Please enter a valid quantity.")
            continue
        bill_items.append(user_choice)
        bill_prices.append(items[user_choice] * quantity)
    else:
        print("Item not found. Please choose from the list of available items.")
total_amount = sum(bill_prices)
print("\n----- Bill -----")
for item, price in zip(bill_items, bill_prices):
    print(f"{item} x{quantity}: Rs. {price:.2f}")
print(f"Total Amount: Rs. {total_amount:.2f}")
print("Thank you for shopping with us!")