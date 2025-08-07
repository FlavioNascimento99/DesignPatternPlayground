/**
 * Flavio Nascimento
 * Agosto de 2025
 */


public abstract class BaseDecorator implements NotificationInterface {
    protected Notificador wrap;

    public BaseDecorator (Notificador wrap) {
        this.wrap = wrap;
    }

    public void send(String message) {
        wrap.send(message);
    }
}