# GerenciamentoInventario - Daywid Jerry Mendes
## gerenciamento de inventario padrão de projeto Abstract Factory e injeção de dependencia

Escolhas de design: 

- Utilizei a injeção de dependência do Spring para fornecer as fábricas de produtos para a classe InventoryManager, para desacoplar as dependências e facilitar a substituição de implementações no futuro.

- utilizei uma hierarquia de classes de produtos com a classe base abstrata Product e implementações específicas como Smartphone, Notebook, Camisa e Jeans. Isso permite que sejam representados diferentes tipos de produtos de maneira organizada.
