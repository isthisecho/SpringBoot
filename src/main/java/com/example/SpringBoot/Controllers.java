package com.example.SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
 // We are declaring interface for jpa repository
public interface Controllers extends JpaRepository<User,Long> {


}
