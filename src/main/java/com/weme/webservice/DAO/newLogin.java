package com.weme.webservice.DAO;

import com.weme.webservice.DTO.userDto;
import com.weme.webservice.Entity.UserEntity;

public interface newLogin {
    UserEntity saveinfo(userDto userdto);
}
