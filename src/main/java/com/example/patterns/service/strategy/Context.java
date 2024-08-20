package com.example.patterns.service.strategy;

public class Context
{
    private SortIt sortIt;

    public Context(SortIt sortIt)
    {
        this.sortIt = sortIt;
    }

    public void setContext(SortIt sortIt)
    {
         this.sortIt = sortIt;
    }

    public void execute()
    {
        sortIt.execute();
    }
}
