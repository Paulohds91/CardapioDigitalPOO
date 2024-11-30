# **Cardápio Digital - CB BURGER**

Bem-vindo ao repositório do **Cardápio Digital**! Este projeto foi desenvolvido como parte da disciplina de **Programação Orientada a Objetos** e tem como objetivo solucionar problemas de comunicação e experiência do cliente na hamburgueria **CB BURGER**.

---

## **Sobre o Projeto**

O Cardápio Digital foi projetado para facilitar a navegação dos clientes pelos itens disponíveis na hamburgueria. Com uma interface amigável e intuitiva, ele permite que os clientes acessem facilmente as informações sobre os produtos e realizem seus pedidos de maneira prática.

Este projeto foi desenvolvido utilizando **Java**, integrado a um banco de dados relacional e hospedado localmente via **localhost** para testes.

---

## **Como Usar o Cardápio Digital**

### **Pré-requisitos**
Antes de começar, certifique-se de que você possui as seguintes ferramentas instaladas:
- **Java JDK 11 ou superior**
- **IDE** de desenvolvimento (recomendamos o Eclipse ou IntelliJ IDEA)
- **MySQL** ou outro banco de dados relacional
- Navegador web para acessar o localhost

---

### **Passos para Configuração**

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/cardapio-digital.git
   cd cardapio-digital
   ```

2. **Configure o Banco de Dados**
   - Crie um banco de dados no MySQL.
   - Importe o arquivo SQL (`schema.sql`) disponível no repositório para criar as tabelas necessárias.

3. **Configure o Projeto**
   - Abra o projeto em sua IDE preferida.
   - Atualize o arquivo de configurações de banco de dados (`application.properties` ou equivalente) com as credenciais do seu servidor MySQL:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```

4. **Execute a Aplicação**
   - Inicie o servidor local através da sua IDE ou pelo terminal:
     ```bash
     mvn spring-boot:run
     ```

5. **Acesse o Cardápio Digital**
   - Abra o navegador e acesse:
     ```
     http://localhost:8080
     ```

---

## **Funcionalidades do Cardápio**

- **Visualizar Produtos:** Consulte o menu completo com informações detalhadas de cada item.
- **Adicionar Produtos:** Atualize o cardápio de forma dinâmica, incluindo novos produtos ou modificando os existentes.
- **Gerenciar Pedidos:** Registre e gerencie os pedidos realizados pelos clientes.

---

## **Demonstração**

A apresentação completa do projeto pode ser acessada [neste link](https://view.genially.com/6730cfdef1245ddb85f78dfb/presentation-trabalho-de-programacao-orientada-a-objetos-em-java). 

---

## **Contribuidores**

- **Clayton Zordan Costa**
- **Paulo Henrique da Silva**
- **Stanley Wendel Porto Dos Santos**
- **William John Ferreira Rodrigues da Silva**
- **Mario Heberth Barbosa Leal**

---

## **Licença**

Este projeto foi desenvolvido para fins acadêmicos e está sob a licença **MIT**. Sinta-se à vontade para usar e adaptar o código para projetos similares.

---

Com esse README, você pode organizar as informações do projeto, ensinar como utilizá-lo e incluir o link da apresentação de forma clara e profissional.
