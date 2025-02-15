package iyanprogrammer.CRUD_spring.repository;

import iyanprogrammer.CRUD_spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Mendefinisikan antarmuka (interface) ProductRepository yang memperluas JpaRepository.
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT MAX(p.id) FROM Product p")
    Long findMaxId();

}
