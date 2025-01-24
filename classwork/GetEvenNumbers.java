public class GetEvenNumbers {
    public int getEvens(String anything){
        char[] characters = anything.toCharArray();
        int evenCounter = 0;
        for (char character : characters){
            int temp = 0;
            try {
                temp = Integer.parseInt(Character.toString(character));
            } catch (NumberFormatException e) {
                continue;
            }
            if (temp % 2 == 0) evenCounter++;
        }
        return evenCounter;
    }   
}
