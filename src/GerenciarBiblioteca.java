import model.Aluno;
import model.ControleEmprestimo;
import model.Funcionario;
import model.Livro;
import model.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) {
        // Instanciando usuários
        Aluno aluno = new Aluno(1, "Leandro Mariano Jr", "lemariano@gmail.com", "109525", "ADS");
        Professor professor = new Professor(2, "Marcos Roberto de Morais", "maromo@gmail.com", "POO", "Mestre");
        Funcionario funcionario = new Funcionario(3, "Ana Julia", "anajulia@gmail.com", "Bibliotecária", "Biblioteca");

        // Criando livros
        Livro livro1 = new Livro(101, "Star Wars: A Nova Esperança", "George Lucas", true);
        Livro livro2 = new Livro(102, "Star Wars: O Império Contra-Ataca", "Donald F. Glut", true);
        Livro livro3 = new Livro(103, "Star Wars: O Retorno de Jedi", "James Kahn", true);
        
        // Controle de Empréstimos
        ControleEmprestimo controle = new ControleEmprestimo();

        // Registrando empréstimos
        System.out.println(controle.registraEmprestimo(aluno, livro1));
        System.out.println(controle.registraEmprestimo(professor, livro2));
        System.out.println(controle.registraEmprestimo(funcionario, livro3));

        // Registrando devoluções
        System.out.println(controle.registraDevolucao(aluno, livro1));
        System.out.println(controle.registraDevolucao(professor, livro2));
        System.out.println(controle.registraDevolucao(funcionario, livro3));
    }
}
