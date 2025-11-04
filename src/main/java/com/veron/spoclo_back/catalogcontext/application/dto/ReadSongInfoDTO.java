package com.veron.spoclo_back.catalogcontext.application.dto;

import java.util.UUID;

import com.veron.spoclo_back.catalogcontext.application.vo.SongAuthorVO;
import com.veron.spoclo_back.catalogcontext.application.vo.SongTitleVO;

import jakarta.validation.constraints.NotNull;

public class ReadSongInfoDTO {
 
    private SongTitleVO songTitleVO;

    private SongAuthorVO songAuthorVO;

    @NotNull
    private byte[] cover;

    @NotNull
    private String coverType;

    @NotNull
    private boolean isFavorite;

    @NotNull
    private UUID publicId;

    public SongTitleVO getSongTitleVO() {
        return songTitleVO;
    }

    public void setSongTitleVO(SongTitleVO songTitleVO) {
        this.songTitleVO = songTitleVO;
    }

    public SongAuthorVO getSongAuthorVO() {
        return songAuthorVO;
    }

    public void setSongAuthorVO(SongAuthorVO songAuthorVO) {
        this.songAuthorVO = songAuthorVO;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public UUID getPublicId() {
        return publicId;
    }

    public void setPublicId(UUID publicId) {
        this.publicId = publicId;
    }

    
}
