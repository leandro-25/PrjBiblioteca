package model;

import java.time.LocalDate;

public class ControleEmprestimo {
    private int contadorEmprestimos = 1;

    public String registraEmprestimo(Usuario usuario, Livro livro) {
        if (!livro.isDisponivel()) {
            return "Livro não disponível para empréstimo.";
        }
        
        livro.setDisponivel(false);
        RegistroEmprestimo registro = new RegistroEmprestimo(contadorEmprestimos++, usuario, livro, LocalDate.now());
        return String.format("Empréstimo registrado: %s - Livro: %s - Data: %s", 
                             usuario.getNome(), livro.getTitulo(), registro.getDataEmprestimo());
    }

    public String registraDevolucao(Usuario usuario, Livro livro) {
        livro.setDisponivel(true);
        return String.format("Devolução registrada: %s - Livro: %s - Data: %s", 
                             usuario.getNome(), livro.getTitulo(), LocalDate.now());
    }
}
