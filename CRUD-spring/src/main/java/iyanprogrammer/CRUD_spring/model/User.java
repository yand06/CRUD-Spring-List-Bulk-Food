package iyanprogrammer.CRUD_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Menandai kelas ini sebagai entitas JPA, yang akan dipetakan ke tabel database.
public class User {

    @Id // Menandai field ini sebagai primary key dari entitas.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Menentukan strategi untuk menghasilkan nilai ID secara otomatis.
    private Long id;

    // Field untuk menyimpan username dari pengguna.
    private String username;

    // Field untuk menyimpan password dari pengguna.
    private String password;

    // Getter dan Setter untuk field id.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter dan Setter untuk field username.
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk field password.
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
