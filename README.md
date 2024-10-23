# 🛍️ CRUD Bulking Product
> A Spring Boot CRUD application for managing bulk product prices and inventory

![Project Status](https://img.shields.io/badge/status-active-success.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-17-orange.svg)

## 📖 About Project
This Spring Boot application provides a comprehensive system for managing bulk product prices and inventory. It features a clean, responsive interface for performing CRUD (Create, Read, Update, Delete) operations on product data with real-time price management.

## ⭐ Main Features
- 📝 Full CRUD functionality for product management
- 💰 Price per 100g calculation and display
- 🎨 Clean and intuitive user interface
- 🔍 Product filtering and search capabilities
- 📱 Responsive design for all devices
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

### Database Configuration
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bulking_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## 📂 Project Structure
```
bulking-product-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           └── service/
│   │   └── resources/
│   │       ├── static/
│   │       └── templates/
├── pom.xml
└── README.md
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

## 👤 Created By
**Supriyandi La Awe**
- GitHub: [@yand06](https://github.com/yand06)
- LinkedIn: [@supriyandilaawe](https://linkedin.com/in/supriyandilaawe)

## 📝 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## 🤝 Contributing
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 🙏 Acknowledgments
- Spring Boot Documentation
- Bootstrap Documentation
- All contributors who have helped this project grow
