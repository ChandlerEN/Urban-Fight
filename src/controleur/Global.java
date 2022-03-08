package controleur;

/**
 * Regroupement des constantes de l'application
 * @author emds
 *
 */
public interface Global {
	
	public static final Integer PORT = 6666 ;
	
	// fichiers
	public static final String
		SEPARATOR = "//",
		CHEMIN = "media" + SEPARATOR,
		CHEMINFONDS = CHEMIN + "fonds" + SEPARATOR,
		CHEMINPERSOS = CHEMIN + "personnages" + SEPARATOR,
		CHEMINMURS = CHEMIN + "murs" + SEPARATOR,
		CHEMINBOULES = CHEMIN + "boules" + SEPARATOR,
		CHEMINSONS = CHEMIN + "sons/",
		EXTIMAGE = ".gif" ;

	// images
	public static final String
	FONDCHOIX = CHEMINFONDS + "fondchoix.jpg",	
	FONDARENE = CHEMINFONDS+"fondarene.jpg",
	PERSO = CHEMINPERSOS + "perso",
	BOULE_D = CHEMINBOULES + "boule_d.gif",
	BOULE_G = CHEMINBOULES + "boule_g.gif",
	MISSILE_D = CHEMINBOULES + "missile_d.gif",
	MISSILE_G = CHEMINBOULES + "missile_g.gif",
	EXPLOSION = CHEMINBOULES + "explode.gif",
	MUR = CHEMINMURS + "mur.gif" ;
	
	// sons
	public static final String
	SONPRECEDENT = CHEMINSONS + "precedent.wav", // sur le clic du bouton précédent
	SONSUIVANT = CHEMINSONS + "suivant.wav", // sur le clic du bouton suivant
	SONGO = CHEMINSONS + "go.wav", // sur le clic du bouton go
	SONWELCOME = CHEMINSONS + "welcome.wav", // à l'entrée de la frame ChoixJoueur
	SONAMBIANCE = CHEMINSONS + "ambiance.wav" ; // son d'ambiance dans tout le jeu
	
	public static final Integer
		FIGHT = 0,
		HURT = 1,
		DEATH = 2,
		MISSILE_S = 3;
	public static final String[] 
		SON = {"fight.wav", "hurt.wav", "death.wav", "missile.wav"} ;

	
	// personnages
	public static final int
		GAUCHE = 0,
		DROITE = 1,
		HAUT = 2,
		BAS = 3,
		TIRE = 4,
		SPECIAL = 5,
		NBETATSMARCHE = 4,
		NBETATSBLESSE = 2,
		NBETATSMORT = 2,
		LEPAS = 10, // nombre de pixels de déplacement d'un pas
		NBPERSOS = 4,
		H_MESSAGE = 8,
		H_PERSO = 44,
		L_PERSO = 39 ;
	public static final String
		MARCHE = "marche",
		SHOOT = "tire",
		BLESSE = "touche",
		MORT = "mort" ;
	
	// messages serveurs
	public static final String SEPARE = "~" ;
	public static final int
		PSEUDO = 0,
		CHAT = 1,
		ACTION = 2 ;
	
	// tailles dans frames
	public static final int
		H_ARENE = 600,
		L_ARENE = 800,
		L_CHAT = 200,
		H_SAISIE = 25,
		MARGE = 5 ; // écarts entre les objets
	
	// murs
	public static final int
		NBMURS = 20, // nombre de murs
		H_MUR = 35, // hauteur du mur
		L_MUR = 34 ; // largeur du mur
	
	// boule
	public static final int
	BLAST = 1,
	MISSILE = 2,
	H_BOULE = 17, // hauteur de la boule
	L_BOULE = 17 ; // largeur de la boule
	
	
}
