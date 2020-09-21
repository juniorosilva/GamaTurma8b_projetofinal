package br.itau.justificativa.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "itmn232_ocorrencia")
public class Ocorrencia {

    @Id
    @Column(name = "num_seq")
    private int num_seq;

    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "id_atividades")
    private int id_atividade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_oc", length = 10)
    private Date data_oc;

    @Column(name = "num_horas", length = 8)
    private Time num_horas;

    @Column(name = "ponto_manual")
    private int ponto_manual;

    @Column(name = "status")
    private int status;

    public int getNum_seq() {
        return num_seq;
    }

    public void setNum_seq(int num_seq) {
        this.num_seq = num_seq;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_oc() {
        return data_oc;
    }

    public void setData_oc(Date data_oc) {
        this.data_oc = data_oc;
    }

    public Time getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(Time num_horas) {
        this.num_horas = num_horas;
    }

    public int getPonto_manual() {
        return ponto_manual;
    }

    public void setPonto_manual(int ponto_manual) {
        this.ponto_manual = ponto_manual;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
