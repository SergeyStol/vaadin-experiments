package com.example.vaadinexperiments.loginpage;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;

/**
 * @author Sergey Stol
 * 2022-01-09
 */
@Route("admin")
public class AdminView extends VerticalLayout {
    @PostConstruct
    void init() {
        add(new H1("Hello admin!"));
    }
}
