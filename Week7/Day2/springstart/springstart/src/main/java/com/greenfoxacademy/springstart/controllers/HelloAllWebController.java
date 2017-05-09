package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Nagy Dóra on 2017.05.02..
 */
@Controller
public class HelloAllWebController {

  private final String[] HELLOS = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greet-all")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                         Model model) {
    List<String> shuffledList = Arrays.asList(HELLOS);
    Collections.shuffle(shuffledList);
    model.addAttribute("name", name);
    model.addAttribute("hellos", shuffledList);

    String[] colors = fillWithRandomColors(HELLOS.length);
    model.addAttribute("color", colors);

    String[] fontSizes = fillWithRandomFontSizes(HELLOS.length);
    model.addAttribute("fontSize", fontSizes);
    return "greetingAll";
  }

  private String generateFontSize() {
    String fontSizeFormat = "%dpx";
    int randomFontSize = 8 + (int) (Math.random() * 20);
    return String.format(fontSizeFormat, randomFontSize);
  }

  private String generateRandomColor() {
    String rgbFormat = "rgb(%d,%d,%d)";
    Random random = new Random();
    int r = random.nextInt(255);
    int g = random.nextInt(255);
    int b = random.nextInt(255);
    return String.format(rgbFormat, r, g, b);
  }

  private String[] fillWithRandomColors(int length) {
    String[] colors = new String[length];
    for (int i = 0; i < length; i++) {
      colors[i] = generateRandomColor();
    }
    return colors;
  }

  private String[] fillWithRandomFontSizes(int length) {
    String[] fontSizes = new String[length];
    for (int i = 0; i < length; i++) {
      fontSizes[i] = generateFontSize();
    }
    return fontSizes;
  }
}
