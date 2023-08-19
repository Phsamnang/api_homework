package com.somnang.springdeploy.repository;

import com.somnang.springdeploy.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonRepository {
    @Select("""
            insert into person(name,gender,age)values(#{ps.name},#{ps.gender},#{ps.age}) returning *
            """)
    Person addNewPerson(@Param("ps") Person person);

    @Select("select * from person")
    List<Person> getAllPeople();
}
