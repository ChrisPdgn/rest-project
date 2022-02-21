package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.Secretary;

@RepositoryRestResource(path="secretary", exported = true)
public interface SecretaryRepository extends JpaRepository<Secretary, String>{

}
