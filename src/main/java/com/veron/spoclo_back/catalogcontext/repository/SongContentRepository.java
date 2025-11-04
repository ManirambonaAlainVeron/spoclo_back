package com.veron.spoclo_back.catalogcontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veron.spoclo_back.catalogcontext.domain.SongContent;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
