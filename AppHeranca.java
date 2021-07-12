package Aula04;

public class AppHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p = new Pessoa("Nome1","email1@email.com");
		
		//System.out.println(p.toString());
		
		//Funcionario f = new Funcionario("Nome2","email2@email.com",7000);
		//System.out.println(f.toString());
		//f.setNome("Nome do funcionário");
		//System.out.println(f.toString());	
		
		//Funcionario f2 = new Funcionario("Nome3","email3@email.com",20,6500);
		//System.out.println(f2.toString());

		//Botando o exercicio em prática
		
		//Args Auxiliares
		
		String nome, email, matricula, datamatricula, curso, titulo;
		Integer idade;
		float salario;

		nome="Carlos";
		email="carlinreidelas@yahoo.com.br";
		matricula="21-99328";
		datamatricula="12/07/2021";
		curso="Sistemas De Informação";
		titulo="Mestrado";
		salario=1049;
		idade=25;

		Aluno a = new Aluno(matricula,datamatricula,curso,nome,email,idade);

		Professor prof = new Professor(titulo, nome, email, idade, salario);

		System.out.println(a.toString());
		System.out.println(prof.toString());


	}

}
