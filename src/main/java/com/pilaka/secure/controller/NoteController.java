package com.pilaka.secure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilaka.secure.dto.NoteDto;
import com.pilaka.secure.entity.Note;
import com.pilaka.secure.service.NoteService;



@RestController
@RequestMapping("/api/v01")
public class NoteController {

	@Autowired
	private NoteService noteService;
	
	@GetMapping("/listNotes")
	public List<Note> listNotes() {
		return this.noteService.listNotes();
	}
	@PostMapping("/createNote")
	public Note createNote(@PathVariable("notedto") NoteDto dto) {
		return noteService.createNote(dto);
	}
	@GetMapping("/admin")
	public String getAdminPage() {
		return "This page is only for Admins";
	}
}
