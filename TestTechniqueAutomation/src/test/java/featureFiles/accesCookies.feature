Feature: visiteur capable d'accedder aux cookies policy
	
Scenario: Acces aux cookies policy
	Given Visiteur du site internet
	When Je souhaite accéder à la page « Charte d’utilisation des cookies »
	Then J’arrive sur la page
	And  Je suis capable de voir les différents headers de la charte
	