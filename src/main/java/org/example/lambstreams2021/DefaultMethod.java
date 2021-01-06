package org.example.lambstreams2021;

public interface DefaultMethod {

    String getSomething();

    default String getSomethingElse() {
        return "SomethingElse";
    }

}

class DefaultMethodImpl implements DefaultMethod {

    @Override
    public String getSomething() {
        return "Something";
    }
}

class DefaultMethodImpl2 implements DefaultMethod {

    @Override
    public String getSomething() {
        return null;
    }

    @Override public String getSomethingElse() {
        return null;
    }
}
