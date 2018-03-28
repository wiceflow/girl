package com.wiceflow.properties;

import com.wiceflow.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BF
 * @date 2018/3/22
 * 操作数据库
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

}
