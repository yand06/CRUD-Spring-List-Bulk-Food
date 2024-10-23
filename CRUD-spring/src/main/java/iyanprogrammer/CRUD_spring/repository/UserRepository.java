package iyanprogrammer.CRUD_spring.repository;

// Mengimpor kelas User dari model dan JpaRepository dari Spring Data JPA.
import iyanprogrammer.CRUD_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Mendefinisikan antarmuka (interface) UserRepository yang memperluas JpaRepository.
public interface UserRepository extends JpaRepository<User, Long> {
}
