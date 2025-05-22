package com.example.msMiddleware.service;

import com.example.msMiddleware.client.MsAClientFeign;
import com.example.msMiddleware.dto.UserDetailDTO;
import com.example.msMiddleware.entity.UserDetail;
import com.example.msMiddleware.mapper.UserDetailMapper;
import com.example.msMiddleware.repo.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiddlewareService {

    @Autowired
    private UserDetailRepository repo;

    @Autowired
    private MsAClientFeign client;

    @Autowired
    private UserDetailMapper mapper;

    //Viene del microservicio A
    public void syncFromMsACreate(UserDetailDTO udd) {
            //Originalmente va esto
            repo.save(mapper.toEntity(udd));
    }

    //Viene del microservicio A
    public void syncFromMsAUpdate(UserDetailDTO udd) {
        //Originalmente va esto
        UserDetail userDetail= repo.findByUsername(udd.getUsername());
        mapper.updateEntityFromDTO(udd,userDetail);
        repo.save(userDetail);
    }

    //Viene del microservicio A
    public void syncFromMsADelete(UserDetailDTO udd) {
        //Originalmente va esto
        UserDetail userDetail= repo.findByUsername(udd.getUsername());
        userDetail.setStatus(0);
        repo.save(userDetail);
    }


    //Viene desde la base de datos Legacy
    public void syncFromLegacyCreate(UserDetail ud) {
        client.syncToMsACreate(mapper.toDTO(ud));
    }
    //Viene desde la base de datos Legacy
    public void syncFromLegacyUpdate(UserDetail ud) {
        client.syncToMsAUpdate(mapper.toDTO(ud));
    }
    //Viene desde la base de datos Legacy
    public void syncFromLegacyDelete(UserDetail ud) {
        client.syncToMsADelete(mapper.toDTO(ud));
    }

}
