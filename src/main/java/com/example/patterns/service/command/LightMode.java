package com.example.patterns.service.command;

public class LightMode implements Command
{
    private Theme theme;

    public LightMode(Theme theme)
    {
        this.theme = theme;
    }

    @Override
    public void execute() {
            theme.lightMode();
    }
}
