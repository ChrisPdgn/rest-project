package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hua.dit.ds.restproject.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
