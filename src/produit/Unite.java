package produit;

public enum Unite {
	    gramme("g"),
	    kilogramme("kg"),
	    litre("l"),
	    centilitre("cl"),
	    millilitre("ml"),
	    piece("piece");
	    private String abrev;

	    Unite(String abrev) {
	        this.abrev = abrev;
	    }

	    @Override
	    public String toString() {
	        return abrev;
	    }
	}

