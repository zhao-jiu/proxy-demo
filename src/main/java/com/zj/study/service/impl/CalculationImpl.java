package com.zj.study.service.impl;

import com.zj.study.service.Calculation;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/24 16:06
 * @Description:
 */
public class CalculationImpl implements Calculation {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer reduce(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        return a / b;
    }
}
