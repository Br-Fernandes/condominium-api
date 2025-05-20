<h1 align="center" id="title">Condominium API</h1>

<p id="description">Este projeto é uma API desenvolvida para gerenciar as operações de um condomínio implementando as regras da Arquitetura Hexagonal. A arquitetura Hexagonal também conhecida como Ports and Adapters é um padrão de design que visa desacoplar a lógica de negócios da infraestrutura permitindo que a aplicação seja facilmente testável e adaptável a diferentes interfaces de usuário e fontes de dados.</p>

<h2>🛠️ Passos de Instalação:</h2>

<p>1. Clone o repositório.</p>

<p>2. Abra o projeto em sua IDE: IntelliJ IDEA (recomendado) ou Eclipse.</p>

<p>3. Se você estiver usando o IntelliJ IDEA certifique-se de que a IDE abra o projeto como Maven e reconheça o projeto como um projeto Spring Boot. Além disso você deve alterar o diretório de trabalho do projeto para que as views (as páginas da web que serão exibidas) sejam encontradas pelo Spring Boot (consulte as Diretórios Web no IntelliJ IDEA).</p>

<p>4. Certifique-se de que você está no diretório io.github.brfernandes.condominiumapi.</p>

<p>5. Configure a conexão com o banco de dados no arquivo application.properties.</p>

<p>6. Execute o projeto (executando o método principal em CondominiumApiApplication.java).</p>

  
  
<h2>💻 Built with</h2>

Tecnologias utilizadas no projeto:

*   Java 17
*   Spring Boot
*   H2

<h2>Endpoints</h2>

|  | Endpoint                                     | Descrição                          |
|--------|----------------------------------------------|-----------------------------------|
| GET    | http://localhost:8082/api/v1/residents      | Obtém a lista de residentes        |
| POST   | http://localhost:8082/api/v1/residents      | Cria um novo residente             |
| GET    | http://localhost:8082/api/v1/users          | Obtém a lista de usuários          |
| POST   | http://localhost:8082/api/v1/users          | Cria um novo usuário               |
| GET    | http://localhost:8082/api/v1/visitors       | Obtém a lista de visitantes        |
| POST   | http://localhost:8082/api/v1/visitors       | Cria um novo visitante             |
| GET    | http://localhost:8082/api/v1/visitors/{rg}  | Obtém informações de um visitante  |