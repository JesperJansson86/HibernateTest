package com.example.hibernatetest.repositories;

import com.example.hibernatetest.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KompisRepository extends CrudRepository<Kompis,Long> {
    List<Kompis> findByName(String name);
    List<Kompis> findByPhone(int phone);
    List<Kompis> findByNameAndPhone(String name,int phone);

}
