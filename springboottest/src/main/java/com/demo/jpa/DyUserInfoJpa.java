package com.demo.jpa;

import com.demo.model.dyUserInfo;
import com.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

public interface DyUserInfoJpa extends
        Serializable,
        JpaRepository<dyUserInfo, Integer>,
        JpaSpecificationExecutor<dyUserInfo> {
}
