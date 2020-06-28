package com.items.api.Controller;

import com.items.api.service.UpdateService;
import com.items.api.util.mongodb.document.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

@Controller
public class UpdateController {

    @Autowired
    UpdateService updateService;

    @PostMapping("/update/Info")
    public void updateInfo(@RequestBody Booking info) throws UnsupportedEncodingException, MalformedURLException {
        updateService.updateInfo(info);
    }

}
