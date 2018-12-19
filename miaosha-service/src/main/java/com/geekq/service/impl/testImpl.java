package com.geekq.service.impl;

import com.geekq.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class testImpl implements TestService {
    @Override
    public String getTest() {
        return "11111";
    }
}
