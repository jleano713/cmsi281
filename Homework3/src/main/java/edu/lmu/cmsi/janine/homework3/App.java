package edu.lmu.cmsi.janine.homework3;

import java.util.Scanner;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;

public class App {

  private Scanner keyboard = null;
  private GameEngine engine;

  public App() {
    System.out.println("Welcome to BetterGame");
    System.out.println("Commands are: [N]ext frame or [Q]uit");
    this.keyboard = new Scanner(System.in);
    this.engine = new GameEngine(20);
  }

  //returns the lower case String of the keyboard input
  private String getInput() {
    return this.keyboard.next().toLowerCase();
  }

  public static void main(String[] args) {
    App app = new App();
    String input = app.getInput();

    while (!input.equals("q")) {
      if (input.equals("n")) {
        app.engine.update();
      }

      input = app.getInput();
    }
  }
}
