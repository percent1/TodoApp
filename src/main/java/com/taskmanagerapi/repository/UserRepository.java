
package com.taskmanagerapi.repository;

// Import the User entity that this repository will manage.
import com.taskmanagerapi.entity.User;

// Import Spring Data JPA's JpaRepository interface.
import org.springframework.data.jpa.repository.JpaRepository;

// Provides database operations for User entities.
// JpaRepository includes methods such as save(), findAll(), findById(), and deleteById().
public interface UserRepository extends JpaRepository<User, Long> {

}
