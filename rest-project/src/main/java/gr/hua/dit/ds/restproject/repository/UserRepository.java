package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.User;

@RepositoryRestResource(path="user")
public interface UserRepository extends JpaRepository<User, String>{

}
