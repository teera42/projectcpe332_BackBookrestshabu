package com.mikestudio.Spring_first.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Document(collection = "RESERVE_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserve_Data {
    @Id
    private String reserveDataId;
    private String userId;
    private String tableNumberType;
    private String reserveTime;
    private String reserveDate;
    private String reserveStatus;

    private String tableTypes;
    private Integer ValueOfCustomer;
    private LocalDateTime createdAt;


}
