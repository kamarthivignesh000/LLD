package com.design.patterns.behavioral.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG) {
            System.out.println("Debug: "+message);
        }
        else super.log(logLevel, message);
    }
}