package com.rtb.details.repository;

import com.rtb.details.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {

    Detail findByBookId(Long bookId);
}
