package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal <P extends Produit> implements IEtal<P> {
	private Gaulois vendeur;
	private P produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	
	public Etal(P produit) {
        this.produit = produit;
    }

    @Override
	public P getProduit() {
        return produit;
    }

	
	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

}
