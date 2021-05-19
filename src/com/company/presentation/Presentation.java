package com.company.presentation;

import com.company.logic.Logic;

public class Presentation {
    public void show(){
        Logic logic1 = new Logic();
        logic1.logic();

        System.out.println("obvod "+logic1.perimeter());
        System.out.println("obsah "+logic1.content());
    }
}
