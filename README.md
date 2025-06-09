# 💼 FlexERP – ERP Modular Multiempresa, Multiusuário e Multiidioma

![GitHub last commit](https://img.shields.io/github/last-commit/grupoabik/flexerp)
![GitHub language count](https://img.shields.io/github/languages/count/grupoabik/flexerp)
![GitHub repo size](https://img.shields.io/github/repo-size/grupoabik/flexerp)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

---

## 🧭 Visão Geral

O **FlexERP** é um sistema ERP (Enterprise Resource Planning) moderno, modular e escalável, com suporte **nativo a múltiplas empresas, usuários e idiomas**.

> ⚙️ **Multiempresa + Multiusuário + Multiidioma (🇧🇷 PT-BR, 🇺🇸 EN-US, 🇪🇸 ES-ES)**

---

## 🎯 Objetivos

- [x] Estrutura de projeto profissional com modularização por domínio
- [x] Multiempresa e multiusuário desde o design inicial
- [x] Suporte completo a múltiplos idiomas
- [ ] API REST com Spring Boot
- [ ] Persistência com banco de dados relacional
- [ ] Internacionalização automática por perfil ou configuração
- [ ] Interface amigável e responsiva

---

## 🌐 Suporte de Idiomas

O FlexERP será construído com **internacionalização (i18n)** embutida, suportando:

| Idioma        | Código ISO |
|---------------|------------|
| Português (Brasil) | `pt-BR`     |
| Inglês (EUA)       | `en-US`     |
| Espanhol (Espanha) | `es-ES`     |

> 🔄 Detecção automática por navegador, usuário ou configuração de empresa.

---

## 🛠️ Tecnologias

| Camada         | Ferramentas |
|----------------|-------------|
| Backend        | Java 21, Maven, MVC |
| IDE            | IntelliJ IDEA Community |
| Build          | Apache Maven 3.9+ |
| Controle de versão | Git + GitHub |
| i18n (futuro)  | Arquivos `.properties` por idioma |
| JSON Support   | Jackson Databind |

---

## 📁 Estrutura de Pastas

```bash
src/
 └── main/
     └── java/
         └── com.abitec.flexerp/
             ├── config/
             ├── core.util/
             ├── financeiro/
             │   ├── controller/
             │   ├── model/
             │   └── service/
             ├── security/
             └── FlexErpApplication.java
