# E-Commerce System Simulation - OOP Project 🛒
This project was developed for the CSE 1126 Object-Oriented Programming (OOP) course at Manisa Celal Bayar University - Computer Engineering Department. It is a Java-based simulation of an E-Commerce System designed to demonstrate the core principles of Object-Oriented Programming (OOP) by managing the complex interactions between users, products, credit cards, and orders within a controlled console environment.
# 🏗️ System Architecture
The project is structured around several key classes that interact to simulate a real-world shopping experience:
* **User Class:** Manages personal information, multiple delivery addresses (Home/Work), and maintains lists of favorite products and order history.

* **Product Class:** Handles product details including categories, pricing, and a dynamic stock management system that prevents overselling.

* **Order Class:** Acts as the bridge between a User and a Product. It handles the transaction logic, including payment confirmation and stock reduction.

* **CreditCard Class:** Securely manages payment information required for processing orders.
# ✨ Key Features
* **Dynamic Stock Management:** When an order is placed, the system automatically checks availability and reduces the numberOfStocks. It prevents orders if the requested quantity exceeds the current stock.

* **User Profile Management:** Users can view their full profile, which includes a history of ordered products, a list of favorite items, and saved credit cards.

* **Flexible Ordering:** Supports ordering products with specific quantities to different saved addresses (Home or Work).

* **Input-Driven Transactions:** Uses a confirmation prompt (YES/NO) before finalizing any order, simulating a real checkout process.
# 🚀 Technical Implementation
* **Language:** Java

* **Collections:** Utilizes ArrayList for dynamic storage of user favorites, orders, and credit cards.

* **OOP Principles:** Extensive use of Encapsulation (private fields with getters/setters) and Composition (Order class composing User, Product, and CreditCard).
# How to Run
1. Clone this repository: git clone https://github.com/feyza-ozdemir/E-Commerce-System-Java.git

2. Open the project in your favorite Java IDE (e.g., Apache NetBeans, IntelliJ, or VS Code).

3. Locate and run the Test.java file.

4. The system will execute a pre-defined test scenario demonstrating multiple user interactions and stock updates in the console.
# Contributors
This project was developed as a collaborative effort by:
* Feyza Özdemir - [GitHub](https://github.com/feyza-ozdemir)
* Melda Güngör - [GitHub](github.com/meldag006)
* Kübra Temur - [GitHub](github.com/kubratmr)