package com.example.msMiddleware.mapper;

import com.example.msMiddleware.dto.UserDetailDTO;
import com.example.msMiddleware.entity.UserDetail;
import org.springframework.stereotype.Component;

@Component
public class UserDetailMapper {

    public UserDetailDTO toDTO(UserDetail userDetail) {
        if (userDetail == null) {
            return null;
        }

        UserDetailDTO dto = new UserDetailDTO();
        dto.setUserId(userDetail.getUserId());
        dto.setUsername(userDetail.getUsername());
        dto.setFirstName(userDetail.getFirstName());
        dto.setLastName(userDetail.getLastName());
        dto.setGender(userDetail.getGender());
        dto.setStatus(userDetail.getStatus());
        dto.setPassword(userDetail.getPassword());
        return dto;
    }

    public UserDetail toEntity(UserDetailDTO userDetailDTO) {
        if (userDetailDTO == null) {
            return null;
        }

        UserDetail entity = new UserDetail();
        entity.setUserId(userDetailDTO.getUserId());
        entity.setUsername(userDetailDTO.getUsername());
        entity.setFirstName(userDetailDTO.getFirstName());
        entity.setLastName(userDetailDTO.getLastName());
        entity.setGender(userDetailDTO.getGender());
        entity.setStatus(userDetailDTO.getStatus());
        entity.setPassword(userDetailDTO.getPassword());
        return entity;
    }

    public void updateEntityFromDTO(UserDetailDTO userDetailDTO, UserDetail userDetail) {
        if (userDetailDTO == null || userDetail == null) {
            return;
        }

        //userDetail.setUserId(userDetailDTO.getUserId());
        userDetail.setUsername(userDetailDTO.getUsername());
        userDetail.setFirstName(userDetailDTO.getFirstName());
        userDetail.setLastName(userDetailDTO.getLastName());
        userDetail.setGender(userDetailDTO.getGender());
        userDetail.setStatus(userDetailDTO.getStatus());
        userDetail.setPassword(userDetailDTO.getPassword());
        userDetail.setOrigin(userDetailDTO.getOrigin());
    }
}