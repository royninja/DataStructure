package Algorithms.EasyAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadanesAlgorithmTest {

    @Test
    void kadaens() {
        KadanesAlgorithm algo = new KadanesAlgorithm();
        assertEquals(7, algo.Kadaens(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}