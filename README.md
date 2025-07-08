
# 💱 Conversor Monetário - Java 17 + API ExchangeRate

Este projeto é um conversor de moedas desenvolvido em **Java 17**, que utiliza a **API ExchangeRate** para buscar cotações em tempo real entre diferentes moedas.

---

## 📝 Descrição do Projeto

O **Conversor Monetário** permite ao usuário escolher entre diversas conversões de moedas internacionais e obter o valor convertido com base na taxa de câmbio atual. O sistema é totalmente interativo via terminal e se conecta à internet para realizar as consultas em tempo real.

---

## ⚙️ Funcionalidades

- Menu com 6 tipos de conversão monetária.
- Conversão de valores utilizando a **ExchangeRate API**.
- Exibição do valor convertido formatado.
- Suporte para moedas como:
  - Real Brasileiro (BRL)
  - Dólar Americano (USD)
  - Euro (EUR)
  - Iene Japonês (JPY)
  - Yuan Chinês (CNY)
- Interface simples via terminal.
- Encerramento seguro via opção “Sair”.

---

## 🚀 Como usar

### ✅ Pré-requisitos

- Java 17 instalado.
- Biblioteca [Gson](https://github.com/google/gson) adicionada ao projeto.
- Chave de API válida do [ExchangeRate](https://www.exchangerate-api.com/).

### 💻 Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-monetario-java.git
   ```

2. Acesse a pasta do projeto e abra no seu IDE Java (IntelliJ, Eclipse ou outro).

3. Insira sua **chave de API** no código, no local indicado:
   ```java
   String apiKey = "SUA_CHAVE_API_AQUI";
   ```

4. Execute a classe `Principal.java`.

5. Siga as instruções no menu interativo e digite o valor que deseja converter.

---

## 📌 Exemplo de uso

```text
=== Conversor Monetário ===
1. Real para Dólar
2. Dólar para Euro
3. Real para Iene japonês
4. Yuan chinês para Real
5. Real para Euro
6. Euro para Iene japonês
7. Sair
Escolha uma opção: 1
Digite o valor a ser convertido: 100
Valor convertido: 18.87 USD
```

---

## 🛠 Tecnologias utilizadas

- Java 17
- API HTTP Client (java.net.http)
- Gson para parsing de JSON
- ExchangeRate API

---

## 🤝 Contribuições

Sinta-se à vontade para contribuir com melhorias ou sugestões! Basta fazer um *fork* e enviar um *pull request* 🚀

---

## 📄 Licença

Este projeto é de uso educacional, sem fins lucrativos ou comerciais.
