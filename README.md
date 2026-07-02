# Programação Orientado a Objeto

## Sobre
Repositório de estudo sobre o Paradigma Orientado a Objeto.

## Tecnologias
![Linguagem](https://img.shields.io/badge/Java-21-blue)
![IDE](https://img.shields.io/badge/-Eclipse-2C2255?style=flat-square&logo=eclipse&logoColor=white)

---
## A Modelagem Orientado a Objeto:
É um conjutno de módulos independentes(objetos), que podem ser facilmente reutilizado, modificado ou substituídos, que cooperam e colaboram entre si. <br>
Os `objetos`  encapsulam **dados** e **operações** sobre os dados, conforme o contexto de negócio do mundo real. Objetos com dados e operações similares são agrupados em `classes`.

## Conceitos-chave em Orientado a Objeto:
* **Objetos:** Representação do mundo real onde podemos utilizar e manipular;
* **Classes:** É quando o objeto possui características(`atributos`) e operações(`métodos`) semelhantes, eles são agrupados em classes;
  ```Java
  public class MassaCorporea{}
  ```

* **Atributos:** São as características que definem o objeto da classe, exemplo com MassaCorporea:
  ```Java
  public class MassaCorporea{
  //Atributos da classe:
    int peso;
    int imc;
    double altura;
    String situacao;
  }
  ```
* **Métodos:** São as ações/operações do objeto, podem ter retorno de algum tipo de dado ou não(void).
  ```Java
  public class MassaCorporea{
  //Atributos da classe:
    int peso;
    int imc;
    double altura;
    String situacao;
  //Métodos da classe:
	public void calcularImc() {
		imc = peso / (altura*altura);
		//Não dá return pois só quero armazenar o valor da conta no imc
	}
	
	public void definirSituacao() {
		if(imc < 17) {situacao = "Muito abaixo do peso.";}
		else if(imc < 18.5) {situacao = "Abaixo do peso.";}
		else if(imc < 25) {situacao = "Peso normal.";}
		else if(imc < 30) {situacao = "Acima do peso.";}
		else if(imc < 35) {situacao = "Obesidade grau 1";}
		else if(imc < 40) {situacao = "Obesidade grau 2";}
		else {situacao = "Obesidade grau 3";}
	}
  }
  ```

## Pilares de Orientação a Objeto:
* **Abstração:** Capacidade de inserir no software os elementos essenciais do mundo real. A abstração é feita através do mapeamento utilizando o processo de identificação das `classes`, `atributos` e `métodos`. <br>
Tudo isso é organizado numa tabela UML(Unified Modeling Language (Linguagem de Modelagem Unificada)).

| MassaCorporea | 
|---------------|
|- peso: int    | 
|- imc: int     | 
|- altura: double| 
|- situacao: String| 
|+ calcularIMC(): void| 
|+ definirSituacao(): void| 
