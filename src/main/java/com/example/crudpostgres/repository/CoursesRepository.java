
package com.example.crudpostgres.repository;

import com.example.crudpostgres.model.Courses;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CoursesRepository
 */
public interface CoursesRepository extends JpaRepository<Courses, Long> {

}