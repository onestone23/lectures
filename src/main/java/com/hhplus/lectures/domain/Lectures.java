package com.hhplus.lectures.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Lectures {
    private Long lecturesId;
    private String title;
    private String instructor;
    private List<LecturesManagement> managementDtoList;
}
