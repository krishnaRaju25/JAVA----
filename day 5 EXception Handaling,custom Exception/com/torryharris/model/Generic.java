package com.torryharris.model;

public class Generic<T,S>{
    private T obj;
    private S obj1;
    public Generic(T obj,S obj1) {
        this.obj = obj;
        this.obj1=obj1;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public S getObj1() {
        return obj1;
    }

    public void setObj1(S obj1) {
        this.obj1 = obj1;
    }
}
