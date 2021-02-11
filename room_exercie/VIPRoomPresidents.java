package com.example;

import lombok.Getter;
import lombok.Setter;

public class VIPRoomPresidents extends VIPRoom {
    private @Getter
    @Setter
    int m_guards;

    public void addGuard() {
        m_guards++;
    }

    public float getMiniBarSize() {
        return getM_mini_bar_size();
    }
}
