Of course. You've built an excellent project, and a professional `README.md` file is the perfect way to showcase your work. Based on the fantastic "EduConnect" example you provided, here is a complete, detailed README file tailored specifically for your **Prescription Management System**.

You just need to **copy and paste this entire block of text** into the `README.md` file in your GitHub repository. Then, you will replace the placeholder sections (like screenshots) with your own images.

---

# Prescription Management System: A Full-Stack Web Application
A secure and efficient web application for generating and managing medical prescriptions, built with **Java, Spring Boot, Spring Security, JPA, and Thymeleaf**. This project was developed as a technical skills assessment for CMED Health Ltd.

# 🔍 Overview
The Prescription Management System is a complete web application designed to provide authenticated users with a secure platform for all prescription-related tasks. It follows the MVC (Model-View-Controller) architecture and demonstrates proficiency in modern Java web development, including data persistence, security, and REST API integration.

## ER Diagram
*An ER Diagram would illustrate the relationship between the `Prescription` entity and a potential `User` entity for authentication. The core entity is `PRESCRIPTION`.*

*(**Action:** You can generate an ER diagram from your IDE or an online tool and place the image here.)*

## Database Schema
The primary table in the database is the `PRESCRIPTION` table, which has the following structure:

| Column Name | Data Type | Constraints | Description |
| :--- | :--- | :--- | :--- |
| `ID` | `BIGINT` | `Primary Key`, `Auto-increment` | Unique identifier for each prescription |
| `PRESCRIPTION_DATE`| `DATE` | `NOT NULL` | The date the prescription was issued |
| `PATIENT_NAME` | `VARCHAR(255)` | `NOT NULL` | Full name of the patient |
| `PATIENT_AGE` | `INTEGER` | `NOT NULL` | Age of the patient |
| `PATIENT_GENDER` | `VARCHAR(255)` | `NOT NULL` | Gender of the patient |
| `DIAGNOSIS` | `VARCHAR(1000)`| | Medical diagnosis |
| `MEDICINES` | `VARCHAR(1000)`| | Prescribed medicines |
| `NEXT_VISIT_DATE`| `DATE` | | Optional date for the next follow-up |

# 🚀 Key Features
- 🔐 **Secure Authentication:** Built with Spring Security to ensure only logged-in users can access the system.
- 📋 **Dynamic Prescription Dashboard:** View a list of all prescriptions with an interactive date-range filter.
- ✍️ **Full CRUD Functionality:** Easily Create, Read, Update, and Delete prescription records.
- ✅ **Server & Client-Side Validation:** Robust form validation to ensure data integrity and a smooth user experience.
- 📊 **Insightful Daily Reports:** A dedicated page showing a day-wise count of all prescriptions generated.
- 🔄 **REST API:** A `GET /api/v1/prescription` endpoint to fetch all prescription data in JSON format.
- 💊 **External API Integration:** Consumes the RxNav REST API to display drug interaction information on a dedicated page.
- 📄 **API Documentation:** Integrated Swagger UI for interactive and clear API documentation.
- ✨ **User-Friendly UI:** A clean, responsive, and intuitive user interface built with HTML, CSS, and Bootstrap.

# 👤 User Roles
The system has one primary role for standard users.

## 🧑‍⚕️ Authenticated User
- View the dashboard with a list of prescriptions.
- Filter prescriptions by a specific date range.
- Create new prescriptions with complete validation.
- Edit existing prescription details.
- Delete prescriptions with a confirmation prompt.
- View the daily prescription count report.
- Access the drug interaction page.

# 🛠️ Technology Stack
- **Backend:** Java 21, Spring Boot, Spring Security, Spring Data JPA, Hibernate
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript, Bootstrap
- **Database:** H2 (for local development), PostgreSQL (for production)
- **Build Tool:** Maven
- **API Documentation:** SpringDoc (Swagger UI)

# ⚙️ How to Run Locally

### Prerequisites
- Java JDK 21 or later
- Apache Maven
- Git

### Steps
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/Ajij120386/CMED_Assessment.git
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd CMED_Assessment
    ```
3.  **Run the application using the Maven wrapper:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Access the application:**
    -   **Web App:** Open your browser and go to `http://localhost:8080`
    -   **Login Credentials:** Use `user` / `password`
    -   **H2 Database Console:** `http://localhost:8080/h2-console` (Use JDBC URL: `jdbc:h2:mem:testdb`)
    -   **API Documentation:** `http://localhost:8080/swagger-ui.html`

# 📸 Screenshots

*(**Action:** Add your own screenshots in the sections below. This makes your project look very professional!)*

## ✅ Login Page
*(Image of your login screen)*

## ✅ Prescription Dashboard
*(Image of the main dashboard showing the table of prescriptions and the date filter)*

## ✅ New / Edit Prescription Form
*(Image of the form for creating a new prescription, preferably showing a validation error message)*

## ✅ Daily Prescription Report
*(Image of the `/report` page showing the table with day-wise counts)*

## ✅ Swagger API Documentation
*(Image of the `/swagger-ui.html` page showing your REST endpoint)*

## ✅ Drug Interaction Page
*(Image of the `/interactions` page showing the table of data from the external API)*

## ✅ H2 Database Console
*(Image of the H2 Console showing the PRESCRIPTION table with some data in it)*

# 👨‍💻 Author
- **[Mohammad Ajij](https://github.com/Ajij120386)**
