package iyanprogrammer.CRUD_spring.repository;

import iyanprogrammer.CRUD_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Mendefinisikan antarmuka (interface) UserRepository yang memperluas JpaRepository.
public interface UserRepository extends JpaRepository<User, Long> {
}
