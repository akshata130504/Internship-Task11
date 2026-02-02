# Internship-Task11

# 📁 Java Developer Internship – Task 11  
## File Handling – User Data Storage System


## 📌 Task Objective
The objective of this task is to build a **console-based User Data Storage System** using Java **File Handling**.  
The application allows users to enter personal details, stores them permanently in a text file, and retrieves the stored data using Java IO classes.


## 🛠 Tools Used
- **IDE:** IntelliJ IDEA / Eclipse  
- **Language:** Java  
- **Libraries:** Java IO (File, FileWriter, BufferedWriter, FileReader, BufferedReader)  
- **JDK Version:** Java 17 / Java 21  


## 📂 Project Structure
Java-Internship-Task-11
│
├── src
│ └── UserDataApp.java
│
├── user_data.txt
└── README.md


## 🧩 Features Implemented
- Accepted user details (Name, Email, Phone) through console input
- Stored user data permanently in a **text file**
- Used **FileWriter with append mode** to avoid overwriting data
- Retrieved stored data using **FileReader and BufferedReader**
- Automatically created the file if it did not exist
- Structured data in a **readable format**
- Implemented **exception handling** for IO errors
- Properly closed file resources to prevent memory leaks


## ▶️ How to Compile and Run
Open terminal / command prompt in the `src` directory and run:

    ```bash
    javac UserDataApp.java
    java UserDataApp
    
## 💻 Sample Console Output

Enter Name: Akshu

Enter Email: akshu@gmail.com

Enter Phone Number: 9876543210

User data saved successfully.

--- Stored User Records ---

Name: Akshu

Email: akshu@gmail.com

Phone: 9876543210

---------------------------

## 🧠 Key Concepts Demonstrated

🔹 FileReader vs BufferedReader

BufferedReader improves performance by reading data in chunks instead of character by character.

🔹 Why Buffering Improves Performance

Reduces the number of disk access operations, making file reading faster.

🔹 IOException

Handles input/output related errors such as file not found or permission issues.

🔹 IO vs NIO

IO: Stream-based and blocking

NIO: Buffer-based and non-blocking (more efficient)

🔹 Resource Management

Resources are closed properly to avoid memory leaks.

## 🎯 Learning Outcomes

Understood Java file handling concepts

Learned to store and retrieve data using IO streams

Implemented append mode for persistent storage

Practiced exception handling for IO operations

Improved understanding of resource management
