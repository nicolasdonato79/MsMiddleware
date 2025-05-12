package com.example.msMiddleware.controller;

import com.example.msMiddleware.entity.UserDetail;
import com.example.msMiddleware.service.MiddlewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiddlewareController {

    @Autowired
    private MiddlewareService service;

    @PostMapping("/sync-to-legacy")
    public ResponseEntity<Void> syncToLegacy(@RequestBody UserDetail persona) {
        service.syncFromMsA(persona);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sync-from-legacy")
    public ResponseEntity<Void> syncFromLegacy(@RequestBody UserDetail persona) {
        service.syncFromLegacy(persona);
        return ResponseEntity.ok().build();
    }
}
