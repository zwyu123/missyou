package com.lin.missyou.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptional() {
        Optional<String> empty = Optional.empty();
        empty.get();
    }
}
