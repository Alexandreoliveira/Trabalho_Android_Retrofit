package alexandre.com.br.trabalho_android_retrofit.model;

/**
 * Created by Alexandre Meireles Oliveira on 09/11/2017.
 */

public class Candidata {

    private String id;
    private String nome;
    private String adicional;
    private String votos;
    private String foto;

    public Candidata() {
    }

    public Candidata(String id, String nome, String adicional, String votos, String foto) {
        this.id = id;
        this.nome = nome;
        this.adicional = adicional;
        this.votos = votos;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
