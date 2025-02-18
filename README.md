# 🛍️ CRUD Bulking Product
> A Spring Boot CRUD application for managing bulk product prices and inventory

![Project Status](https://img.shields.io/badge/status-active-success.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-17-orange.svg)

## 📖 About Project
This Spring Boot application provides a comprehensive system for managing bulk product prices and inventory. It features a clean, responsive interface for performing CRUD (Create, Read, Update, Delete) operations on product data with real-time price management.

## ⭐ Main Features
- 📝 Full CRUD functionality for product management
- 💰 Price per 100g calculation and display
- 🎨 Clean and intuitive user interface
- 🔍 Product filtering and search capabilities
- 🔒 Secure data handling

## 🛠️ Built With
- [Spring Boot](https://spring.io/projects/spring-boot) - Backend Framework
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Data Persistence
- [Thymeleaf](https://www.thymeleaf.org/) - Template Engine
- [Bootstrap](https://getbootstrap.com/) - Frontend Framework
- [MySQL](https://www.mysql.com/) - Database
- [Maven](https://maven.apache.org/) - Dependency Management

## 🏁 Getting Started

### Prerequisites
- JDK 17 or later
- Maven 3.6 or later
- MySQL 8.0 or later

### Installation
```bash
# Clone this repository
git clone https://github.com/[username]/bulking-product-management

# Navigate to project directory
cd bulking-product-management

# Configure database
# Update application.properties with your MySQL credentials

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

## 🌐 API Endpoints
- `GET /products` - List all products
- `POST /products` - Add a new product
- `PUT /products/{id}` - Update a product
- `DELETE /products/{id}` - Delete a product

## 📷 Screenshots
![CRUD Spring](https://github.com/user-attachments/assets/56c8fe12-be34-4f08-a6ff-1688c14d13ac)
*Main Product List Interface*

## 💻 Usage
1. Access the application at `http://localhost:8080/products`
2. Use the "Add Product" button to create new products
3. Edit or delete existing products using the action buttons
4. Price per 100g is automatically calculated and displayed

## 🔧 Development
```bash
# Run tests
mvn test

# Package the application
mvn package
```
