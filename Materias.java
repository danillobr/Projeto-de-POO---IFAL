
import javax.swing.JOptionPane;

public class Materias {

    private double bim1;
    private double bim2;
    private double bim3;
    private double bim4;
    private double r1;
    private double r2;
    private double rf;
    private double possibilidade;
    private String nome;
    private int bimestre;
    private String status;
    private String matricula;
    private int atualizado1, atualizado2;

    /*public Materias(String nome, String matricula) {
        this.bim1 = 0;
        this.bim2 = 0;
        this.bim3 = 0;
        this.bim4 = 0;
        this.r1 = 0;
        this.r2 = 0;
        this.rf = 0;
        this.possibilidade = 0;
        this.nome = nome;
        this.bimestre = 1;
        this.status = "Cursando";
        this.matricula = matricula;
    }*/
    public Materias(double bim1, double bim2, double bim3, double bim4, double r1, double r2, double rf, double possibilidade, String nome, int bimestre, String matricula) {
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.bim3 = bim3;
        this.bim4 = bim4;
        this.r1 = r1;
        this.r2 = r2;
        this.rf = rf;
        this.possibilidade = possibilidade;
        this.nome = nome;
        this.bimestre = bimestre;
        this.status = "cursando";
        this.matricula = matricula;
        this.atualizado1 = 0;
        this.atualizado2 = 0;
    }

    public Materias(double bim1, double bim2, double bim3, double bim4, double r1, double r2, double rf, double possibilidade, String nome, int bimestre, String status, String matricula) {
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.bim3 = bim3;
        this.bim4 = bim4;
        this.r1 = r1;
        this.r2 = r2;
        this.rf = rf;
        this.possibilidade = possibilidade;
        this.nome = nome;
        this.bimestre = bimestre;
        this.status = status;
        this.matricula = matricula;
        this.atualizado1 = 0;
        this.atualizado2 = 0;
    }

    public void setPossibilidade(double possibilidade) {
        this.possibilidade = possibilidade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAtualizado1() {
        return atualizado1;
    }

    public int getAtualizado2() {
        return atualizado2;
    }

    public void setAtualizado1(int atualizado1) {
        this.atualizado1 = atualizado1;
    }

    public void setAtualizado2(int atualizado2) {
        this.atualizado2 = atualizado2;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getBim1() {
        return bim1;
    }

    public double getBim2() {
        return bim2;
    }

    public double getBim3() {
        return bim3;
    }

    public double getBim4() {
        return bim4;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    public double getRf() {
        return rf;
    }

    public double getPossibilidade() {
        return possibilidade;
    }

    public String getNome() {
        return nome;
    }

    public int getBimestre() {
        return bimestre;
    }

    public String getStatus() {
        return status;
    }

    public void setBim1(double bim1) {
        this.bim1 = bim1;
    }

    public void setBim2(double bim2) {
        this.bim2 = bim2;
    }

    public void setBim3(double bim3) {
        this.bim3 = bim3;
    }

    public void setBim4(double bim4) {
        this.bim4 = bim4;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public void setRf(double rf) {
        this.rf = rf;
    }

    public void SetPossibilidade(double possibilidade) {
        this.possibilidade = possibilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void reposicao() {
        double bim1 = this.bim1;
        double bim3 = this.bim3;
        if (bim1 < 7 || this.bim2 < 7) {
            if (this.r1 > bim1 && bim1 <= this.bim2 && this.atualizado1 == 0) {
                this.bim1 = r1;
                this.atualizado1 = 1;
            }
            if (this.r1 > this.bim2 && this.bim2 < bim1 && this.atualizado1 == 0) {
                this.bim2 = this.r1;
                this.atualizado1 = 1;
            }
        }
        if (bim3 < 7 || this.bim4 < 7) {
            if (this.r2 > bim3 && bim3 <= this.bim4 && this.atualizado2 == 0) {
                this.bim3 = r2;
                this.atualizado2 = 1;
            }
            if (this.r2 > this.bim4 && this.bim4 < bim3 && this.atualizado2 == 0) {
                this.bim4 = this.r2;
                this.atualizado2 = 1;
            }
        }
    }

    public void possibilidade() {

        double possibilidade = (1 - (24 / 40)) * 100;
        System.out.println(possibilidade);

        if (this.bimestre == 1) {
            possibilidade = (1 - ((24 - this.bim1) / 30)) * 100;
            //System.out.println(possibilidade);
        }
        if (this.bimestre == 2) {
            possibilidade = (1 - ((24 - (this.bim1 + this.bim2)) / 20)) * 100;
            //System.out.println(possibilidade);
        }
        if (this.bimestre == 3) {
            if (24 - (this.bim1 + this.bim2 + this.bim3) <= 0) {
                possibilidade = 100;
            } else {
                possibilidade = (1 - ((24 - (this.bim1 + this.bim2 + this.bim3)) / 10)) * 100;
            }
        }
        if (this.bimestre == 4) {
            if ((this.bim1 + this.bim2 + this.bim3 + this.bim4) >= 23.5) {
                possibilidade = 100;
                //System.out.println(possibilidade);
            }
            if ((this.bim1 + this.bim2 + this.bim3 + this.bim4) < 23.5) {
                possibilidade = 0;
                //System.out.println(possibilidade);
            }
        }
        if (this.status.equals("Aprovado")) {
            possibilidade = 100;
        }
        this.possibilidade = possibilidade;
        //System.out.println(this.possibilidade);
    }

    public void statusAtual() {
        double soma = this.bim1 + this.bim2 + this.bim3 + this.bim4;
        if (this.bimestre >= 3 && soma >= 23.5) {
            this.status = "Aprovado";
            System.out.println("Aprovado" + soma);
        }
        if (this.bimestre == 4 && soma < 23.5) {
            this.status = "Reprovado";
            System.out.println("Reprovado" + soma);
        }
        if (this.bimestre <= 3 && soma < 23.5) {
            this.status = "Cursando";
            System.out.println("Cursando esse" + soma);
        }
    }

    public void RecuperacaoFinal() {
        double soma = this.bim1 + this.bim2 + this.bim3 + this.bim4;
        if (this.status.equals("Reprovado") && (soma + (this.rf * 6)) / 10 >= 5) {
            this.status = "Aprovado!";
        }
        if (this.status.equals("Reprovado") && (soma + (this.rf * 6)) / 10 < 5) {
            this.status = "REPROVADO!";
        }
    }

    public String toString() {
        return bim1 + " " + bim2 + " " + bim3 + " " + bim4 + " " + r1 + " " + r2 + " " + rf + " " + possibilidade + " " + nome + " " + bimestre + " " + status + " " + matricula;
    }

}
