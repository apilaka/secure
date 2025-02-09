package com.pilaka.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pilaka.secure.entity.Note;
//
@Repository 
@CrossOrigin(origins = "http://192.168.12.111:8091") // Allow requests from this origin
//@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface NoteRepository extends JpaRepository<Note, Long> {

}
