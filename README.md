# 💼 FlexERP – ERP Modular Multiempresa, Multiusuário e Multiidioma

![GitHub last commit](https://img.shields.io/github/last-commit/grupoabik/flexerp)
![GitHub language count](https://img.shields.io/github/languages/count/grupoabik/flexerp)
![GitHub repo size](https://img.shields.io/github/repo-size/grupoabik/flexerp)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

---

## 🧭 Visão Geral

<<<<<<< HEAD
O **FlexERP** é um sistema ERP (Enterprise Resource Planning) moderno, modular e escalável, com suporte **nativo a múltiplas empresas, usuários e idiomas**.

> ⚙️ **Multiempresa + Multiusuário + Multiidioma (🇧🇷 PT-BR, 🇺🇸 EN-US, 🇪🇸 ES-ES)**
=======
O **FlexERP** é um sistema ERP (Enterprise Resource Planning) moderno, modular e escalável, com suporte nativo a:

- **Múltiplas empresas**
- **Múltiplos usuários**
- **Múltiplos idiomas** (🇧🇷 Português, 🇺🇸 Inglês, 🇪🇸 Espanhol)

A arquitetura é pensada para facilitar integrações futuras com microserviços, inteligência artificial e uma interface web moderna.
>>>>>>> b2b6287 (docs: adiciona README.md completo e profissional)

---

## 🎯 Objetivos

<<<<<<< HEAD
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
=======
- [x] Estrutura modular por domínio (`financeiro`, `security`, `core.util`)
- [x] Separação em camadas (model, service, controller)
- [x] Multiempresa e multiusuário desde o design
- [x] Suporte a internacionalização (i18n)
- [ ] Evolução com Spring Boot + API REST
- [ ] Persistência com banco de dados relacional (JPA/Hibernate)
- [ ] Interface web (Angular ou React)
- [ ] Camada de autenticação JWT

---

## 🌐 Suporte de Idiomas (i18n)

O sistema será capaz de alternar dinamicamente os idiomas com base no perfil do usuário ou configuração da empresa. Suporte previsto:
>>>>>>> b2b6287 (docs: adiciona README.md completo e profissional)

| Idioma        | Código ISO |
|---------------|------------|
| Português (Brasil) | `pt-BR`     |
| Inglês (EUA)       | `en-US`     |
| Espanhol (Espanha) | `es-ES`     |

<<<<<<< HEAD
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
=======
Arquivos `.properties` personalizados serão implementados na pasta `resources`.

---

## 🛠️ Tecnologias Utilizadas

| Camada         | Tecnologias/Ferramentas           |
|----------------|------------------------------------|
| Linguagem      | Java 21                            |
| Build Tool     | Maven                              |
| IDE            | IntelliJ IDEA Community Edition    |
| VCS            | Git + GitHub                       |
| JSON           | Jackson Databind                   |
| Suporte i18n   | Java `ResourceBundle` + `.properties` |
| Testes         | (em breve) JUnit + Mockito         |
>>>>>>> b2b6287 (docs: adiciona README.md completo e profissional)

---

## 📁 Estrutura de Pastas

```bash
src/
<<<<<<< HEAD
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
=======
└── main/
    ├── java/
    │   └── com/
    │       └── abitec/
    │           └── flexerp/
    │               ├── config/
    │               ├── core/
    │               │   └── util/
    │               ├── financeiro/
    │               │   ├── controller/
    │               │   ├── model/
    │               │   └── service/
    │               └── security/
    └── resources/
        └── i18n/
            ├── messages_pt_BR.properties
            ├── messages_en_US.properties
            └── messages_es_ES.properties
```

---

## 📌 Funcionalidades atuais

- ✅ Cadastro de empresas (`Empresa`)
- ✅ Vinculação de usuários a empresas
- ✅ Cadastro e listagem de contas financeiras
- ✅ Organização modular e escalável
- ✅ Estrutura de internacionalização criada
- ✅ Publicado no GitHub com branches `master` e `dev`

---

## 🚀 Como executar o projeto

### Clonar o repositório
```bash
git clone git@github.com:grupoabik/flexerp.git
cd flexerp
```

### Abrir no IntelliJ IDEA
1. File > Open > Selecione a pasta `flexerp`
2. Aguarde o Maven sincronizar
3. Clique com o botão direito em `Main` > Run

---

## 🧪 Testes (em breve)

Em futuras versões, testes unitários e de integração serão adicionados com cobertura de segurança, persistência e API REST.

---

## 📌 Roadmap técnico

- [ ] Módulo `security` com autenticação
- [ ] Configuração de banco H2 para testes locais
- [ ] Spring Boot com endpoints RESTful
- [ ] Sistema de permissões por perfil
- [ ] Interface administrativa web com Angular/React
- [ ] Relatórios por empresa e por usuário
- [ ] Integração com IA para análise financeira

---

## 🤝 Contribuidores

| Nome                     | Função                    |
|--------------------------|---------------------------|
| André Luiz G. de Moraes  | Arquiteto e Desenvolvedor |

---

## 📄 Licença

Distribuído sob a licença MIT.  
Veja `LICENSE` para mais detalhes.

---

> FlexERP — um ERP flexível, inteligente e preparado para o futuro da gestão.
>>>>>>> b2b6287 (docs: adiciona README.md completo e profissional)
