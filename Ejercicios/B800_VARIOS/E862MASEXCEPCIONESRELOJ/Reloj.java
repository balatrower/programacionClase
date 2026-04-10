package B800_VARIOS.E862MASEXCEPCIONESRELOJ;

public class Reloj {
    private int h;
    private int m;

    public Reloj() throws HoraNoValidaException, MinutoNoValidoException {
        // Se podría hacer así:
        // h = 8;
        // m = 15;

        // Pero esto sería mejor, llamar a otro costructor sobrecargado:
        this(8, 15);
    }

    public Reloj(int h, int m) throws HoraNoValidaException, MinutoNoValidoException {
        if (h > 23 || h < 0) throw new HoraNoValidaException(); //primero las horas por si se hizo con h y m separados
        if (m < 0) throw new MinutoNoValidoException(); // constructor de totalMinutos llama a super

        this.h = h;
        this.m = m;

        normalizar();
    }

    public Reloj(int totalMinutos) throws DesbordamientoRelojException, HoraNoValidaException, MinutoNoValidoException {
        // Se podría hacer así:
        // h = 0;
        // m = totalMinutos;
        // normalizar();

        // Pero esto sería mejor, llamar a otro costructor sobrecargado:
        if (totalMinutos >= 60 * 24 || totalMinutos < 0) {
            int excesoMinutos = totalMinutos - (60 * 24 - 1);
            if (totalMinutos < 0) {
                excesoMinutos = totalMinutos;
            }
            throw new DesbordamientoRelojException(true, excesoMinutos);
        }
        this(0, totalMinutos);
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String toString() {
        return String.format("%02d:%02d", h, m);
    }

    public boolean equals(Object obj) {
        // Se comprueba si obj es null. Si lo es, consideramos que somos distintos.
        if (obj == null) return false;

        // Se comprueba si obj es de la clase Reloj. Si NO lo es, consideramos que somos distintos.
        if (!(obj instanceof Reloj)) return false;

        Reloj otro = (Reloj) obj;

        // Por último, hacemos la comprobación de igualdad en sí:
        return ((this.h == otro.h) && (this.m == otro.m));

        // Alternativa:
        // return ((this.h == ((Reloj) obj).h) && (this.m == ((Reloj) obj).m));
    }

    public Reloj clone() {
        Reloj clon = null;
        do {
            try {
                clon = new Reloj();

                clon.h = this.h;
                clon.m = this.m;
            } catch (HoraNoValidaException e) {
                IO.println("Error en la clonacion del reloj: " + e.getClass());
            } catch (MinutoNoValidoException e) {
                IO.println("Error durante la clonacion del reloj: " + e.getClass());
            }
        } while (clon == null);

        return clon;
        // Alternativa:
        // return new Reloj(this.h, this.m);
    }

    private void normalizar() {
        // Alternativa 1, más sencilla pero menos eficiente:

        while (m < 0) {
            h--;
            m = m + 60;
        }
        while (m >= 60) {
            h++;
            m = m - 60;
        }

        while (h < 0) {
            h = h + 24;
        }
        while (h >= 24) {
            h = h - 24;
        }


        // Alternativa 2, más eficiente pero más compleja:

        //if (m < 0) {
        //     h = -1 + h + m / 60;
        //     m = 60 + m % 60;
        //}
        //
        //if (m >= 60) {
        //     h = h + m / 60;
        //     m = m % 60;
        //}
        //
        //if (h < 0) {
        //     h = 24 + h % 24;
        //}
        //
        //if (h >= 24) {
        //     h = h % 24;
        //}
    }

    private int totalMinutos() {
        return 60 * h + m;
    }

    public void tick() throws OperacionNegativaRelojException, DesbordamientoRelojException {
        sumar(1);
    }

    public void sumar(int minutos) throws OperacionNegativaRelojException, DesbordamientoRelojException {
        if (minutos < 0) throw new OperacionNegativaRelojException();
        if (60 * h + m + minutos >= 24 * 60) {
            int minutosExceso = minutos - (24 * 60);
            throw new DesbordamientoRelojException(true, minutosExceso);
        }

        m = m + minutos;
    }

    public void restar(int minutos) throws DesbordamientoRelojException, OperacionNegativaRelojException {
        if (minutos < 0) throw new OperacionNegativaRelojException();
        if (60 * h + m - minutos < 0) throw new DesbordamientoRelojException(false, minutos);

        m = m - minutos;
    }

    public int diferenciaMinutos(Reloj otro) {
        int diferencia = Math.abs(this.totalMinutos() - otro.totalMinutos());

        return diferencia;
    }

    public Reloj diferenciaReloj(Reloj otro) throws HoraNoValidaException, MinutoNoValidoException, DesbordamientoRelojException {
        int diferenciaMinutos = this.diferenciaMinutos(otro);

        Reloj diferenciaReloj = new Reloj(diferenciaMinutos);

        return diferenciaReloj;
    }
}
