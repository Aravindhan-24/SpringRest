package com.aravindhan.SpringRestJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aravindhan.SpringRestJPA.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
