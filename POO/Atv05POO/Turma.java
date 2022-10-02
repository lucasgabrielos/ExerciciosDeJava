package Atv05POO;

import java.util.ArrayList;

public class Turma extends Aluno {
    private String cod;
    private Integer turno;
    private Integer sala;
    
    ArrayList<String> Aluno= new ArrayList<>();

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }
}
