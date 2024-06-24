public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    public void printStatus() {
        if(this.estaMorto()) {
            System.out.printf("%s [Morto, Forca: %.1f, Destreza: %.1f, %s]\n", nomeTipo, forca, destreza, arma.getNome());
        } else {
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n", nomeTipo, saude, forca, destreza, arma.getNome());
        }
    }

     public void atacar(Personagem b) {
        if (this.estaMorto()) {
            System.out.printf("O %s não consegue atacar, pois está morto.\n", nomeTipo);
        } else {
            System.out.printf("O %s ataca o %s com %s.\n", nomeTipo, b.nomeTipo, arma.getNome());

            if(b.estaMorto()) {
                System.out.printf("Pare! O %s já está morto!\n", b.nomeTipo);
            } else {
                if(destreza > b.destreza) {
                    double qtdDano = calculaDano();
                    System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n", qtdDano);

                    b.recebeDano(qtdDano);
                } else if(destreza < b.destreza) {
                    double qtdDano = b.calculaDano();
                    System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", qtdDano);

                    recebeDano(qtdDano);
                } else {
                    System.out.printf("O ataque foi defendido, ninguem se machucou!");
                }
            }
        }
    }

    private double calculaDano() {
        return forca * arma.getModificadorDano();
    }

    private void recebeDano(double pontosDano) {
        saude -= pontosDano;
    }

    private boolean estaMorto() {
        return saude < 1.0 ? true : false; 
    }
}