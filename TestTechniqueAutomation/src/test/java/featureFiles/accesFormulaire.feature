Feature: visiteur capable d accedder au formulaire de contact
	
Scenario: Acces a un formulaire de contact
	Given Visiteur du site internet
	When Je souhaite contacter le service client
	Then Je suis capable de pouvoir trouver un formulaire sur le site internet
	And  Je suis capable de remplir ce formulaire avec des informations