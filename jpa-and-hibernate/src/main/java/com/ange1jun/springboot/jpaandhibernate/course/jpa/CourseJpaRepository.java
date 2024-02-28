package com.ange1jun.springboot.jpaandhibernate.course.jpa;

import com.ange1jun.springboot.jpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course select(long id){
        return entityManager.find(Course.class, id);
    }

    public void delete(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
