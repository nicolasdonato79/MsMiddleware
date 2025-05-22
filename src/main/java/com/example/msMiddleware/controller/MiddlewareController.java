package com.example.msMiddleware.controller;

import com.example.msMiddleware.dto.UserDetailDTO;
import com.example.msMiddleware.entity.UserDetail;
import com.example.msMiddleware.service.MiddlewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msmiddleware/users-details")
public class MiddlewareController {

    @Autowired
    private MiddlewareService service;

    @PostMapping("/sync-to-legacy")
    public ResponseEntity<Void> syncToLegacyCreate(@RequestBody UserDetailDTO userDetailDto) {
        service.syncFromMsACreate(userDetailDto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/sync-to-legacy")
    public ResponseEntity<Void> syncToLegacyUpdate(@RequestBody UserDetailDTO userDetailDto) {
        service.syncFromMsAUpdate(userDetailDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/sync-to-legacy")
    public ResponseEntity<Void> syncToLegacyDelete(@RequestBody UserDetailDTO userDetailDto) {
        service.syncFromMsADelete(userDetailDto);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacyCreate(@RequestBody UserDetail userDetail) {
        service.syncFromLegacyCreate(userDetail);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacyUpdate(@RequestBody UserDetail userDetail) {
        service.syncFromLegacyUpdate(userDetail);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacyDelete(@RequestBody UserDetail userDetail) {
        service.syncFromLegacyDelete(userDetail);
        return ResponseEntity.ok().build();
    }

}
