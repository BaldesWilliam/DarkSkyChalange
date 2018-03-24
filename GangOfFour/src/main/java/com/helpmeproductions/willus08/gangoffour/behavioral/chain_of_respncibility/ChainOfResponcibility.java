package com.helpmeproductions.willus08.gangoffour.behavioral.chain_of_respncibility;


public abstract class ChainOfResponcibility {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected ChainOfResponcibility nextChain;

    public void setNextChain(ChainOfResponcibility nextChain){
        this.nextChain = nextChain;
    }

    public void logMessage(int level, String msg){
        if(this.level <= level){
            write(msg);
        }
        if (nextChain != null){
            nextChain.logMessage(level,msg);
        }
    }

    abstract protected  void write(String msg);
}
