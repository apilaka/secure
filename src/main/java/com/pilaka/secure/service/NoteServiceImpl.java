package com.pilaka.secure.service;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.pilaka.secure.dto.NoteDto;
import com.pilaka.secure.entity.Note;
import com.pilaka.secure.repo.NoteRepository;

@Component
public class NoteServiceImpl implements NoteService{
	@Autowired
	private NoteRepository noteRepository;
	
	public List<Note> listNotes() {
		return noteRepository.findAll();

	}





	@Override
	public Note  createNote(NoteDto dto) {
		Note note = new Note();
		note.setId(dto.id());
		note.setContent(dto.content());
		note.setOwnerUserName(dto.ownerUserName());
		return note;
	}

}
