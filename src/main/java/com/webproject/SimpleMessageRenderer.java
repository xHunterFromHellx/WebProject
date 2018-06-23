package com.webproject;

public class SimpleMessageRenderer implements MessageRenderer {

    private final MessageProvider provider;

    public SimpleMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }


    public void render() {
        System.out.println(provider.getMessage());
    }
}
