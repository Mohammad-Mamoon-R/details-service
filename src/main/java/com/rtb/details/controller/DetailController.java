package com.rtb.details.controller;


import com.rtb.details.entity.Detail;
import com.rtb.details.service.DetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
@Slf4j
public class DetailController {

    @Autowired
    private DetailService detailService;

    @PostMapping("/addDetail")
    public Detail saveDetail(@RequestBody Detail detail) {
        log.info("Inside saveDetail method of DetailController");
        return  detailService.saveDetail(detail);
    }

    @GetMapping("/{id}")
    public Detail findDetailByBookId(@PathVariable("id") Long bookId) {
        log.info("Inside findDetailByBookId method of DetailController");
        return detailService.findDetailByBookId(bookId);
    }

}
