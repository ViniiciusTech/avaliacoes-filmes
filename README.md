# 📽️ Avaliações de Filmes – Sistema Web com Spring MVC

## 🎯 Propósito do Projeto

Este projeto tem como objetivo desenvolver um sistema web para uma **casa cultural com sala de cinema**, permitindo que visitantes:

- Cadastrem filmes assistidos
- Visualizem uma lista de filmes
- Acessem detalhes de cada filme
- Adicionem análises e notas sobre os filmes

O sistema foi desenvolvido como parte de um exercício prático de arquitetura web e desenvolvimento com **Spring MVC**, com foco em **armazenamento em memória** (sem banco de dados) para testes iniciais.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Spring MVC**
- **Thymeleaf** (para renderização de páginas HTML)
- **HTML5 + CSS3**
- **Git** (controle de versão)
- **NetBeans IDE 25**

---

## 🧱 Estrutura do Projeto

- `model/` – Entidades `Filme` e `Analise`
- `repository/` – Armazenamento em memória com listas
- `controller/` – Lógica de controle e rotas HTTP
- `templates/` – Páginas HTML com Thymeleaf
- `static/` – (opcional) arquivos CSS ou JS

---

## 📷 Funcionalidades

- ✅ Cadastro de filmes com título, sinopse, gênero e ano
- ✅ Listagem de todos os filmes cadastrados
- ✅ Página de detalhes de cada filme
- ✅ Cadastro de análises com nota e comentário
- ✅ Armazenamento em memória (sem banco de dados)

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/ViniiciusTech/avaliacoes-filmes.git
   ```