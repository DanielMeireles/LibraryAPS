package br.cesjf.library.enums;

public enum UserType {

    STUDENT("Aluno"),
    TEACHER("Professor"),
    EMPLOYEE("Funcionário"),
    LIBRARIAN("Bibliotecário"),
    ADMINISTRATOR("Administrador");


    private String typeUser;

    UserType(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getTypeUser() {
        return typeUser;
    }

}
