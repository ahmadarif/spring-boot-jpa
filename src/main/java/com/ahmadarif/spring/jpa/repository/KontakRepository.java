package com.ahmadarif.spring.jpa.repository;

import com.ahmadarif.spring.jpa.domain.Kontak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontakRepository extends JpaRepository<Kontak, Long> {

}