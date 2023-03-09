package com.rtb.details.service;

import com.rtb.details.entity.Detail;
import com.rtb.details.repository.DetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DetailService {

    @Autowired
    private DetailRepository detailRepository;

    public Detail saveDetail(Detail detail) {
        log.info("Inside saveDetail of DetailService");
        return detailRepository.save(detail);
    }

    public Detail findDetailByBookId(Long bookId) {
        log.info("Inside findDetailByBookId of DetailService");
        return detailRepository.findByBookId(bookId);
    }
}
