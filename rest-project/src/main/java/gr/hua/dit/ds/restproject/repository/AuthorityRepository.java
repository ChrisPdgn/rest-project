package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.Authority;

@RepositoryRestResource(path="authorities")
public interface AuthorityRepository extends JpaRepository<Authority, String>{

}
