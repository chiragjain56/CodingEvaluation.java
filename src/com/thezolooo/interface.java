package com.thezolooo;

 interface InterfaceOne {
    void methodOne();
}
interface InterfaceTwo{
     void methodTwo();
}
interface InterfaceThree extends InterfaceOne,InterfaceTwo{
    void methodThree();
     @Override
    void methodOne();

    @Override
    void methodTwo();
}

