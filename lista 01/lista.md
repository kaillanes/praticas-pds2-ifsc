1. Pesquise e descreva: no contexto de programação, o que é uma “biblioteca” e o que é uma “API”? Diferencie ambas utilizando as suas próprias palavras. 

RESPOSTA: Biblioteca é um conjunto de funçoes pré - construidas, responsável para criação de códigos para um programa. 
API: É a interface de programação de aplicativos,onde possui um conjunto de regras, protocolos e ferramentas que definem como interações entre diversos softwares serão executadoss, no caso se comunicando entre si.

2. Defina brevemente e descreva a razão para se utilizar os padrões de projetos abaixo:

 MVC: É um padrão de arquitetura em software onde traz beneficios para o desenvolvimento.
O principio básico dele é a divisão da aplicação em três camadas: camada de interação do usuário(view), camada de manipulação dos dados(model),e camada de controle(controller). Tendo como função a organização dos códigos em camadas.

 DAO: Padrão para aplicação com linguagens de programação orientada a objetos e arquitetura MVC. São necessárias por ser responsavel por trocar informções com o sgbd, ele encapsula o acesso ao dato source fornecendo uma interface para que as diversas outras camadas da aplicação possa se comunicar com o data source. Tendo como função garantir a modularidade e flexibilidade no gerenciamento de conexoes com o banco de dados e manipulação de dados.

 Singleton: Permite criar objetos unicos para os quais há apenas uma instancia. Oferece um ponto de acesso global , assim como uma variável global porém sem as desvantagens das variáveis global. Tendo como função garantir que uma unica instancia de classe seja criada e usada em todo o sistema para exercer melhor o controle de uso de recursos e evitar a duplicação desnecessárias dos objetos.

3. O que é JDBC e como ele se relaciona com bancos de dados e a programação em Java? 
 RESPOSTA: Interface de programação para acessar um banco de dados relacional usando a linguagem Java. Onde permite que os desenvolvedores  acessem e gerenciem os dados e armazenados na base de dados.

4. O que significa “CRUD” e como ele se  relaciona com os quatro métodos que implementamos em nossas classes DAO?

RESPOSTA: Sequência de funções de um sistema que trabalha com banco de dados, se relaciona diretamente com os quatro métodos básicos que implementarmos em classes, como: Create, Read, Update, Delete. Métodos essenciais para implementaçoes básicas de CRUD em classes DAO, permitindo nos criar, ler, atualizar e deletar informações de entidades do nosso sistema.

5. Explique brevemente e com suas palavras qual a utilidade das três classes abaixo:
Connection : Resposável por estabelecer a conexão com o banco de dados, bem como gerenciar essa conexão. Com essa classe é possivel executar consultas SQL e atualizações no banco de dados.


PreparedStatement
Statement

