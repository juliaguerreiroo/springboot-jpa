package com.julia.course.repositories;

import com.julia.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

                                            //tipo entidade, tipo da chave primaria
public interface UserRepository extends JpaRepository<User, Long> {

}
