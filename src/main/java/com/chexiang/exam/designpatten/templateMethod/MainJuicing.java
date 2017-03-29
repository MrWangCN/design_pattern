package com.chexiang.exam.designpatten.templateMethod;

public class MainJuicing {

    public static void main(String[] args) {
        process(new KiwiJuicing(), new WatermelonJuicing());
    }

    private static void process(AbstractJuicing... exJuices) {
        for (AbstractJuicing exJuice : exJuices) {
            exJuice.doJuicing();
        }
    }

}
