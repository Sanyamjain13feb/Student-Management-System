package net.javaguidges.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguidges.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
