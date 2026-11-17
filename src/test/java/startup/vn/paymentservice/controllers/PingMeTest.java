package startup.vn.paymentservice.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PingMeTest {

    @Test
    void pingReturnsPongMessage() {
        PingMe pingMe = new PingMe();

        assertEquals("[payment-service] Pong!", pingMe.ping());
    }
}
