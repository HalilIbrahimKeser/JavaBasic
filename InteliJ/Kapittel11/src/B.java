class B extends A {

    int getValue() {
        return 42;
    }


    int getValue(int offset) {
        return 42 - offset;
    }
}