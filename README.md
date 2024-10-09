# PrjBiblioteca
# Gerenciador de Biblioteca

## Descrição do Projeto
O Gerenciador de Biblioteca é uma aplicação em Java que visa facilitar a administração de bibliotecas. O sistema permite o registro de usuários, gerenciamento de livros e controle de empréstimos e devoluções, atendendo as necessidades de alunos, professores e funcionários de uma instituição.

## Funcionalidades
- **Registro de Usuários:** Criação de perfis para diferentes tipos de usuários, como alunos, professores e funcionários.
- **Cadastro de Livros:** Adição e gerenciamento de livros disponíveis para empréstimo.
- **Controle de Empréstimos:** Registro de empréstimos de livros, garantindo que apenas livros disponíveis possam ser emprestados.
- **Registro de Devoluções:** Processamento de devoluções de livros, atualizando o status de disponibilidade.

## Estrutura do Projeto
O projeto é organizado em várias classes, cada uma responsável por um aspecto específico:
- **Usuario:** Classe base que define as propriedades comuns dos usuários (id, nome, email).
- **Aluno, Professor, Funcionario:** Classes que herdam de Usuario, representando diferentes tipos de usuários.
- **Livro:** Classe que representa os livros disponíveis, incluindo atributos como título, autor e disponibilidade.
- **ControleEmprestimo:** Classe responsável pela lógica de empréstimo e devolução de livros.
- **RegistroEmprestimo:** Classe que armazena informações sobre cada empréstimo, como usuário, livro e datas de empréstimo e devolução.

## Tecnologias Utilizadas
- **Java:** Linguagem de programação principal do projeto.
