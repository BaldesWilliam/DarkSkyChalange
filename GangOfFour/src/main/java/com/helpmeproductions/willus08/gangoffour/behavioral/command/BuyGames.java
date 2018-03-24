package com.helpmeproductions.willus08.gangoffour.behavioral.command;


import com.helpmeproductions.willus08.gangoffour.behavioral.chain_of_respncibility.ChainOfResponcibility;

public class BuyGames implements Command{
    private Games game;

    public BuyGames(Games game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.buy();
    }
}
