/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorgestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */

public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// addieren und die Gesamtsumme zurueckgeben
	public static int sum(final int[] elements){
		int re = 0;
		for (int i: elements) {
			re = re + i;
		}
		
		return re;
	}
	
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		// initialize current max value with first element
		int max = elements[0];
		// set the index of first element
		int tempIndex = 0;
		
		// iterate through array
		for (int i=1; i<elements.length; i++) {
			// check if current element is higher than current max
			if (elements[i] > max) {
				// if current element is higher, current element is new max
				max = elements[i];
				// and current index is new index
				tempIndex = i;
			}
		}
		
		// multiply and return
		return max * tempIndex;
	}
	

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Ubergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements){
		// initialize new array with space for every element twice
		int[] re = new int[elements.length * 2];
		// counter for return array
		int j = 0;
		// iterate through array
		for (int i=0; i<elements.length; i++) {
			// save current value at same position in return array
			re[j] = elements[i];
			j++;
			// and at current position + 1
			re[j] = elements[i];
			j++;
		}
		
		return re;
	}
	
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		int[] re = new int [elements.length];
		for (int i=0; i<elements.length; i++) {
			re[i] = elements[i] * elements[i];
		}
		return re;
	}
	
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void reverseArray(int[] elements){
		// create temp variable to store element to switch
		int temp = 0;
		int l = elements.length;
		// iterate through array until the element in the middle is reached
		// ((int) l / 2) gives half of even numbers
		// 				 and (half - 1) for uneven numbers
		for (int i=0; i<((int) l / 2); i++) {
			// store current value as temp
			temp = elements[i];
			// store last value as first value
			elements[i] = elements[l - i - 1];
			// and first value as last value
			elements[l - i - 1] = temp;
		}
	}

	
	// Hier koennt ihr eure Methoden testen
	public static void main(String[] args) {
		
	}

}
