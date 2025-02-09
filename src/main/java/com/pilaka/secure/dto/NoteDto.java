package com.pilaka.secure.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder

public record NoteDto(Long id, String content, String ownerUserName) {

}
