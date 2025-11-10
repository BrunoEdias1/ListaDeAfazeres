# 📝 Gerenciador de Tarefas em Java

Um sistema simples e eficiente para gerenciamento de tarefas desenvolvido em Java, permitindo criar, listar, atualizar e remover tarefas de forma intuitiva.

## 🚀 Funcionalidades

- ✅ **Criar novas tarefas** com ID, descrição e status
- 📋 **Listar todas as tarefas** cadastradas
- 🔄 **Alterar status** das tarefas (Concluída/Pendente)
- 🗑️ **Remover tarefas** do sistema
- 🔄 **Interface de console** amigável e intuitiva

## 🏗️ Estrutura do Projeto

### 📁 Pacote: `javaMain`

#### 1. **Main.java**
- Classe principal com menu interativo
- Loop contínuo até o usuário escolher sair
- Tratamento de entrada do usuário

#### 2. **GerenciadorDeTarefas.java**
- Classe responsável pela lógica de gerenciamento
- Operações: adicionar, remover, listar e alterar status
- Armazenamento em ArrayList

#### 3. **Tarefa.java**
- Modelo de dados das tarefas
- Atributos: id, descrição, status
- Métodos getters/setters e toString formatado

## 🎯 Como Usar

### Menu Principal:
```
1. Criar uma nova tarefa
2. Listar todas as tarefas
3. Marcar uma tarefa como concluída
4. Remover uma tarefa
0. Sair
```

### Fluxo de Operações:

1. **Criar Tarefa**:
   - Informe ID numérico
   - Digite a descrição da tarefa
   - Defina o status inicial (true/false)

2. **Listar Tarefas**:
   - Exibe todas as tarefas no formato:
   ```
   Número da Tarefa: 1
   Descrição: Estudar Java
   Status: Pendente
   ```

3. **Alterar Status**:
   - Selecione a tarefa pelo número
   - Escolha: 1 (Concluída) ou 2 (Pendente)

4. **Remover Tarefa**:
   - Informe o ID da tarefa a ser removida

## 💻 Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **ArrayList** - Estrutura de dados para armazenamento
- **Scanner** - Leitura de entrada do usuário
- **Locale** - Formatação regional

## 🛠️ Requisitos

- Java JDK 8 ou superior
- Ambiente de desenvolvimento Java (IDE ou terminal)

## 📥 Compilação e Execução

```bash
# Compilar
javac javaMain/*.java

# Executar
java javaMain.Main
```

## 🎨 Exemplo de Uso

```
1. Criar uma nova tarefa
2. Listar todas as tarefas
3. Marcar uma tarefa como concluída
4. Remover uma tarefa
0. Sair
1

Adicione o ID da tarefa!
1

Adicione a descricao da tarefa!
Estudar Java

Adicione o status da tarefa
false
```

## 🔧 Características Técnicas

- **Persistência**: Dados em memória (durante execução)
- **Validações**: Verificação de índices válidos
- **Interface**: Console-based com feedback visual
- **Tratamento de Erros**: Mensagens para opções inválidas

## 📊 Estrutura de Dados

Cada tarefa contém:
- `id` (int): Identificador único
- `descricao` (String): Descrição da atividade
- `status` (boolean): `true` (Concluída) / `false` (Pendente)

## 🚧 Possíveis Melhorias Futuras

- [ ] Persistência em arquivo
- [ ] Categorização de tarefas
- [ ] Prazos e datas
- [ ] Interface gráfica (GUI)
- [ ] Busca e filtros

## 👨‍💻 Desenvolvido por

Sistema desenvolvido para fins educacionais e práticos em Java.
Dev - Bruno Edias
https://www.linkedin.com/in/bruno-edias-675647280/
---

**Versão**: 1.0  
**Última Atualização**: 2024
