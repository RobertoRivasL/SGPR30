package com.example.demo.repositories;

import com.example.demo.models.Authority;
import com.example.demo.utils.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface IAuthorityRepository extends JpaRepository<Authority, Integer> {

    Optional<Authority> findByName(AuthorityName name);

}
