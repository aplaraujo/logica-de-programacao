package org.example;

public final class RelogioEUA extends Relogio{

    private String periodo;

    public void setHora(int hora) {
        definirPeriodoAntesMeioDia();
        if ((hora > 12) && (hora <= 23)) {
            definirAposMeioDia();
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    public String getPeriodo() {
        return periodo;
    }

    public void definirPeriodoAntesMeioDia() {
        this.periodo = "AM";
    }

    public void definirAposMeioDia() {
        this.periodo = "PM";
    }

    @Override
    public Relogio converter(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioEUA relogioEUA -> {
                this.hora = relogioEUA.getHora();
                this.periodo = relogioEUA.getPeriodo();
            }
            case RelogioBR relogioBR -> this.setHora(relogioBR.getHora());
        }
        return this;
    }

    @Override
    public String obterHora() {
        return super.obterHora() + " " + this.periodo;
    }
}
