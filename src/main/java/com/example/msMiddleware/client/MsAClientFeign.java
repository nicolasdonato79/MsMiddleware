package com.example.msMiddleware.client;

import com.example.msMiddleware.dto.UserDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Cliente Feign hacia MS A
@FeignClient(name = "msa")
public interface MsAClientFeign {

    @PostMapping("/msa/users-details/sync-from-legacy")
    void syncToMsA(@RequestBody UserDetailDTO userDetailDTO);
}