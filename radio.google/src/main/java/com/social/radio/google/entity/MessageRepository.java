package com.social.radio.google.entity;


import com.social.radio.google.dao.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
