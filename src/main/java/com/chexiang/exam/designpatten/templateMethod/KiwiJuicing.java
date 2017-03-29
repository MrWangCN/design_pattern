package com.chexiang.exam.designpatten.templateMethod;

public class KiwiJuicing extends AbstractJuicing {

    @Override
    protected void mix() {
        System.out.println("混合牛奶蜂蜜......");
        rest();

    }

    @Override
    protected void peel() {
        System.out.println("去皮......");
        rest();

    }

    @Override
    protected void clean() {
        System.out.println("清洗猕猴桃......");
        rest();

    }

}
