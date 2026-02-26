📝 Gerenciador de Tarefas em Java (CRUD)
Este é um projeto de console desenvolvido em Java que simula um sistema de gerenciamento de tarefas. O objetivo principal foi aplicar conceitos de estruturas de dados dinâmicas e o ciclo CRUD (Create, Read, Update, Delete).

🚀 Funcionalidades
O sistema permite que o usuário interaja com uma lista de tarefas através de um menu interativo:

Adicionar Tarefa: Permite a entrada de texto e armazena em uma lista dinâmica.

Listar Tarefas: Exibe todas as tarefas cadastradas com numeração amigável ao usuário (iniciando em 1).

Remover Tarefa: Exclui uma tarefa específica com base no número informado, com validação de segurança para índices inexistentes.

Limpar Lista: Remove todos os itens da lista de uma só vez.

Sair: Encerra o ciclo de execução de forma segura.

🛠️ Tecnologias Utilizadas
Java 17+: Versão utilizada para o desenvolvimento.

ArrayList: Para manipulação dinâmica de dados em memória.

Scanner: Para interação via teclado com o usuário.

Switch Case Moderno: Implementação de lógica de decisão limpa usando as setas (->).

📖 O que eu aprendi
Durante o desenvolvimento deste projeto, foquei em resolver problemas reais de programação:

Manipulação de Listas: A diferença entre vetores fixos e o ArrayList.

Buffer do Scanner: Como lidar com o "Enter fantasma" ao alternar entre entradas numéricas (nextInt) e textuais (nextLine).

Tratamento de Índices: A lógica de conversão entre a contagem humana (base 1) e a contagem computacional (base 0).

Experiência do Usuário (UX): Manter o menu sempre visível dentro de um loop while.

💻 Como executar
Certifique-se de ter o JDK instalado.

Clone o repositório ou copie o arquivo Main.java.

Compile o código:

Bash
javac Main.java
Execute o programa:

Bash
java Main
