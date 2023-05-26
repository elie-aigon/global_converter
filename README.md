# global_converter

Voici un convertisseur de type réalisé par mes soins.

Pour l'utiliser, télécharge le repo en entier puis lancer la commande de la classe principale avec 3 paramètres. 
Le premier est la String que vous souhaitez convertir, le deuxième est le type de cette même String et le troisième est le type visé après conversion.
La commande prendra cette forme : java GlobalConverter.java "String" "arg2" "arg3"
Voici une liste des arguments possibles pour chaque position :
Argument 2 (type d'entré) : "-d" et "decimal" -> décimal , "-h" et "hexadécimal" -> hexadécimal  ,"-b" et "binary" -> binaire et "-o" et "octal" -> octal, "-t" et "text" -> text;
Argument 3 (type de sortie) : "-d" et "decimal" -> décimal , "-h" et "hexadécimal" -> hexadécimal  ,"-b" et "binary" -> binaire et "-o" et "octal" -> octal, "-t" et "text" -> text;

Ce convertisseur ne prends pas en comtpe les caractères spéciaux mais il peut les intégrer en modifiants la regex filtrant l'entrée de la String de départ.
