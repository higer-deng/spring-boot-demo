package com.yqsh.springboot.demo.oauth.authorization.server.repostiory;

import com.yqsh.springboot.demo.oauth.authorization.server.entity.SysClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface SysClientDetailsRepository extends JpaRepository<SysClientDetails, Long> {

    /**
     * 通过 clientId 查找客户端信息.
     *
     * @param clientId clientId
     * @return 结果
     */
    Optional<SysClientDetails> findFirstByClientId(String clientId);

    /**
     * 根据客户端 id 删除客户端
     *
     * @param clientId 客户端id
     */
    @Modifying
    void deleteByClientId(String clientId);

}