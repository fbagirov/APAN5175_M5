This is a repository for Week 6 in-class lab. 

Create a package (optional) and keep classes in the same folder.

The goal is to build a parent+children class hierarchy. 
Each student will be assigned one class from which they will have to implement inheritance, method overriding and runtime polymorphism in Java. 

You must have:

1 superclass (parent) with at least 2 fields and 2 methods

2+ subclasses that override at least one method

A Main class that demonstrates polymorphism using a parent reference:

Parent x = new Child();

call an overridden method and show it resolves at runtime

Use @Override for every overridden method.

Add one toString() override somewhere (parent or child) to make output readable.


# Student 1 - Zoo Animals (Animal > Dog/Cat)

## Build
- Animal (parent): fields name, age
    - methods: makeSound(), eat()
- Dog extends Animal: field breed
    - override makeSound()
- Cat extends Animal: field indoor (boolean)
    - override makeSound()

## Requirements

- Animal has a constructor (String name, int age)
- Each child calls super(name, age)
- In Main, store animals in an ArrayList<Animal> and loop:
    - call makeSound() for each

## Output goal (example)
- “Dog barks!”
- “Cat purrs!”

# Student 2 - Payments

## Build
- Payment (parent): fields amount, currency
    - methods: process(), getFee()
- CreditCardPayment extends Payment: field last4
    - override getFee() (e.g., 2.9% + 0.30)
    - override process()
- CryptoPayment extends Payment: field network
    - override getFee() (flat network fee)
    - override process()

## Requirements
- process() prints: amount, fee, net charged
- In Main: Payment p = new CreditCardPayment(...) and Payment q = new CryptoPayment(...)
- Call process() and show different behavior at runtime


# Student 3 - Vehicles

## Build 

Vehicle (parent): fields make, speed
    - methods: startEngine(), honk()
- Car extends Vehicle: field doors
    - override honk() (car-style honk)
- Motorcycle extends Vehicle: field hasSidecar
    - override honk() (bike-style beep)

## Requirements
- Add method accelerate(int delta) in parent (updates speed)
- In Main, create Vehicle[] with a Car and Motorcycle
- Loop and call: startEngine(), accelerate(10), honk()


# Student 4 - Employees

## Build
- Employee (parent): fields name, baseSalary
    - methods: calculatePay(), work()
- Developer extends Employee: field overtimeHours
    - override calculatePay() (base + overtime*rate)
    - override work()
- Manager extends Employee: field bonus
    - override calculatePay() (base + bonus)
    - override work()

## Requirements

- In Main: ArrayList<Employee> with one of each
- Print each employee’s pay using calculatePay()
- Show work() differs by runtime type


# Student 5 - Shapes

## Build
- Shape (parent): field color
    - methods: area(), draw()
- Circle extends Shape: field radius
    - override area()
    - override draw() (prints “Drawing a Circle…”)
- Rectangle extends Shape: fields width, height
    - override area()
    - override draw()

## Requirements

- area() returns double
- In Main: Shape s1 = new Circle(...), Shape s2 = new Rectangle(...)
- Loop through shapes and print: draw() + area()

Student 6 - Library

## Build

- LibraryItem (parent): fields title, isCheckedOut
    - methods: checkOut(), returnItem(), getLoanPeriodDays()
- Book extends LibraryItem: field author
    - override getLoanPeriodDays() (e.g., 21)
- DVD extends LibraryItem: field durationMinutes
    - override getLoanPeriodDays() (e.g., 7)

## Requirements

- In Main, create LibraryItem references to Book and DVD
- Print loan period days for each
- Demonstrate checkOut/return behavior (shared logic in parent)

## Student 7 - Notifications

## Build

- Notification (parent): field recipient
    - methods: send(String message), getChannelName()
- EmailNotification extends Notification: field subject
    - override send()
    - override getChannelName() (“Email”)
- SMSNotification extends Notification: field carrier
    - override send()
    - override getChannelName() (“SMS”)

## Requirements
- In Main: Notification n = new EmailNotification(...) and Notification m = new SMSNotification(...)
- Put them in a list and loop:
    - print channel name + send message
- Ensure overridden send() prints channel-specific formatting