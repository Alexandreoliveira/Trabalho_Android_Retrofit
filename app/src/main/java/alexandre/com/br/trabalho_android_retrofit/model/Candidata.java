package alexandre.com.br.trabalho_android_retrofit.model;

/**
 * Created by projetos1 on 08/11/2017.
 */

public class Candidata {

    private long id;
    private String nome;
    private String adicional;
    private long votos;
    private String foto;

    public Candidata(long id, String nome, String adicional, long votos, String foto) {
        this.id = id;
        this.nome = nome;
        this.adicional = adicional;
        this.votos = votos;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public long getVotos() {
        return votos;
    }

    public void setVotos(long votos) {
        this.votos = votos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
