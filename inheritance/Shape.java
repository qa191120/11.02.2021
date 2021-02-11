package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Shape {
    //private @Getter @Setter
    public boolean m_is3D;

    public void draw()
    {
        System.out.println("Drawing shape ...");
    }
}
