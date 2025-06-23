package lista.tarefa.springboot_lista_tarefa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "tarefas")
public class Tarefa {

    @Id
    private String id;
    private String titulo;
    private String descricao;
    private StatusTarefa status = StatusTarefa.PENDENTE;
    private LocalDate dataCriacao =LocalDate.now();
    private LocalDate dataConclusao;
    private String usuarioId;

    public Tarefa(String id, String titulo, String descricao, StatusTarefa status, LocalDate dataCriacao, LocalDate dataConclusao, String usuarioId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.usuarioId = usuarioId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getId(), tarefa.getId()) && Objects.equals(getTitulo(), tarefa.getTitulo()) && Objects.equals(getDescricao(), tarefa.getDescricao()) && getStatus() == tarefa.getStatus() && Objects.equals(getDataCriacao(), tarefa.getDataCriacao()) && Objects.equals(getDataConclusao(), tarefa.getDataConclusao()) && Objects.equals(getUsuarioId(), tarefa.getUsuarioId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getDescricao(), getStatus(), getDataCriacao(), getDataConclusao(), getUsuarioId());
    }
}
