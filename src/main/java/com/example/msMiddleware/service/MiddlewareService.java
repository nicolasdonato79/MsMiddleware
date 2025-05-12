package com.example.msMiddleware.service;

import com.example.msMiddleware.client.MsAClient;
import com.example.msMiddleware.entity.UserDetail;
import com.example.msMiddleware.repo.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiddlewareService {

    @Autowired
    private UserDetailRepository repo;

    @Autowired
    private MsAClient client;

    //Viene del microservicio A
    public void syncFromMsA(UserDetail ud) {
            repo.save(ud);
    }

    //Viene desde la base de datos Legacy
    public void syncFromLegacy(UserDetail ud) {
            repo.save(ud);
            client.syncToMsA(ud);
    }

}
