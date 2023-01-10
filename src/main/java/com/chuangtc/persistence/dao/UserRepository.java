package com.chuangtc.persistence.dao;

import com.chuangtc.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);

}
