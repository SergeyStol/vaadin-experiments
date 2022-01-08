package com.example.vaadinexperiments.loginpage;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;

/**
 * @author Sergey Stol
 * 2022-01-09
 */
@Route("login")
public class LoginView extends Composite<VerticalLayout> {
    @PostConstruct
    void init() {
        VerticalLayout content = getContent();
        content.add(new LoginForm());
        content.setSizeFull();
        content.setAlignItems(FlexComponent.Alignment.CENTER);
        content.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
    }
}