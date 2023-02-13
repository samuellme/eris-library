package me.samuell.erislibrary.health;

public class HealthStatus {
    private final boolean ok ;

    public HealthStatus(boolean ok) {
        this.ok = ok;
    }

    public boolean isOk() {
        return ok;
    }
}
