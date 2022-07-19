package com.itcast.fegin.client;

import com.itcast.fegin.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userservice")
public interface UserClients {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);

}

