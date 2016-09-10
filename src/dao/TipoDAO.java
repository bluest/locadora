/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tipo;

/**
 *
 * @author Michel
 */
public class TipoDAO {
    PreparedStatement pst;
    String sql;
    
    public List<Tipo> ListaTipo() throws SQLException{
        List<Tipo> listaTipos;
        listaTipos=new ArrayList<>();
        sql="select * from tipo order by descricao";
        pst=Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaTipos.add(new Tipo(rs.getInt("codigo"), rs.getString("descricao")));
        }
        pst.close();
        return listaTipos;
    }
}
