package com.gfilipeprojects.springpratice.repositories;

import com.gfilipeprojects.springpratice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
