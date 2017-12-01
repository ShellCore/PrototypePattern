package com.shellcore.android.prototypepattern;

import java.util.Hashtable;

/**
 * Created by MOGC on 30/11/2017.
 */

public class SequenceCache {

    private static Hashtable<String, Sequence> sequenceHashTable = new Hashtable<>();

    public static Sequence getSequence(String sequenceId) {
        Sequence cachedSequence = sequenceHashTable.get(sequenceId);
        return (Sequence) cachedSequence.clone();
    }

    public static void loadCache() {
        Prime p = new Prime();
        p.setId("1");
        sequenceHashTable.put(p.getId(), p);

        Fibonacci f = new Fibonacci();
        f.setId("2");
        sequenceHashTable.put(f.getId(), f);
    }
}
