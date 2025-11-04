package com.veron.spoclo_back.catalogcontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veron.spoclo_back.catalogcontext.domain.Favorite;
import com.veron.spoclo_back.catalogcontext.domain.FavoriteId;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    
}
