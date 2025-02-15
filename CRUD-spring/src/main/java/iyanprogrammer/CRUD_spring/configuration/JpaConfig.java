package iyanprogrammer.CRUD_spring.configuration;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

// Menandai kelas ini sebagai kelas konfigurasi Spring.
@Configuration
// Mengaktifkan JPA repositories dan menunjukkan paket yang berisi repository.
@EnableJpaRepositories(basePackages = "iyanprogrammer.CRUD_spring.repository")
// Menunjukkan paket yang berisi entitas (model) yang akan discan oleh Spring.
@EntityScan(basePackages = "iyanprogrammer.CRUD_spring.model")
public class JpaConfig {

    // Mendefinisikan bean untuk DataSource, yang digunakan untuk menghubungkan aplikasi ke database.
    @Bean
    public DataSource dataSource() {
        // Menggunakan DriverManagerDataSource untuk mengelola koneksi ke database.
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // Mengatur driver JDBC untuk MySQL.
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // Mengatur URL untuk menghubungkan ke database "mydatabase" di localhost pada port 3306.
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
        // Mengatur username untuk koneksi ke database.
        dataSource.setUsername("root");
        // Mengatur password untuk koneksi ke database (kosong dalam hal ini).
        dataSource.setPassword("");
        // Mengembalikan objek DataSource yang dikonfigurasi.
        return dataSource;
    }

    // Mendefinisikan bean untuk EntityManagerFactory, yang digunakan oleh JPA untuk mengelola entitas.
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        // Membuat instance dari LocalContainerEntityManagerFactoryBean.
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        // Mengatur DataSource yang akan digunakan oleh EntityManagerFactory.
        emf.setDataSource(dataSource);
        // Menunjukkan paket yang berisi entitas (model) yang akan discan oleh EntityManagerFactory.
        emf.setPackagesToScan("iyanprogrammer.CRUD_spring.model");

        // Membuat dan mengatur adapter JPA vendor yang digunakan oleh Hibernate.
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        emf.setJpaVendorAdapter(vendorAdapter);

        // Mengembalikan objek EntityManagerFactory yang dikonfigurasi.
        return emf;
    }

    // Mendefinisikan bean untuk PlatformTransactionManager, yang mengelola transaksi JPA.
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        // Mengembalikan instance JpaTransactionManager dengan EntityManagerFactory sebagai argumennya.
        return new JpaTransactionManager(entityManagerFactory);
    }
}
