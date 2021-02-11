package com.example;

import lombok.Getter;
import lombok.Setter;

public class VIpRoomCelebs extends VIPRoom {
    private @Getter
    @Setter
    float m_jaccuzi;

    public void swimInJaccuzi() {
        System.out.println(String.format("Swimming in jaccuzi size = %f", m_jaccuzi));
    }
}
