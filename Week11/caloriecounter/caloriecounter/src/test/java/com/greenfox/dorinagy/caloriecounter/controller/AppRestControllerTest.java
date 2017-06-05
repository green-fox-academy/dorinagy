package com.greenfox.dorinagy.caloriecounter.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.greenfox.dorinagy.caloriecounter.CaloriecounterApplication;
import com.greenfox.dorinagy.caloriecounter.model.Meal;
import com.greenfox.dorinagy.caloriecounter.repository.MealRepository;
import org.hamcrest.Matchers;
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

import java.nio.charset.Charset;
import java.util.Date;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by Nagy Dóra on 2017.06.05..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CaloriecounterApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class AppRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void getMealsFirstTwoElements() throws Exception {
    mockMvc.perform(get("/getmeals")
            .contentType(contentType))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", hasSize(4)))
            .andExpect(jsonPath("$[0].description", is("Porridge")))
            .andExpect(jsonPath("$[0].calories", is(360)))
            .andExpect(jsonPath("$[0].date", is("2017-06-02")))
            .andExpect(jsonPath("$[1].description", is("Salad")))
            .andExpect(jsonPath("$[1].calories", is(170)))
            .andExpect(jsonPath("$[1].date", is("2017-06-01")))
            .andDo(print());
  }

  @Test
  public void getStats() {
    try {
      mockMvc.perform(get("/getstats")
              .contentType(contentType))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.numberOfMeals", is(4)))
              .andExpect(jsonPath("$.calories", is(840)))
              .andDo(print());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test  //doesn't pass yet
  public void postMeal() {
    try {
      Meal meal = new Meal("Dinner", "cucumber", 200);
      ObjectMapper mapper = new ObjectMapper();
      String jsonInput = mapper.writeValueAsString(meal);
      jsonInput = mapper.writeValueAsString(meal);
      mockMvc.perform(post("/meal")
              .contentType(contentType)
              .content(jsonInput))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.type", is("Dinner")))
              .andExpect(jsonPath("$.description", is("cucumber")))
              .andExpect(jsonPath("$.calories", is(200)));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
