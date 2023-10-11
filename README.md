# GerenciamentoInventario - Daywid Jerry Mendes
- Gerenciamento de inventario com padrão de projeto Abstract Factory e injeção de dependencia

Escolhas de design: 

- Utilizei a injeção de dependência do Spring para fornecer as fábricas de produtos para a classe InventoryManager, para desacoplar as dependências e facilitar a substituição de implementações no futuro.

- utilizei uma hierarquia de classes de produtos com a classe base abstrata Product e implementações específicas como Smartphone, Notebook, Camisa e Jeans. Isso permite que sejam representados diferentes tipos de produtos de maneira organizada.



## Executando o Sistema
Execute o arquivo Main localizado em 
src/main/java/com/gerenciamentoInventario/day/DayApplication.java usando sua IDE.

O sistema será iniciado e você verá os logs no console.

O sistema executará algumas operações de exemplo, como adicionar e remover produtos, e listar o inventário.

Você pode personalizar o funcionamento do sistema editando o método main em DayApplication.java ou criando seus próprios métodos e operações.
