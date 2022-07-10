package sp.senai;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;



public class ProdutoDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public ProdutoDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Produto produto) {
        ContentValues values = new ContentValues();
        values.put("Nome", produto.getNome());
        values.put("Quantidade", produto.getQuantidade());
        values.put("Preço", produto.getPreço());
        return banco.insert("produto", null, values);

    }

    public List<Produto> obterTodos() {
        List<Produto> produto = new ArrayList<>();
        Cursor cursor = banco.query("produto", new String[]{"id", "nome", "quantidade", "preço"}, null, null, null, null, null);
        while (cursor.moveToNext()) {
            Produto p = new Produto();
            p.setId(cursor.getInt(0));
            p.setNome(cursor.getString(1));
            p.setQuantidade(Integer.parseInt(cursor.getString( 2)));
            p.setPreço(Double.parseDouble(cursor.getString( 3)));
            produto.add(p);
        }
        return produto;
    }




}



