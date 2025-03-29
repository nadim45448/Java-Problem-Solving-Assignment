public class CountNumberOfWordsCharactersVowelsConsonants {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";

        String [] words = input.split(" ");
        int wordCount = words.length;

        int charCount = input.replace(" ","").length();

        int vowelCount = 0, consonantCount = 0;
        String lowerCaseInput = input.toLowerCase().replace(" ","");
        String vowel = "aeiou";

        for (char ch : lowerCaseInput.toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                vowelCount++;
            }
            else {
                consonantCount++;
            }

        }

        System.out.println("Words: "+wordCount);
        System.out.println("Chars: "+charCount);
        System.out.println("Vowel: "+vowelCount);
        System.out.println("Consonant: "+consonantCount);



    }
}
