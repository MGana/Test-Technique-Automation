Feature: visiteur capable de voir les trois chiffres clefs de happn
	
Scenario: Acces a la page a propos
	Given Visiteur du site internet
	When J accede a la page a propos
	Then Je suis capable de voir les trois chiffres clefs de happn 
	