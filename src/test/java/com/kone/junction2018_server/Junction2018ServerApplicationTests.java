package com.kone.junction2018_server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Junction2018ServerApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @Value("${url.path}")
    private String urlPath;
    @Value("${url.path.basicauth}")
    private String urlPathBasicAuth;
    @Value("${security.auth.user}")
    private String userName;
    @Value("${security.auth.password}")
    private String userPassword;

    @Test
    public void getGeolocation() throws Exception {
//        mockMvc.perform(get(urlPath + "/getGeolocation/1")).andExpect(status().isOk());
    }
}
