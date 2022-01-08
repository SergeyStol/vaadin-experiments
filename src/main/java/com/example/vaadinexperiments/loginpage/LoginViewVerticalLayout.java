package com.example.vaadinexperiments.loginpage;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;

/**
 * @author Sergey Stol
 * 2022-01-09
 */
@Route("login1")
public class LoginViewVerticalLayout extends VerticalLayout {
    @PostConstruct
    void init() {
        add(new LoginForm());
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSizeFull();
    }
}