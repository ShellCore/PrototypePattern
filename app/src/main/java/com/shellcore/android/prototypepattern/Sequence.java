package com.shellcore.android.prototypepattern;

/**
 * Created by MOGC on 30/11/2017.
 */

public abstract class Sequence implements Cloneable {

    private String id;
    protected long result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
