package com.example;

import lombok.Getter;
import lombok.Setter;

public class StandrdRoom extends Room {
    private @Getter
    @Setter
    int m_small_vault_code;

    public void reetVaultCode() {
        m_small_vault_code = 1234;
    }
}
