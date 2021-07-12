package Aula04;

public class Professor extends Funcionario{

    //Args
    String Titulo;

    //Construtor

    public Professor (String Titulo, String nome, String email, Integer idade, float salario){
        super(nome, email, idade, salario);
        this.Titulo = Titulo;
    }
    
    public String getTitulo() {
        return Titulo;
      }     
    
      public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    //toString
    
    public String toString(){
        return "Professor"              + "\n" +
               "Nome: "             + this.getNome()    + "\n" +
               "Email: "            + this.getEmail()   + "\n" +
               "Idade:"             + this.getIdade()   + "\n" +
               "Salario:"           + this.getSalario() + "\n" +
               "Titulo:"            + Titulo            + "\n";
}

}