public class ElementSearch {

	public String elementSearch(Object[] elements, Object search) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == search) {
				return String.format("Value present at Index %d", i);
			}
		}

		return "Not present";

	}

}

				