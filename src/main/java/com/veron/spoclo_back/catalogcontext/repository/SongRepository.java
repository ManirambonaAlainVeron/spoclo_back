package com.veron.spoclo_back.catalogcontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veron.spoclo_back.catalogcontext.domain.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
    
}
