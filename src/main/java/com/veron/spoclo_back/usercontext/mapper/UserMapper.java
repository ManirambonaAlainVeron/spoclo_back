package com.veron.spoclo_back.usercontext.mapper;

import org.mapstruct.Mapper;

import com.veron.spoclo_back.usercontext.ReadUserDTO;
import com.veron.spoclo_back.usercontext.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ReadUserDTO readUserDTOtoUser(User user);
}
