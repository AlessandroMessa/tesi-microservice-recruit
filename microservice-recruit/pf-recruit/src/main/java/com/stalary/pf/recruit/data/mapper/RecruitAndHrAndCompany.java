package com.stalary.pf.recruit.data.mapper;

import com.stalary.pf.recruit.data.entity.CompanyEntity;
import com.stalary.pf.recruit.data.entity.RecruitEntity;
import com.stalary.pf.recruit.data.vo.HR;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruitAndHrAndCompany {
    private RecruitEntity recruit;
    private HR             hr;
    private CompanyEntity  company;
}
