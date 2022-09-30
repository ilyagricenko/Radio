package com.social.radio.google.entity;

import com.social.radio.google.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<User, String> {
}
