
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
<img width="1920" height="817" alt="image" src="https://github.com/user-attachments/assets/24fd8065-315c-4c8d-9e6e-a76f89caad96" />


## ✅ Prescription Dashboard

<img width="1920" height="820" alt="image" src="https://github.com/user-attachments/assets/9bfbb17d-11e1-4c22-892e-64d75edc3cb4" />


## ✅ Create New Prescription Form
<img width="1920" height="829" alt="image" src="https://github.com/user-attachments/assets/c19264d8-d77e-4361-889a-aa49e26cac51" />

## ✅ Edit Prescription Form

<img width="1920" height="822" alt="image" src="https://github.com/user-attachments/assets/8021e6c9-6e70-43f6-958e-cd7f5c5e42ef" />

## ✅ Daily Prescription Report

<img width="1920" height="827" alt="Google AI Studio - Google Chrome 11_8_2025 1_17_35 PM" src="https://github.com/user-attachments/assets/4057705c-764f-463a-a10b-6787a1536d06" />


## ✅  API Documentation
<img width="1920" height="945" alt="image" src="https://github.com/user-attachments/assets/be676564-2ac5-43e5-8906-a1e5c0b730a6" />




## ✅ H2 Database Console
<img width="1920" height="956" alt="image" src="https://github.com/user-attachments/assets/b7ef0380-6873-47d2-a3a3-0690e1f8528e" />


# 👨‍💻 Author
- **[Mohammad Ajij](https://github.com/Ajij120386)**
