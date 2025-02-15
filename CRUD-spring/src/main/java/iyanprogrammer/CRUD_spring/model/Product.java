package iyanprogrammer.CRUD_spring.model;

import jakarta.persistence.*;

@Entity // Menandai kelas ini sebagai entitas JPA, yang akan dipetakan ke tabel database.
@Table(name = "products") // Menentukan bahwa entitas ini akan dipetakan ke tabel "products" di database.
public class Product {

    @Id // Menandai field ini sebagai primary key dari entitas.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Menentukan strategi untuk menghasilkan nilai ID secara otomatis.
    private Long id;

    @Column(name = "name") // Menentukan bahwa field ini akan dipetakan ke kolom "name" di tabel database.
    private String name;

    // Field ini akan dipetakan ke kolom "price" di tabel database secara otomatis karena nama field dan kolom sama.
    private Double price;

    // Konstruktor default, diperlukan oleh JPA.
    public Product() {
    }

    // Konstruktor dengan parameter, untuk mempermudah inisialisasi objek Product dengan nilai awal.
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getter dan Setter untuk field id.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter dan Setter untuk field name.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk field price.
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
