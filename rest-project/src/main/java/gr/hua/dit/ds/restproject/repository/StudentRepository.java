package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hua.dit.ds.restproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
