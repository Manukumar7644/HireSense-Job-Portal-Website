# 🚀 HireSense – Smart Job Portal Web Application

HireSense is a full-stack Job Portal Web Application built using **Java, JSP, Servlets, JDBC, MySQL, and Bootstrap**.

It provides a complete recruitment platform where employers can post jobs, manage applicants, and job seekers can search, apply, and track their applications seamlessly.

## ✨ Features

* 👨‍💼 Employers can post and manage job openings
* 👩‍💻 Job seekers can search and apply for jobs
* 📄 Resume upload and application tracking
* 📧 Automatic email notifications using JavaMail API
* 🧠 Smart resume matching and job-fit score calculation
* 🔐 Secure role-based authentication and authorization

---

# 🛠️ Tech Stack

## 🔹 Backend

* Java
* JSP & Servlets
* JDBC
* MySQL
* Apache Tomcat

## 🔹 Frontend

* HTML5
* CSS3
* Bootstrap 5
* JavaScript

## 🔹 Tools & Utilities

* Eclipse IDE
* Git & GitHub
* JavaMail API

---

# 👨‍💼 Employer Features

* Employer Registration & Login
* Post New Jobs
* Edit & Delete Job Posts
* View Applicants
* Filter Applications (Applied / Shortlisted / Rejected)
* Shortlist or Reject Candidates
* Automatic Email Notifications on Status Updates

---

# 👩‍💻 Job Seeker Features

* User Registration & Login
* Resume Upload
* Search & Apply for Jobs
* Track Applied Jobs
* Receive Email Notifications for:

  * Registration OTP
  * Password Reset OTP
  * Application Confirmation
  * Shortlisting
  * Rejection

---

# 🧠 Smart Resume Matching

* Resume Parsing
* Skill Extraction
* Job-Fit Score Calculation
* Candidate Ranking Based on Match Score

---

# 📨 Email Notification System

Integrated **JavaMail API** to send:

* Registration OTP
* Password Reset OTP
* Application Confirmation
* Application Status Updates
* Employer Notification for New Applications

---

# ⚙️ Backend Architecture

* MVC Architecture
* Layered Design (Servlet → Service → DAO → Database)
* JDBC-Based Database Connectivity
* Session-Based Authentication
* Role-Based Authorization
* Modular Code Structure

---

# 📂 Project Modules

* Authentication Module
* Employer Module
* Job Seeker Module
* Job Management Module
* Resume Management Module
* Resume Matching Engine
* Email Notification Module

---

# 🗃️ Database Tables

* users
* jobs
* applications
* resume_analysis_logs

---

# 🔒 Security Features

* Session-Based Authentication
* Role-Based Access Control (Employer / Job Seeker)
* Input Validation
* Secure Email Authentication

---

# 🚀 How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/HireSense.git
```

### 2️⃣ Import the Project

Import the project into **Eclipse IDE**.

### 3️⃣ Configure the Project

Update the following configuration files:

* Database connection in `DBConnection.java`
* Email credentials in `MailConfig.java`

### 4️⃣ Deploy the Application

Deploy the project on **Apache Tomcat Server**.

### 5️⃣ Open in Browser

```text
http://localhost:8080/HireSense
```

---

# 📸 Project Screenshots

> Add screenshots of your application here.

Example:

```text
screenshots/
├── home.png
├── login.png
├── employer-dashboard.png
├── job-list.png
├── apply-job.png
├── admin-dashboard.png
```

---

# 📌 Future Improvements

* 📅 Interview Scheduling System
* 📊 Admin Analytics Dashboard
* 🔔 In-App Notification System
* 📄 Resume Update Management
* ☁️ Cloud Deployment (AWS / Azure)

---

# 👨‍💻 Developed By

**Manu Kumar**

**B.Tech – Computer Science & Engineering**

⭐ If you found this project useful, consider giving it a **Star** on GitHub!
