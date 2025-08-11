package entities;

import interfaces.Cafe;

public class CafeDecoratorBase implements Cafe {
    protected Cafe cafe;
    public CafeDecoratorBase(Cafe cafe) {
        this.cafe = cafe;
    }

    public double preco() {
        return super.preco();
    }
}