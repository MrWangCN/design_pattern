package com.chexiang.exam.designpatten.templateMethod;

public abstract class AbstractJuicing {

    /**
     * 功能描述: <br>
     * 该方法为模板方法，指定了鲜榨果汁的流程算法，共通的直接实现，特殊的由每个子类实现
     *
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    protected final void doJuicing() {
        clean();
        peel();
        water();
        mix();
        stir();
        seal();
    }

    private void seal() {
        System.out.println("进行封装......");
        rest();
        System.out.println("每天一杯果汁，喝出美味，喝出营养，喝出健康，喝出好心情，谢谢您的光临！");
    }

    private void stir() {
        System.out.println("料理机搅拌......");
        rest();

    }

    protected abstract void mix();

    private void water() {
        System.out.println("正在倒入纯净水......");
        rest();

    }

    protected abstract void peel();

    protected abstract void clean();

    protected final void rest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException("sleep method did not work");
        }
    }

}
