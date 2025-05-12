package com.example.msMiddleware.client;

import com.example.msMiddleware.dto.UserDetailDTO;
import com.example.msMiddleware.entity.UserDetail;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

// Cliente hacia MS A
@Component
public class MsAClient {
    private final RestTemplate rest = new RestTemplate();

    synchronized public void syncToMsA(UserDetailDTO userDetailDto) {
        rest.postForEntity("http://localhost:8080/users-details/sync-from-legacy", userDetailDto, Void.class);
    }
}