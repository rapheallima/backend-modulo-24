# M'odulov 24: Projeto: Contrato Service

Este projeto demonstra a implementação de um serviço simples de gerenciamento de contratos com funcionalidades básicas, como salvar, buscar, excluir e atualizar contratos. Ele utiliza interfaces para abstração e mocks para simulação em testes.

## Estrutura do Projeto

- **Interfaces:**
  - `IContratoDao`: Define os métodos para interação com o banco de dados (salvar, buscar, excluir, atualizar).
  - `IContratoService`: Define os métodos de serviço utilizados pelo sistema.

- **Implementações:**
  - `ContratoDao`: Implementação real de `IContratoDao` que lança exceções simulando um banco não funcional.
  - `ContratoService`: Implementação de `IContratoService` que utiliza um DAO para realizar as operações.

- **Mocks:**
  - `ContratoDaoMock`: Implementação simulada de `IContratoDao` para testes unitários, retornando valores esperados.

- **Testes:**
  - `ContratoServiceTest`: Testa as funcionalidades do serviço com DAO real e mock.
  - Testes incluem casos para salvar, buscar, excluir e atualizar contratos.

## Funcionalidades

1. **Salvar Contrato:** Registra um novo contrato.
2. **Buscar Contrato:** Retorna o contrato correspondente ao ID fornecido.
3. **Excluir Contrato:** Remove um contrato pelo ID.
4. **Atualizar Contrato:** Atualiza os dados de um contrato pelo ID.

## Tecnologias Utilizadas

- **Java**: Linguagem principal.
- **JUnit**: Framework de testes unitários.

## Como Rodar os Testes

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
