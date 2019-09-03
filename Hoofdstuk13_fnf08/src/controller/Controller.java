package controller;

import interfaces.Command;

public abstract class Controller {
    public Controller(){}

    abstract void pressButton(String button);

    abstract void addCommand(String s, Command c);
}
