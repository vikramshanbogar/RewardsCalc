package com.javatechie.repository;

import com.javatechie.entity.userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<userinfo, Integer> {
    Optional<userinfo> findByName(String username);

}
