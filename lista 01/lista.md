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

RESPOSTA:  As três classes mencionadas são utilizadas para se comunicar com umbanco de dados em um programa Java.

A classe Connection é responsável por estabelecer conexão com o banco de dados e gerenciar essa conexão. Ela permite que o programa se conecte a um banco de dados específico e execute operações nele.

A classe PreparedStatement é utilizada para executar consultas SOL.
Ela permite que defina parâmetros em uma consulta SQL e execute consulta com diferentes valores para esses parâmetros. Isso é útil para evitar ataques de injeção de SQL e para melhorar o desempenho. 

A classe Statement é utilizada para executar consultas SQL simples. Ela permite que o programador execute
uma consulta SOL diretamente no banco de dados sem a
necessidade de definir parâmetros. No entanto, ela não é tão segura quanto a classe PreparedStatement, pois não oferece proteção contra ataques de injeção de SQL.

6. Considere a execução de uma query SQL no banco de dados. Se esperamos um retorno de dados do banco de dados devemos usar a classe Statement ou PreparedStatement? Justifique. (Dica: é possível usar ambas; procure a diferença técnica entre as classes.).

RESPOSTA: Seria PreparedStatement em vez da classe Statement. A classe PreparedStatement fornece um mecanismo mais seguro e eficiente para executar consultas SQL parametrizadas. Ela permite que os parâmetros da consulta sejam definidos dinamicamente, evitando a injeção de SQL, que é uma vulnerabilidade comum de segurança em aplicativos que usam consultas SQL dinâmicas.

7. Com as suas próprias palavras, diferencie SWING do WINDOWBUILDER.

RESPOSTA: SWING e WINDOWBUILDER são duas tecnologias usadas para criar interfaces gráficas de usuário em Java, mas há diferenças importantes entre elas.
SWING é uma biblioteca de componentes nativa do Java que faz parte do conjunto de ferramentas Java Foundation Classes (JFC). Ele fornece um conjunto de classes para criar e gerenciar elementos de interface de usuário, como botões, caixas de texto, listas, menus e janelas. SWING é uma tecnologia de GUI programática, o que significa que o desenvolvedor escreve o código Java correspondente para criar e gerenciar os elementos de interface do usuário.
WINDOWBUILDER é uma ferramenta de design de GUI visual para Java que utiliza a tecnologia SWING. Ele permite que os desenvolvedores criem interfaces gráficas de usuário arrastando e soltando componentes na tela, sem precisar escrever manualmente o código Java correspondente. O WINDOWBUILDER é uma tenologia de GUI visual, o que significa que o desenvolvedor pode criar a GUI visualmente sem precisar escrever o código Java correspondente.
Resumindo, enquanto SWING é uma biblioteca de componentes GUI programática do Java, WINDOWBUILDER é uma ferramenta de design de GUI visual que utiliza a tecnologia SWING. O SWING fornece as classes e métodos para criar e gerenciar os elementos de interface de usuário.