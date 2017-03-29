package com.chexiang.exam.designpatten.templateMethod;

public class WatermelonJuicing extends AbstractJuicing {

    @Override
    protected void mix() {
        System.out.println("混合柠檬蜂蜜......");
        rest();

    }

    @Override
    protected void peel() {
        System.out.println("去皮切片......");
        rest();

    }

    @Override
    protected void clean() {
        System.out.println("洗瓜......");
        rest();

    }

}
