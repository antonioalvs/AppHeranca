package Aula04;

public class Aluno extends Pessoa{

    //Args

    private String Matricula;
    private String DataMatricula;
    private String Curso;

  //Construtor

    public Aluno (String Matricula, String DataMatricula, String Curso, String nome, String email, Integer idade){
      super(nome,email,idade);
      this.Matricula=Matricula;
      this.DataMatricula=DataMatricula;
      this.Curso=Curso;
      }

    
  //Metodos

    public String getMatricula() {
        return Matricula;
    }     
    
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    public String getDataMatricula() {
      return DataMatricula;
    }     
  
    public void setDataMatricula(String DataMatricula) {
      this.DataMatricula = DataMatricula;
    }

    public String getCurso() {
      return Curso;
    }     
  
    public void setCurso(String Curso) {
      this.Curso = Curso;
    }

  //ToString

  public String toString(){
    return "Aluno"              + "\n" +
           "Nome: "             + this.getNome()  + "\n" +
           "Email: "            + this.getEmail() + "\n" +
           "Idade:"             + this.getIdade() + "\n" +
           "Matricula:"         + Matricula       + "\n" +
           "Data de Matricula:" + DataMatricula   + "\n" +
           "Curso:"             + Curso           + "\n";
  }
     
}
