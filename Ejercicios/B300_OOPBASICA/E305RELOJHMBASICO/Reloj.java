package B300_OOPBASICA.E305RELOJHMBASICO;

public class Reloj {
    private int horas = 8;
    private int minutos = 15;

    public Reloj() {
    }

    public Reloj(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Reloj(int totalMins) {
        this.horas = totalMins / 60;
        this.minutos = totalMins - this.horas * 60;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String toString() {
        return String.format("%02d:%02d", horas, minutos);
    }

    public void  tick() {
        this.minutos++;

        if (this.minutos == 60) {
            this.horas++;
            this.minutos = 0;
        }
    }

    public void sumarMinutos(int minutos) {
        this.minutos = this.minutos + minutos;

        if (this.minutos > 59) {
            if (this.horas == 23) {
                this.horas = 0;
                this.minutos = this.minutos - 60;
            } else {
                this.minutos = this.minutos - 60;
                this.horas++;
            }
        }
    }


    public void restarMinutos(int minutos) {
        this.minutos = this.minutos - minutos;

        if (this.minutos < 1) {
            do {
                this.minutos = this.minutos + 60;
                this.horas--;

                if (this.horas < 0) {
                    this.horas = 23;
                }
            } while (this.minutos < 1);
        }
    }

    public int diferenciaMinutos(Reloj reloj3) {
        int minTotalesRelojActual = this.horas * 60 + this.minutos;
        int minTotalesRelojComparador = reloj3.getHoras() * 60 + reloj3.getMinutos();

        return Math.abs(minTotalesRelojComparador - minTotalesRelojActual);
    }

    public Reloj diferenciaReloj(Reloj reloj3) {
        Reloj relojDif = new Reloj(this.horas, this.minutos);

        relojDif.setHoras(Math.abs(this.horas - reloj3.getHoras()));
        relojDif.setMinutos(Math.abs(this.minutos - reloj3.getMinutos()));

        return relojDif;
    }
}
