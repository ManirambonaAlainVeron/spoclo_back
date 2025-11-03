package com.veron.spoclo_back.catalogcontext.domain;

import java.io.Serializable;
import java.util.UUID;

public class FavoriteId implements Serializable{

    private UUID songPublicId;
    private String userEmail;

    

    public FavoriteId() {
    }

    public FavoriteId(UUID songPublicId, String userEmail) {
        this.songPublicId = songPublicId;
        this.userEmail = userEmail;
    }
    
    public UUID getSongPublicId() {
        return songPublicId;
    }
    public void setSongPublicId(UUID songPublicId) {
        this.songPublicId = songPublicId;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((songPublicId == null) ? 0 : songPublicId.hashCode());
        result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FavoriteId other = (FavoriteId) obj;
        if (songPublicId == null) {
            if (other.songPublicId != null)
                return false;
        } else if (!songPublicId.equals(other.songPublicId))
            return false;
        if (userEmail == null) {
            if (other.userEmail != null)
                return false;
        } else if (!userEmail.equals(other.userEmail))
            return false;
        return true;
    }

    
}
