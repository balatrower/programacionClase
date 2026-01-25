package B300_OOPBASICA.E306RELOJCOMPLETOEQUALSCLONE;

public class Reloj {
    private int totalMinutos = 495;

    public Reloj() {

    }

    public Reloj(int horas, int minutos) {
        this.totalMinutos = transformarTotalMinutos(horas, minutos);
    }

    public Reloj(int totalMins) {
        this.totalMinutos = totalMins;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;

        if (objeto == null) return false;

        if (!(objeto instanceof Reloj)) return false;

        Reloj comparado = (Reloj) objeto;

        return (this.totalMinutos == comparado.totalMinutos);
    }

    @Override
    public Reloj clone() {
        Reloj clon = new Reloj();

        clon.setTotalMinutos(this.totalMinutos);

        return clon;
    }

    @Override
    public String toString() {
        int[] tiempo = transformarArrayTiempo(this.totalMinutos);
        return String.format("%02d:%02d", tiempo[0], tiempo[1]);
    }

    public void setTotalMinutos(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public int getTotalMinutos() {
        return totalMinutos;
    }

    public void tick() {
        this.totalMinutos++;
    }

    public void sumarMinutos(int minutos) {
        this.totalMinutos = this.totalMinutos + minutos;
    }


    public void restarMinutos(int minutos) {
        this.totalMinutos = this.totalMinutos - minutos;
    }

    public int diferenciaMinutos(Reloj reloj3) {
        return Math.abs(reloj3.getTotalMinutos() - this.totalMinutos);
    }

    public Reloj diferenciaReloj(Reloj reloj3) {
        Reloj relojDif = new Reloj(this.totalMinutos);

        relojDif.setTotalMinutos(Math.abs(this.totalMinutos - reloj3.getTotalMinutos()));

        return relojDif;
    }

    public int[] transformarArrayTiempo(int totalMinutos) {
        int[] tiempo = new int[2];
        while (totalMinutos >= 60) {
            totalMinutos = totalMinutos - 60;
            tiempo[0]++;
        }
        tiempo[1] = totalMinutos;
        return tiempo;
    }

    public int transformarTotalMinutos(int horas, int minutos) {
        int totalMinutos = 0;
        while (horas > 0) {
            totalMinutos = totalMinutos + 60;
            horas--;
        }
        totalMinutos = totalMinutos + minutos;
        return totalMinutos;
    }
}

