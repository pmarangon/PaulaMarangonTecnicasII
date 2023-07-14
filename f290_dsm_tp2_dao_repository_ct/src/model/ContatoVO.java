package model;

public class ContatoVO {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    
    public ContatoVO(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public ContatoVO(){}
    
    public Integer getId() {
        return id;
    }
    public ContatoVO setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public ContatoVO setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public ContatoVO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getTelefone() {
        return telefone;
    }
    public ContatoVO setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContatoVO other = (ContatoVO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ContatoVO [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }
}
