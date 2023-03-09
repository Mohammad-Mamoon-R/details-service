package com.rtb.details.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long detailId;
    private Long pages;
    private Long price;
    private Long bookId;

}