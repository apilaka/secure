package com.pilaka.secure.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pilaka.secure.dto.NoteDto;
import com.pilaka.secure.entity.Note;
 


@Service
public interface NoteService  {
public List<Note> listNotes();


public Note createNote();
	
}


