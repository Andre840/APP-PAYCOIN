package com.example.meuaplicativopaycoin.models;

public class User implements Cloneable {

    private int id; // id do usuário para identifica-lo no SQL data base
    private String login;
    private String password;
    private String cpf;
    private String e_mail;


    public User(){} //método construtor, utilizado para usar quando não está sendo selecionado nenhum dado no data base ou irá ser inserido

    public User(String login, String senha){
        this.login = login;
        this.password = senha;
    }
    // Atualizar com os dados CPF e Email
    public User(int id, String login, String senha){
        this.id = id;
        this.login = login;
        this.password = senha;
    }
    public User(int id, String login, String cpf, String e_mail, String senha){
        this.id = id;
        this.login = login;
        this.cpf = cpf;
        this.e_mail = e_mail;
        this.password = senha;
    }

    public User(User u){
        this.id = u.id;
        this.login = u.login;
        this.cpf = u.cpf;
        this.e_mail = u.e_mail;
        this.password = u.password;
    }

    public int getId(){

        return this.id;
    }

    public void setId(int id){

        this.id = id;
    }

    public String getLogin(){

        return this.login;
    }

    public void setLogin(String l){

        this.login = l;
    }

    public String getCpf() {

        return this.cpf;
    }

    public void setCpf(String c){

        this.cpf = c;
    }

    public String getE_mail(){

        return this.e_mail;
    }

    public void setE_mail(String e){
        this.e_mail = e;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String p){
        this.password = p;
    }

    @Override
    public  Object clone(){
        User clone = new User(this);
        return clone;
    }
}
