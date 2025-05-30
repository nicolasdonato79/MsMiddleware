package com.example.msMiddleware.client;

import com.example.msMiddleware.dto.UserDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Cliente Feign hacia MS A
@FeignClient(name = "MSA")
public interface MsAClientFeign {

    @PostMapping("/msa/users-details/sync-from-legacy")
    void syncToMsACreate(@RequestBody UserDetailDTO userDetailDTO);

    @PutMapping("/msa/users-details/sync-from-legacy")
    void syncToMsAUpdate(@RequestBody UserDetailDTO userDetailDTO);

    @DeleteMapping("/msa/users-details/sync-from-legacy")
    void syncToMsADelete(@RequestBody UserDetailDTO userDetailDTO);

}