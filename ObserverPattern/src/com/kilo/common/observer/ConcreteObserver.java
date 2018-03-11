package com.kilo.common.observer;

import com.kilo.common.subject.ConcreteSubject;
import com.kilo.common.subject.Subject;

/**
 * 具体的观察者对象，实现更新方法，是自身的状态和目标的状态保持一致
 * Created by kilo on 2018/3/10.
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    /**
     * 获取目标类的状态，同步观察者对象的状态
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
