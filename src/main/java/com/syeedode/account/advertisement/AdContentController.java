package com.syeedode.account.advertisement;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Account Services
 * Ad Content
 * <p>
 * Author: syeedode
 * Date: 9/15/17
 */
@RestController
public class AdContentController {
    @RequestMapping(value = "/adcontent", method = RequestMethod.GET)
    public ResponseEntity<String> adContent() {
        return ResponseEntity.ok("Got back good content: " + UUID.randomUUID().toString());
    }
}
