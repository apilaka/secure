package com.pilaka.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pilaka.secure.entity.Note;

@Repository 
public interface NoteRepository extends JpaRepository<Note, Long> {

}
