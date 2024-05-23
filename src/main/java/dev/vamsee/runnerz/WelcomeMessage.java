package dev.vamsee.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "welcome to spring boot application";
    }
}
