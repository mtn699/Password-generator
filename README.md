# Password-generator
1) Objective

The primary objective of this project is to:

Provide a random password generator for users.

Allow users to specify the password length.

Offer options to include alphabets, numbers, and special characters in the password.

Display the generated password to the user.

2) Technologies Used
   
Backend: Java, Spring Boot

Frontend: HTML, CSS, JavaScript

Build Tool: Gradle

Database (Optional for storing passwords): PostgreSQL/MySQL

3) Project Modules
   
A) Backend (Spring Boot)

The backend is responsible for generating the random password and handling user requests. It consists of:

*Controller Layer (PasswordController.java)

Handles HTTP requests and sends responses to the frontend.

Exposes an endpoint to generate the password.

*Service Layer (PasswordService.java)

Contains the logic for generating a random password based on user inputs.

*Model Layer (PasswordRequest.java)

Represents user preferences (length, character types).

B)Frontend (HTML, CSS, JavaScript)

The frontend provides an interactive UI where users can:

Enter the password length

Select checkboxes for including alphabets, numbers, and special characters

Click a Generate Password button to display the generated password

4)Working of the Project

*User Input:

The user enters the desired password length.

The user selects options (alphabets, numbers, special characters).

Request Processing (Backend):

The backend service receives the user input and generates a random password based on the selected criteria.

5)Password Generation Logic:

Uses Java’s Random or SecureRandom class to generate a random string.

Includes selected character types (alphabets, numbers, special characters).

*Display Output:

The generated password is sent to the frontend and displayed on the webpage.

6)Assumptions and Considerations

The password must be at least 4 characters long for security.

The user must select at least one option (alphabets, numbers, or special characters).

The password is not stored anywhere for security reasons.

7)Future Enhancements

Password strength indicator (weak, medium, strong)

Copy to clipboard button

Integration with a user authentication system

Mobile-friendly UI using Bootstrap

8)Conclusion
This project demonstrates the implementation of a simple yet powerful password generator using Java and Spring Boot. It allows users to create strong passwords dynamically based on their preferences. The project can be further enhanced with additional features to improve user experience and security.
