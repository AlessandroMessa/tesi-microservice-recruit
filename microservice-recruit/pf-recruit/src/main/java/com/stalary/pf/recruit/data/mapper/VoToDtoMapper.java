package com.stalary.pf.recruit.data.mapper;


import com.stalary.pf.recruit.data.dto.User;
import com.stalary.pf.recruit.data.vo.HR;

public class VoToDtoMapper {
    public static User fromHR(HR hr) {
        User u = new User();
        u.setUsername(hr.getUsername());
        u.setNickname(hr.getNickname());
        u.setPassword(hr.getPassword());
        u.setPhone(hr.getPhone());
        u.setEmail(hr.getEmail());
        u.setFirstId(hr.getCompanyId());
        u.setCode(hr.getCode());
        u.setRole(1);
        return u;
    }
}
