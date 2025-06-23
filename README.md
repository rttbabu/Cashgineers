# Bank Dashboard

## Overview
This project is a bank dashboard application that provides users with an interface to manage their banking activities. It consists of a frontend built with HTML, CSS, and JavaScript, and a backend developed in Java with a MySQL database.

## Project Structure
```
bank-dashboard
├── frontend
│   ├── index.html         # Main HTML document for the bank dashboard
│   ├── styles             # Directory for CSS styles
│   │   └── style.css      # Styles for the bank dashboard
│   └── scripts            # Directory for JavaScript files
│       └── app.js         # JavaScript code for user interactions
├── backend
│   ├── src                # Source code for the backend application
│   │   ├── Main.java      # Entry point for the Java backend application
│   │   ├── controllers     # Directory for controller classes
│   │   │   └── DashboardController.java # Handles requests related to the dashboard
│   │   ├── models         # Directory for model classes
│   │   │   └── User.java  # Represents the user entity
│   │   └── services       # Directory for service classes
│   │       └── UserService.java # Contains business logic for user operations
│   └── resources          # Directory for configuration files
│       └── application.properties # Configuration settings for the Java application
├── sql                    # Directory for SQL scripts
│   └── schema.sql        # SQL statements for creating the database schema
└── README.md             # Documentation for the project
```

## Setup Instructions
1. **Frontend Setup:**
   - Open the `frontend/index.html` file in a web browser to view the dashboard.
   - Ensure that the `styles/style.css` and `scripts/app.js` files are correctly linked in the HTML.

2. **Backend Setup:**
   - Navigate to the `backend/src` directory.
   - Compile the Java files and run `Main.java` to start the backend server.
   - Ensure that the database is set up according to the `sql/schema.sql` file.

3. **Database Configuration:**
   - Update the `backend/resources/application.properties` file with your database connection details.

## Usage Guidelines
- Users can log in to view their account details and transaction history.
- The dashboard provides options to manage user information and perform banking operations.

## Contributing
Feel free to contribute to this project by submitting issues or pull requests.