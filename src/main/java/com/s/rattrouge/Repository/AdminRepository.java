package com.s.rattrouge.Repository;


import com.s.rattrouge.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminRepository extends JpaRepository <Admin , Long> {


}
