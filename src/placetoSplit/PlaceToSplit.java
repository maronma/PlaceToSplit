package placetoSplit;

public class PlaceToSplit {

	public boolean canBalance(int[] newTab) {
		int leftSite = 0;
		int rightSite = 0;
		int i;
		int j;
		if (newTab.length == 1){
			return false;}
		for (i = 0, j = newTab.length - 1; i <= j;) {
			if (leftSite <= rightSite) {
				leftSite += newTab[i];
				i++;
			} else {
				rightSite += newTab[j];
				j--;
			}
		}
		return (rightSite == leftSite);
	}

}
