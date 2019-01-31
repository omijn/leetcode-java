package io.github.omijn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {

    @Test
    void topKFrequent() {
        assertEquals(
                TopKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2),
                new ArrayList<Integer>(Arrays.asList(1, 2))
        );
    }

}