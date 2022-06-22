# Projet_MicroServices_Kafka

## L'objectif

Création d'un système  distribué basé sur les micros services permet de gérer les factures des clients en y intégrant un bus de messagerie avec KAFKA et un Service de Stream processing avec Kafka Streams selon le shema suivant:


![image](https://user-images.githubusercontent.com/102171913/175132649-0c7bfd9f-5e69-489c-b724-89fd989cf756.png)


## Partie1 : (Les micros services)

création des micros services pour gèrer les services clients, inventaire et la facturation  

### 1er Micro_Service: Customer service

ce service permet de gérer les clients, d'abord on doit definir les attributs de notre client dans la class customer puis on a creer l'interface CustomerRepository pour que on peut faire des modification sur la base de données.


![image](https://user-images.githubusercontent.com/102171913/173146298-856775b7-6735-4dad-a6b1-0d2a14fa5636.png)


![image](https://user-images.githubusercontent.com/102171913/173150268-6cc164b5-c67a-41c4-b437-7e3f88b2815c.png)


### 2eme  Micro_Service: Inventory service

ce service permet de gérer le produits


![image](https://user-images.githubusercontent.com/102171913/173183831-178d0576-06e4-400e-9c5b-cb2c8f7a6cf1.png)


### 3eme  Micro_Service: Gateway service

permet une communication entre le client et ses besoins utilisant une configuration statique ou bien dynamique 

### 4eme  Micro_Service: Eureka service

c'est le service d'enregistrement par l'ajoute d'annotation 
#### @EnableEurekaServer


![image](https://user-images.githubusercontent.com/102171913/173151292-f7e2d880-29ea-4b80-903d-5329d8f0e9da.png)


Dans *instances curretly registered with Eureka* on peut voir les micro services enregistrés


![image](https://user-images.githubusercontent.com/102171913/173151569-dcf46274-ce50-4d09-a76f-7eb282d0dea3.png)

 
### 5eme  Micro_Service: Biling service

Service qui permet de gerer les factures, ce service et communiquer avec les autres service a travers un Service Spring cloud feign d'une maniere déclarative pour avoir une information 
sur le client et le produits consomé


![image](https://user-images.githubusercontent.com/102171913/173152321-f07875d9-3f4e-4617-bc62-8775fa45f514.png)


![image](https://user-images.githubusercontent.com/102171913/173152330-28c27906-09a4-4eee-adce-05f15870aa9c.png)


![image](https://user-images.githubusercontent.com/102171913/173182589-4d92e8c3-2726-473f-8f78-bd996bed0443.png)



## Partie2 : (Kafka)


Dans cette partie on va mis en place la solution de messagerie asynchrone avec le broker KAFKA


### a) Mettre en place le Broker Kafka:


vous pouvez consulter la partie initialistion dans cette repository https://github.com/mlabir/Tp_Spring_Cloud_Streams_Fucntions_Kafka  pour apprendre comment on peut initialiser notre Broker Kafka 


### b) Simulateur kafka-Producer :


ona creer un micro-service Spring Boot qui permet de simuler un producer-kafka et envoyer chaque seconde un message à un topic *FACTURATION* 


### c) Base de données FACTURATION :


![image](https://user-images.githubusercontent.com/102171913/173154150-47b1ae8d-00ef-4085-b73c-e1c57ad330e7.png)


![image](https://user-images.githubusercontent.com/102171913/173153774-d97a6b83-6f90-4c48-96cc-807b089757cd.png)


