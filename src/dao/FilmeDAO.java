/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Filme;
import model.Tipo;

/**
 *
 * @author Michel
 */
public class FilmeDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Filme filme) throws SQLException{
        sql="insert into filme values(?, ?, ?, ?, ?, ?)";
        pst=Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, filme.getTitulo());
        pst.setDouble(3, filme.getPreco());
        pst.setString(4, filme.getGenero());
        pst.setString(5, filme.getDescricao());
        pst.setInt(6, filme.getTipo().getCodigo());
        pst.execute();
        pst.close();
    }
    
        public List<Filme> ListaFilme() throws SQLException{
        List<Filme> listaFilmes;
        listaFilmes = new ArrayList<>();
        sql="select * from filme order by titulo";
        pst=Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaFilmes.add(new Filme(rs.getInt("codigo"), rs.getString("titulo"), rs.getDouble("preco"), rs.getString("genero"), rs.getString("descricao"), new Tipo(rs.getInt("tipo"))));
        }
        pst.close();
        return listaFilmes;
    }

    public void excluir(Filme filme) throws SQLException{
        sql="delete from filme where codigo=?";
        pst=Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, filme.getCodigo());
        pst.execute();
        pst.close();
    } 
    
    
    public void alterar(Filme filme) throws SQLException{
        sql="update filme set titulo=?, preco=?, genero=?, descricao=?, tipo=? where codigo=?";
        pst=Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, filme.getTitulo());
        pst.setDouble(2, filme.getPreco());
        pst.setString(3, filme.getGenero());
        pst.setString(4, filme.getDescricao());
        pst.setInt(5, filme.getTipo().getCodigo());
        pst.setInt(6, filme.getCodigo());
        pst.execute();
        pst.close();
    }
}
