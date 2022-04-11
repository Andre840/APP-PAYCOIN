package com.example.meuaplicativopaycoin.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.meuaplicativopaycoin.models.User;

public class BancoSQLite extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Dados_Usuario.db";
    private static final String ID = "id";
    private static final String LOGIN = "login";
    private static final String SENHA = "senha";
    private static final String CPF = "cpf";
    private static final String EMAIL = "email";

    private static final String TABELA = "usuarios";
    private static final int VERSAO = 1;

    public BancoSQLite(Context context){
        super(context, NOME_BANCO, null, VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        // CREATE TABLE User ( id INTEGER PRIMARY KEY AUTOINCREMENT, login TEXT, senha TEXT)
        String CREATE_USUARIOS_TABLE = "CREATE TABLE " + TABELA + " ( " +
                ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                LOGIN + " TEXT," + CPF + " TEXT," + EMAIL + " TEXT," + SENHA + " TEXT )";

        db.execSQL(CREATE_USUARIOS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }

    public boolean inserirUsuario (User u){
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(LOGIN, u.getLogin());
        values.put(CPF, u.getCpf());
        values.put(EMAIL, u.getE_mail());
        values.put(SENHA, u.getPassword());

        result = db.insert(TABELA, null, values);
        db.close();

        if (result == -1)
            return false;
        else
            return true;
    }

    public User selecionarUsuario(String login){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                //Atualizar com as variáveis CPF e Email de User
                new String[]{ID,LOGIN,CPF,EMAIL,SENHA},
                LOGIN + " = ?",
                new String[]{String.valueOf(login)}, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();

            User user = new User(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4));

            return (User) user.clone();
        }else
            return null;
    }
}