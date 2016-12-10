/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinalpoo;

/**
 *
 * @author fernando peres fernandes
 */
public class Produto {
    
    private static int cod;
    private String nome;
    private long codBarras;
    private String descricao;
    private String categoria;
    
    public Produto(){
        cod++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static int getCod() {
        return cod;
    }
    
    
    
    
}
