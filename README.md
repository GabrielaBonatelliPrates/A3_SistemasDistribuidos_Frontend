# A3_SistemasDistribuidos_Frontend

# Sistema de Controle de Estoque Distribuído

Este projeto foi desenvolvido como parte da disciplina de **Sistemas Distribuídos** na UNISUL. O sistema realiza o controle de estoque utilizando Java.

---

## 👥 Integrantes do Grupo

| Nome Completo | RA | Usuário GitHub |
| --- | --- | --- |
| Cesar Augusto dos Santos | 10725115592 | c3sarrr |
| Davi Wolff de Abreu | 10725112049 | Davi-Wolff |
| Gabriela Bonatelli Prates | 10725112623 | GabrielaBonatelliPrates |
| Mateo Alessandro Padilla Chalela | 1072519604 | Mateo-Padilla |

---

## 🛠️ Tecnologias Utilizadas

- **Java Development Kit (JDK)**: 23.0.2
- **IDE**: Apache NetBeans 25
- **Versão de Maven**: 4.0.0
- **Conexão RMI entre os repositórios envolvidos no projeto**

---

## **🔗 Link de Repositório Parceiro**

- https://github.com/GabrielaBonatelliPrates/A3_SistemasDistribuidos_Backend.git

## ✅ Requisitos Funcionais

- **RF01: Cadastrar Produto**
Permite que o usuário crie e armazene um novo produto no estoque, informando:
    - Nome
    - Preço unitário
    - Unidade
    - Quantidade em estoque
    - Estoque mínimo e máximo
    - Categoria do produto

---

- **RF02: Atualizar Produto**
Permite que o usuário altere os dados anteriormente cadastrados de um produto.

---

- **RF03: Excluir Produto**
Permite que o usuário exclua um produto cadastrado no sistema.

---

- **RF04: Cadastrar Categoria**
Permite que o usuário crie uma nova categoria, informando:
    - Nome
    - Tamanho
    - Tipo de embalagem

---

- **RF05: Atualizar Categoria**
Permite atualizar os dados de uma categoria existente.

---

- **RF06: Excluir Categoria**
Permite excluir uma categoria cadastrada.

---

- **RF07: Movimentar Estoque**
Permite realizar acréscimos ou reduções na quantidade de produtos, de acordo com a entrada ou saída de estoque.

---

- **RF08: Listar Produtos**
Exibe uma lista com todos os produtos cadastrados. Também permite pesquisa e visualização dos dados e status de cada produto.

---

- **RF09: Listar Categorias**
Exibe uma lista com todas as categorias cadastradas, com opção de busca e visualização de dados.

---

- **RF10: Gerar Relatório de Lista de Preços**

Esta função permite que o usuário visualize o relatório de preços dos produtos.

É gerada uma tabela contendo:

- Nome do produto
- Preço unitário
- Unidade de medida
- Categoria do produto

---

- **RF11: Gerar Relatório de Balanço Financeiro**

Esta função permite que o usuário visualize o relatório físico/financeiro do estoque.

É gerada uma tabela contendo:

- Nome do produto
- Preço unitário
- Quantidade em estoque
- Valor total do produto em estoque (preço unitário × quantidade)

Além disso, o relatório exibe o valor total do estoque geral, proporcionando uma visão consolidada do estoque.

---

- **RF12: Gerar Relatório de Quantidade de Produtos por Categoria**

Esta função permite que o usuário visualize quantos produtos existem em cada categoria.

É gerada uma tabela contendo:

- Categoria do produto
- Quantidade de produtos por categoria

---

- **RF13: Gerar Relatório de Produtos Abaixo da Quantidade Mínima**

Esta função permite que o usuário visualize os produtos com estoque abaixo do mínimo cadastrado.

É gerada uma tabela contendo:

- ID do produto
- Nome do produto
- Quantidade atual em estoque
- Quantidade mínima cadastrada

---

- **RF14: Gerar Relatório de Produtos Acima da Quantidade Máxima**

Esta função permite que o usuário visualize os produtos com estoque acima do máximo cadastrado.

É gerada uma tabela contendo:

- ID do produto
- Nome do produto
- Quantidade atual em estoque
- Quantidade máxima cadastrada

---

## ✅ Requisitos não Funcionais

- **RNF01: Estética padronizada**
A interface deve apresentar um padrão visual consistente entre os frames, como botões e fontes padronizadas, assim como uma paleta de cores visualmente agradável e manter um padrão visual entre os frames, incluindo a logo do sistema de controle de estoque.

---

- **RNF02: Conexão sistema X usuário**
O sistema precisa reagir a qualquer interação do usuário o mais rápido possível.

---

- **RNF03: Disponibilidade de uso**
O sistema deve estar disponível 99% do tempo, exceto durante manutenções programadas.

---

- **RNF04: Simplicidade de utilização**
A interface deve ser intuitiva e acessível para usuários sem conhecimentos técnicos.

---

- **RNF05: Segurança de dados**
O sistema deve proteger os dados em casos de falhas ou quedas.

---

- **RNF06: Compatibilidade com Softwares externos**
O sistema deve ser totalmente compatível com o banco de dados MySQL.

---
