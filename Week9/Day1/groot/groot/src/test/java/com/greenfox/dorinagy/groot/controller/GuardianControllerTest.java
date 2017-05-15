package com.greenfox.dorinagy.groot.controller;

import com.greenfox.dorinagy.groot.GuardianApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by Nagy Dóra on 2017.05.15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootWithMessage() throws Exception {
    mockMvc.perform(get("/groot").param("message", "somemessage"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is("somemessage")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void grootWithoutMessage() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void yonduWithParameters() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "10.0"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.distance", is(100.0)))
            .andExpect(jsonPath("$.time", is(10.0)))
            .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void yonduWithoutParameters() throws Exception {
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("error", is("I am Groot!")));
  }

  @Test
  public void yonduZeroReceivedAsExpected() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "0"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error", is("Distance or Time cannot be zero!")));
  }
}
