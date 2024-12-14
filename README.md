# Parking Spot Control API

## Visão Geral

**Parking Spot Control** é uma aplicação Spring Boot que permite gerenciar vagas de estacionamento de forma eficiente e organizada. Com esta API, os usuários podem facilmente criar, ler, atualizar e excluir registros de vagas. A aplicação foi projetada para ser escalável e robusta, utilizando algumas das melhores práticas de desenvolvimento em Java.

### Principais Funcionalidades:

- **Gerenciamento Completo**: Permite a criação, leitura, atualização e exclusão de vagas de estacionamento.
- **Validação de Dados**: Utiliza a validação Bean do Jakarta para garantir que os dados inseridos estejam corretos.
- **Verificação de Conflitos**: Possui métodos para verificar se uma vaga ou placa já está em uso antes da criação.
- **Paginação**: Suporte à paginação ao recuperar todas as vagas, facilitando a visualização em grandes conjuntos de dados.

## Tabela de Conteúdos

- [Recursos](#recursos)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Começar](#como-começar)
  - [Pré-requisitos](#pré-requisitos)
  - [Instalação](#instalação)
  - [Executando a Aplicação](#executando-a-aplicação)
- [Endpoints da API](#endpoints-da-api)
- [Estrutura do Projeto](#estrutura-do-projeto)

## Recursos

- Criar, ler, atualizar e excluir registros de vagas de estacionamento.
- Validar dados de entrada usando Jakarta Bean Validation.
- Verificar registros existentes com base na placa do veículo, número da vaga e apartamento/bloco.
- Suporte à paginação para recuperar todas as vagas de estacionamento.

## Tecnologias Utilizadas

- **Java 23**: Linguagem de programação utilizada para a aplicação.
- **Spring Boot 3.3.4**: Framework para construir a API REST.
- **Spring Data JPA**: Para interagir com o banco de dados usando JPA.
- **MySQL**: Banco de dados para armazenar registros de vagas de estacionamento.
- **Maven**: Gerenciador de dependências e ferramenta de build.

## Como Começar

### Pré-requisitos

Antes de começar, certifique-se de que você atendeu aos seguintes requisitos:

- Java Development Kit (JDK) 23 ou superior instalado em sua máquina.
- Maven instalado em sua máquina.
- Servidor MySQL em execução e acessível.

### Instalação

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/MarceloB-Junior/parking_spot_control_api.git
   cd parking_spot_control_api
   ```

2. **Configure o banco de dados**:
   - Crie um novo banco de dados no MySQL (por exemplo, `parking_control`).
   - Atualize o arquivo `application.properties` localizado em `src/main/resources` com suas credenciais do banco de dados:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/parking_control
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Instale as dependências**:
   ```bash
   mvn install
   ```

### Executando a Aplicação

Para executar a aplicação, use o seguinte comando:

```bash
mvn spring-boot:run
```

A aplicação será iniciada em `http://localhost:8080`.

## Endpoints da API

### Criar uma Vaga de Estacionamento

**POST** `/parking-spot`

Corpo da Requisição:
```json
{
    "parkingSpotNumber": "A1",
    "licensePlateCar": "ABC1234",
    "brandCar": "Toyota",
    "modelCar": "Corolla",
    "colorCar": "Azul",
    "responsibleName": "John Doe",
    "apartment": "101",
    "block": "A"
}
```

### Obter Todas as Vagas de Estacionamento

**GET** `/parking-spot`

### Obter uma Vaga de Estacionamento por ID

**GET** `/parking-spot/{id}`

### Atualizar uma Vaga de Estacionamento

**PUT** `/parking-spot/{id}`

Corpo da Requisição:
```json
{
    "parkingSpotNumber": "A1",
    "licensePlateCar": "XYZ5678",
    "brandCar": "Toyota",
    "modelCar": "Corolla",
    "colorCar": "Vermelho",
    "responsibleName": "Jane Doe",
    "apartment": "102",
    "block": "B"
}
```

### Excluir uma Vaga de Estacionamento

**DELETE** `/parking-spot/{id}`

## Estrutura do Projeto

```
parking-control/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── api/
│   │   │           └── parking_control/
│   │   │               ├── configs/
│   │   │               ├── controllers/
│   │   │               ├── dtos/
│   │   │               ├── exceptions/          
│   │   │               ├── models/
│   │   │               ├── repositories/
│   │   │               └── services/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```
# Agradecimentos

Meus agradecimentos à **Michelli Brito**, arquiteta e desenvolvedora Fullstack, por sua significativa contribuição ao meu entendimento sobre **Spring Boot** e **API REST**. Michelli é uma referência na comunidade de desenvolvimento Java, reconhecida por suas palestras e conteúdos educacionais.

Michelli foi premiada como **Microsoft MVP** na categoria **Developer Technologies** em quatro anos consecutivos: **2020, 2021, 2022 e 2023**. Este prêmio destaca sua influência e expertise na área, especialmente em Java e Spring Boot. Além disso, Michelli é co-autora do livro *Spring Boot: Da API REST aos Microservices*, que tem sido uma valiosa fonte de aprendizado para mim e muitos outros profissionais.