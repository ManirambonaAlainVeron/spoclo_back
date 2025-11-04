package com.veron.spoclo_back.catalogcontext.application.dto;

import com.veron.spoclo_back.catalogcontext.application.vo.SongAuthorVO;
import com.veron.spoclo_back.catalogcontext.application.vo.SongTitleVO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(
    @Valid SongTitleVO songTitleVO,
    @Valid SongAuthorVO songAuthorVO,
    @NotNull byte[] cover,
    @NotNull String coverType,
    @NotNull byte[] file,
    @NotNull String fileType

) {
    
}
