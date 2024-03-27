package com.sjprogramming.restapi.repository;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.entity.main_poster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Main_poster_repo extends JpaRepository<main_poster, Integer> {
}
