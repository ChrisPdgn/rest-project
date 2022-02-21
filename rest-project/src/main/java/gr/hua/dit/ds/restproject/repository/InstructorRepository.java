package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.Instructor;

@RepositoryRestResource(path="instructor", exported = true)
public interface InstructorRepository extends JpaRepository<Instructor, String>{

}
