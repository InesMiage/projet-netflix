# Webflix

## Introduction

Webflix est un projet réalisé dans le cadre de la formation du Master MIAGE pour l'UE d'Applications Web.
Ce projet consiste à réaliser une application de vidéo à la demande (comme [Netflix][]).
Le contenu de l'application se base sur une liste de films "open-source" : [List of open-source films][].

## Equipe

* Albasser Sylvain : [Pandraghon][]
* Neghouche Akim : [Akim0992][]
* Rajiallah Ines : [InesMiage][]

## Installation

### Prérequis

[Git][] et [JDK 8 update 20 ou plus récent][JDK8 build]  
Assurez-vous que la variable d'environnement `JAVA_HOME` pointe vers le dossier `jdk1.8.0`.

Pour le CSS, le framework Sass [Compass][] est utilisé. Pour l'utiliser, il faut que [Ruby][] soit installé.

### Téléchargement des sources

Clonez le projet  
`git clone git@github.com:Pandraghon/projet-netflix.git`  
ou [télechargez le ZIP][ZIP]

### Importation des sources dans l'IDE

#### Eclipse

`File > Import > Git > Projects from Git`

#### NetBeans

`Team > Git > Clone`

### Compilation

`Run As... > Maven Build` Goals : `spring-boot:run`

## Organisation des fichiers

```
.
+-- src/main/
|   +-- java/project/
|   |   +-- controllers/
|   |   |   +-- // ...
|   |   +-- models/
|   |   |   +-- // ...
|   |   +-- repositories/
|   |   |   +-- // ...
|   |   +-- Application.java
|   +-- resources/
|   |   +-- static/
|   |   |   +-- css/
|   |   |   |   +-- // ...
|   |   |   +-- img/
|   |   |   |   +-- // ...
|   |   |   +-- js/
|   |   |   |   +-- // ...
|   |   |   +-- sass/
|   |   |   |   +-- // ...
|   |   |   +-- vid/
|   |   |   |   +-- // ...
|   |   +-- templates/
|   |   |   +-- fragments/
|   |   |   |   +-- // ...
|   |   |   +-- // ...
|   |   +-- application.properties
+-- config.rb
+-- pom.xml
```

### Maven

La configuration Maven se trouve dans le fichier [pom.xml](/pom.xml).

### CSS

Pour réaliser le style de ce projet, le framework Sass [Compass] a été utilisé.  
La configuration du projet pour Compass se trouve dans le fichier [config.rb](/config.rb).  
Pour ajouter ou modifier du style, cela se fait dans le dossier [sass/](../../tree/master/src/main/resources/static/sass). Pour générer les fichiers CSS finaux, il faut exécuter Compass dans le dossier où se trouve le fichier de configuration (ici, à la racine du projet).

## Documentation

* [Java JSE 8 Documentation][]
* [Spring Documentation][]
* [Thymeleaf Documentation][]


[Netflix]: https://www.netflix.com
[List of open-source films]: https://en.wikipedia.org/wiki/List_of_open-source_films
[Pandraghon]: https://github.com/Pandraghon
[Akim0992]: https://github.com/Akim0992
[InesMiage]: https://github.com/InesMiage
[Git]: http://help.github.com/set-up-git-redirect
[JDK8 build]: http://www.oracle.com/technetwork/java/javase/downloads
[ZIP]: https://github.com/Pandraghon/projet-netflix/archive/master.zip
[Compass]: http://compass-style.org/
[Ruby]: http://www.ruby-lang.org/en/downloads/
[Java JSE 8 Documentation]: https://docs.oracle.com/javase/8/docs/api/
[Spring Documentation]: https://spring.io/docs
[Thymeleaf Documentation]: http://www.thymeleaf.org/documentation.html