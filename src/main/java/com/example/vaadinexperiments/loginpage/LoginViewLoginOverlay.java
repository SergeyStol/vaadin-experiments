package com.example.vaadinexperiments.loginpage;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;

/**
 * @author Sergey Stol
 * 2022-01-09
 */
@Route("login2")
public class LoginViewLoginOverlay extends Composite<LoginOverlay> {
    @PostConstruct
    void init() {
        LoginOverlay content = getContent();
        content.setTitle("My app");
        content.setDescription("It's my app!");
        content.setOpened(true);

        content.addLoginListener(loginEvent -> {
            if ("user".equalsIgnoreCase(loginEvent.getUsername())) {
                UI.getCurrent().navigate("user");
            } else if ("admin".equalsIgnoreCase(loginEvent.getUsername())) {
                UI.getCurrent().navigate(AdminView.class);
            } else {
                Notification.show("Wrong credentials");
            }
        });
    }
}
