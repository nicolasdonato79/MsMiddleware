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
    public ResponseEntity<Void> syncToLegacy(@RequestBody UserDetailDTO userDetailDto) {
        service.syncFromMsA(userDetailDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacy(@RequestBody UserDetail userDetail) {
        service.syncFromLegacy(userDetail);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacyUpdate(@RequestBody UserDetail userDetail) {
        service.syncFromLegacy(userDetail);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacyDelete(@RequestBody UserDetail userDetail) {
        service.syncFromLegacy(userDetail);
        return ResponseEntity.ok().build();
    }

}
