package br.com.projeto.projetoFinal;


public class User {
    private String name;
    private int age;
    private String VATNumber;
    private String email;

    public User(String name, int age, String vATNumber, String email) {
        this.name = name;
        this.age = age;
        VATNumber = vATNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getVATNumber() {
        return VATNumber;
    }
    public void setVATNumber(String vATNumber) {
        VATNumber = vATNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{\"name\": \"" + this.name + "\", \"age\": " + this.age + ", \"vatnumber\": \"" + this.VATNumber + "\", \"email\": \"" + this.email + "\"}";
    }

    
}
