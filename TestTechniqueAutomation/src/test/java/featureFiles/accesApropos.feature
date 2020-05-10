Feature: visiteur capable de voir les 3 chiffres clefs de happn
	
Scenario: Acces a la page a propos
	Given Visiteur du site internet
	When J’accède à la page « à propos »
	Then Je suis capable de voir les 3 chiffres clefs de happn 
	