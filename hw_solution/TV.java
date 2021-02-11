package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TV {

    private @Getter final float m_tv_size;
    private @Getter final String m_model;
    private @Getter int m_current_channel;
    private @Getter @Setter boolean m_tv_on;
    private @Getter float m_price;

    public TV(float m_tv_size, String m_model, int m_current_channel,
              boolean m_tv_on, float price) {
        this(m_tv_size, m_model, m_current_channel, m_tv_on); // work
        this.m_price = price; // handle price
        System.out.println("ctor with AllArguments!");
    }

    public TV(float m_tv_size, String m_model, int m_current_channel, boolean m_tv_on) {
        this.m_tv_size = m_tv_size;
        this.m_model = m_model;
        this.m_current_channel = m_current_channel;
        this.m_tv_on = m_tv_on;
        System.out.println("ctor with AllArguments except price!");
    }

    public TV(float m_tv_size, String m_model, int m_current_channel) {
        // must be 1st command!
        this(m_tv_size, m_model, m_current_channel, false);
        System.out.println("ctor (float m_tv_size, String m_model, int m_current_channel)");

    }

    public TV(float m_tv_size, String m_model) {
        // must be 1st command!
        this(m_tv_size, m_model, 1);
        System.out.println("ctor (float m_tv_size, String m_model)");
    }

    public TV(float m_tv_size) {
        // must be 1st command!
        this(m_tv_size, "LG");
        System.out.println("ctor (float m_tv_size)");
    }

    public TV() {
        // must be 1st command!
        this(65);
        System.out.println("ctor ()");
    }

    public void setM_current_channel(int new_channel) //
    //  --> allow only if new_channel > 0
    {
        if (new_channel  > 0) {
            m_current_channel = new_channel;
        }
    }


}
