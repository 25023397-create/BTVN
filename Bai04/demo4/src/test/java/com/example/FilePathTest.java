package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FilePathTest {

    @Test
    void testCrossPlatformPath() {
        Path path = Paths.get("data", "input.txt");

        assertNotNull(path);
        assertTrue(path.toString().contains("input.txt"));
    }
}
