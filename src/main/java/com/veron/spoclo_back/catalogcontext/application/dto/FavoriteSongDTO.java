package com.veron.spoclo_back.catalogcontext.application.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record FavoriteSongDTO(@NotNull boolean favorite, UUID publicId) {
}
