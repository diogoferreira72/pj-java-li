package br.queixas.spring02.dto;

import br.queixas.spring02.model.Agente;

//Data Transfer Object
public class AgenteDTO {
    private String nome;
    private float volumeTransacional;
    
    public AgenteDTO(Agente agente) {
        this.nome = agente.getNomeAgente();
        this.volumeTransacional = agente.getVolumeTransacional();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVolumeTransacional() {
        return volumeTransacional;
    }
    
}
