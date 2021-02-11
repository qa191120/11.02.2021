package com.example;

import lombok.Getter;
import lombok.Setter;

public class VIPRoom extends Room {
    private @Getter
    @Setter
    float m_mini_bar_size;

    public void party()
    {
        System.out.println(String.format("Party in VIP room drinking from mini bar %f",
                m_mini_bar_size));
    }
}
